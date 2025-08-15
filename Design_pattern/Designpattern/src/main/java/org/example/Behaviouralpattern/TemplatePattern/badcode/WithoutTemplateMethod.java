package org.example.Behaviouralpattern.TemplatePattern.badcode;

class CsvPraser {

public void parse(){
    openfile();
    // here csv parsinng s[ecific logic
    System.out.println("Parsing a csv file");

    closefile();
}

    private void closefile() {
    }

    private void openfile() {
    }


}

class JsonParser {

    public void parse(){
        openfile();
        // here json parsinng s[ecific logic
        System.out.println("Parsing a json file");

        closefile();
    }

    private void closefile() {
    }

    private void openfile() {
    }


}


public class WithoutTemplateMethod{




    public static void main(String[] args) {

        CsvPraser csv = new CsvPraser();
        csv.parse();
        JsonParser json = new JsonParser();
        json.parse();

    }
}