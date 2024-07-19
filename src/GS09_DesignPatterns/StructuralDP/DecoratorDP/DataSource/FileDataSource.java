package GS09_DesignPatterns.StructuralDP.DecoratorDP.DataSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        try {
            Files.write(Paths.get(filename), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        try {
            return new String(Files.readAllBytes(Paths.get(filename)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

