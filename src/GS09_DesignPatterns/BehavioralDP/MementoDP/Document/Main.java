package GS09_DesignPatterns.BehavioralDP.MementoDP.Document;

//1. Memento Pattern (UNDO in Text Editor)
//In the Exercises project, look at the code in the memento/Document class. This class represents a document in a word processor like MS Word or Apple Pages. Our Document class has three attributes: -content -fontName -fontSize We should allow the user to undo the changes to any of these attributes. In the future, we may add additional attributes in this class and these attributes should also be undoable. Implement the undo feature using the memento pattern.


public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        History history = new History();

        document.setContent("Hello");
        history.save(document);

        document.setFontName("Arial");
        history.save(document);

        document.setFontSize(12);
        history.save(document);

        document.setFontSize(25);
        history.save(document);


        System.out.println(document); // Document{content='Hello', fontName='Arial', fontSize=25}

        history.undo(document);
        System.out.println(document); // Document{content='Hello', fontName='Arial', fontSize=12}

        history.undo(document);
        System.out.println(document); // Document{content='Hello', fontName='Aerial', fontSize=0}

        history.undo(document);
        System.out.println(document); // Document{content='Hello', fontName='null', fontSize=0}

        history.undo(document);
        System.out.println(document); // Document{content='null', fontName='null', fontSize=0}
    }
}

