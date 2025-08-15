package org.example.Structuralpatteren.CompositePatteren.GoodCode;

public class File implements FileComponent {

    String name;
    File(String Name){
       this.name=Name;
    }

    public void showDetails(){
        System.out.println("File "+name);
    }
}
