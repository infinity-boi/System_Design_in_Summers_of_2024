package GS09_DesignPatterns.StructuralDP.DecoratorDP.DataSource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data);
        wrappee.writeData(compressedData);
    }

    @Override
    public String readData() {
        String data = wrappee.readData();
        return decompress(data);
    }

    private String compress(String data) {
        byte[] input = data.getBytes();
        byte[] output = new byte[100];
        Deflater compresser = new Deflater();
        compresser.setInput(input);
        compresser.finish();
        int compressedDataLength = compresser.deflate(output);
        compresser.end();
        return new String(output, 0, compressedDataLength);
    }

    private String decompress(String data) {
        byte[] input = data.getBytes();
        Inflater decompresser = new Inflater();
        decompresser.setInput(input);
        byte[] result = new byte[100];
        int resultLength = 0;
        try {
            resultLength = decompresser.inflate(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        decompresser.end();
        return new String(result, 0, resultLength);
    }
}

