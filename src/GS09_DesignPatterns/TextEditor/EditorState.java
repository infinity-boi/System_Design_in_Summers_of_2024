package GS09_DesignPatterns.TextEditor;

public class EditorState {
    String content;
    String title;

    EditorState(String content,String title){
        this.content = content;
        this.title = title;
    }
}
