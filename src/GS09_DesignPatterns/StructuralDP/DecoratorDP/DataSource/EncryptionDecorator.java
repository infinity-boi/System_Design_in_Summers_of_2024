package GS09_DesignPatterns.StructuralDP.DecoratorDP.DataSource;

import java.util.Base64;

class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encode(data);
        wrappee.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String data = wrappee.readData();
        return decode(data);
    }

    private String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    private String decode(String data) {
        return new String(Base64.getDecoder().decode(data));
    }
}

