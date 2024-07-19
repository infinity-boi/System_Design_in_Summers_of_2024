package GS09_DesignPatterns.StructuralDP.DecoratorDP.EditText;

public abstract class TextDecorator implements TextComponent{

    protected TextComponent text;

    public TextDecorator(TextComponent text){
        this.text = text;
    }

    @Override
    public String format() {
        return text.format();
    }
}
