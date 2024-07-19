package GS09_DesignPatterns.StructuralDP.DecoratorDP.EditText;

public class ItalicDecorator extends TextDecorator{
        public ItalicDecorator(TextComponent text){
            super(text);
        }
        @Override
        public String format() {
            return "<i>"+ super.format()+ "</i>";
        }
}
