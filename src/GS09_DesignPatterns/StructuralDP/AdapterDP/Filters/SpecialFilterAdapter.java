package GS09_DesignPatterns.StructuralDP.AdapterDP.Filters;

import GS09_DesignPatterns.StructuralDP.AdapterDP.Filters.ThirdPartyLibrary.SpecialFilter;

public class SpecialFilterAdapter implements Filter{
    private SpecialFilter specialFilter;
    public SpecialFilterAdapter(SpecialFilter specialFilter) {
        this.specialFilter = specialFilter;
    }
    @Override
    public void apply(Image image){
        specialFilter.applySpecialFilter(image);
    }

}
