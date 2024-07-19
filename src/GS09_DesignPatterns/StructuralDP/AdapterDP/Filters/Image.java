package GS09_DesignPatterns.StructuralDP.AdapterDP.Filters;

public class Image {
    private String name;
    public Image(String name) {
        this.name = name;
    }
    public String getName() {return name;}

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
