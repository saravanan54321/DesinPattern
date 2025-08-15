package org.example.Behaviouralpattern.MomentoPattern;

public class TextEditor {

    private String content;

    public  void write(String content){
        this.content=content;


    }

    // saving the content to editorMemento;

    public  EditorMomento save(){
        // mela content set agirukum atha than enga use panurom
        return  new EditorMomento(content);


    }

    // restore
    public void restore(EditorMomento momento){
        content=momento.getContent();
    }

    public String getContent() {
        return content;
    }


}
