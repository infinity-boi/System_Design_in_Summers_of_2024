package GS09_DesignPatterns.StructuralDP.AdapterDP.Filters.ThirdPartyLibrary;

import GS09_DesignPatterns.StructuralDP.AdapterDP.Filters.Image;

public class SpecialFilter {
    public void applySpecialFilter(Image image) {
        System.out.println("Applying Special Filter on "+ image);
    }
}
