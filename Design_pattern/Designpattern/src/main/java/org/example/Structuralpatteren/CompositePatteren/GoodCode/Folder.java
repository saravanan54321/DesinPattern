package org.example.Structuralpatteren.CompositePatteren.GoodCode;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    String name;

    List<FileComponent> components = new ArrayList<>();

    public Folder(String name){
        this.name=name;
    }



    public  void addFile(FileComponent component){
        components.add(component);

    }

    public  void showDetails(){
        System.out.println("Folder "+name);
        for (FileComponent component:components){
           component.showDetails();
        }
    }

}
