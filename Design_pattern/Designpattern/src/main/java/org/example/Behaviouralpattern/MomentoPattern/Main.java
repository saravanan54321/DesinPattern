package org.example.Behaviouralpattern.MomentoPattern;

// text editor class ha  ha vaiable mathiri use panikuren
// edhula  data varum atha editorMomento class la set panirukan
// antha editorMomento object ha stack la store panikuren
//stack la ertunthu editor momento object ha eduthu atha text editor class ku assign pani
// value ha pakuren
// vara data ha va  text editor mulayama vangi editorMomento la wrap pani  stack la poturan
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker ct = new CareTaker();
        editor.write("A");
        ct.saveState(editor);

        editor.write("B");
        ct.saveState(editor);

        editor.write("C");
        ct.saveState(editor);

        ct.undo(editor);
       // ct.undo(editor);

        System.out.println(editor.getContent());

    }
}