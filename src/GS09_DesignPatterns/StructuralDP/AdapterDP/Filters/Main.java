package GS09_DesignPatterns.StructuralDP.AdapterDP.Filters;

import GS09_DesignPatterns.StructuralDP.AdapterDP.Filters.ThirdPartyLibrary.SpecialFilter;

public class Main {
    public static void main(String[] args){
        Image img = new Image("Dog.jpg");

        Filter bwFilter = new BlackAndWhiteFilter();
        bwFilter.apply(img);

        Filter vividFilter = new VividFilter();
        vividFilter.apply(img);

        Filter specialFilterAdapter = new SpecialFilterAdapter(new SpecialFilter());
        specialFilterAdapter.apply(img);

        // SpecialFilter specialFilter = new SpecialFilter();
        // specialFilter.applySpecialFilter(img);
    }
}
