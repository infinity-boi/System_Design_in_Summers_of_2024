package GS09_DesignPatterns.StructuralDP.AdapterDP.Filters;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(Image image){
        System.out.println("Applying BW on "+ image);
    }
}
