package org.example.Structuralpatteren.CompositePatteren.Badcode;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    String name;

    List<File> files = new ArrayList<>();

    public Folder(String name){
        this.name=name;
    }



    public  void addFile(File file){
        files.add(file);

    }

    public  void showDetails(){
        System.out.println("Folder"+name);
        for (File file:files){
            System.out.println(file.showDetails());
        }
    }

}
