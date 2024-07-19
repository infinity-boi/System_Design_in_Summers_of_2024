package GS09_DesignPatterns.StructuralDP.DecoratorDP.EditText;

public class UnderLineDecorator extends TextDecorator {
    public UnderLineDecorator(TextComponent text){
        super(text);
    }
    @Override
    public String format() {
        return "<u>"+ super.format()+ "</u>";
    }
}
