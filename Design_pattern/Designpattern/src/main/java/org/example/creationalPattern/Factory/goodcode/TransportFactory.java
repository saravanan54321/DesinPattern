package org.example.creationalPattern.Factory.goodcode;

public class TransportFactory {


    public  static Transport createTransport(String type){

        switch (type.toLowerCase()){

            case "car":
                return  new car();

            case "bus":
                return new bus();
            default:
                throw new IllegalArgumentException("unsupported transport type");
        }
    }
}
