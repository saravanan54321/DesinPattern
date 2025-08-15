package org.example.Structuralpatteren.CompositePatteren.Badcode;

public class File {

    String name;
    File(String Name){
       this.name=Name;
    }

    public String showDetails(){
        return ("File :"+name);
    }
}
