package org.example.Structuralpatteren.CompositePatteren.GoodCode;



public class FileSystemApp {

    public static void main(String[] args) {
        FileComponent file1= new File("File1.txt");
        FileComponent file2= new File("File2.txt");

Folder folder = new Folder("MainFolder");
        folder.addFile(file1);
        folder.addFile(file2);

        //subfolder
        Folder subfolder = new Folder("subFolder");
        FileComponent file3= new File("File3.txt");
        subfolder.addFile(file3);
        folder.addFile(subfolder);
        folder.showDetails();

    }
}
