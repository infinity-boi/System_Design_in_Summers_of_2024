package GS09_DesignPatterns.StructuralDP.AdapterDP.Filters;

public class VividFilter implements Filter{

    @Override
    public void apply(Image image) {
        System.out.println("Applying Vivid on "+image);
    }
}