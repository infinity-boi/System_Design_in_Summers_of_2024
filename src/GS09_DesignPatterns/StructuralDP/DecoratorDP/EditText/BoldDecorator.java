package GS09_DesignPatterns.StructuralDP.DecoratorDP.EditText;

public class BoldDecorator extends TextDecorator{
    public BoldDecorator(TextComponent text){
        super(text);
    }
    @Override
    public String format() {
        return "<b>"+ super.format()+ "</b>";
    }
}
