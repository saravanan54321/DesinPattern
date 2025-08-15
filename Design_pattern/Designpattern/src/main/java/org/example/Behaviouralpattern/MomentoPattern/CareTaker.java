package org.example.Behaviouralpattern.MomentoPattern;

import java.util.Stack;

public class CareTaker {
  // private is for - this class only uses private variable history
   private final Stack<EditorMomento> history = new Stack<>();

   //we can  get editorMomento object of the content
   public void saveState(TextEditor ed){
       history.push(ed.save());
   }

   public  void undo(TextEditor editor){
       if(!history.empty()){
           // removed the recently added element
           // removed B
           // takes the top of the element
           // takes the top of the element
           history.pop();

           // A only left it gives A
           // stored in text editor
           editor.restore(history.peek());

       }
   }

}
