package GS09_DesignPatterns.StructuralDP.DecoratorDP.EditText;

public class PlainText implements TextComponent{
    private String text;

    PlainText(String text){
        this.text = text;
    }

    @Override
    public String format() {
        return text;
    }
}
