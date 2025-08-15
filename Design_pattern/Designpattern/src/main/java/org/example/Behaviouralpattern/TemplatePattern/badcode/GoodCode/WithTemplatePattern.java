package org.example.Behaviouralpattern.TemplatePattern.badcode.GoodCode;


abstract  class DataParse{

    //subclass cant override this method
    public final  void parse(){

        openFile();
        parseData();
        closeFile();
    }

    void openFile(){
        System.out.println("opening file");
    }

    void closeFile(){
        System.out.println("closing file");
    }

    abstract void  parseData();

}


class csv extends DataParse{

    @Override
    void parseData() {
        System.out.println("parsing csv data");
    }
}

class jspn extends DataParse{

    @Override
    void parseData() {
        System.out.println("json csv data");
    }
}



public class WithTemplatePattern {

    public static void main(String[] args) {
        DataParse dp = new csv();
        DataParse json = new jspn();
        dp.parse();
        json.parse();
    }
}
