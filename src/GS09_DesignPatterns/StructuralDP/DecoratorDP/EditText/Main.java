package GS09_DesignPatterns.StructuralDP.DecoratorDP.EditText;

public class Main {
    public static void main(String[] args) {
//        hello world!
        TextComponent t = new PlainText("hello word!");
        System.out.println(t.format());

//        <b> hello word! </b>
        TextComponent boldText = new BoldDecorator(t);
        System.out.println(boldText.format());

//        <i>hello word!</i>
        TextComponent italicText = new ItalicDecorator(t);
        System.out.println(italicText.format());

//        <i><b>Lets learn something</b></i>
        TextComponent text = new ItalicDecorator(new BoldDecorator(new PlainText("Lets learn something")));

//        <u><i><b>Lets learn something</b></i></u>
        TextComponent underlinedText = new UnderLineDecorator(text);
        System.out.println(text.format());
        System.out.println(underlinedText.format());
    }
}


