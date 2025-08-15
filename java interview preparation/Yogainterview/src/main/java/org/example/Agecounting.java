package org.example;

import java.util.*;
import java.io.*;
import java.net.*;
import java.util.regex.*;

public class Agecounting {

    void Countage(){
        System.setProperty("http.agent", "Chrome");
        try {
            //creating URl objects
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            try {
                // creating connection to the url
                URLConnection connection = url.openConnection();
                //Opens an input stream to read data from the server.
                InputStream inputStream = connection.getInputStream();
                // to convert the raw byte stream into a character stream (useful for text data).
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                // to allow efficient reading of the text data,
                // chunks the data read line by line.
                BufferedReader bufferedReader = new  BufferedReader(inputStreamReader);
                String thisLine;
                while ((thisLine = bufferedReader.readLine()) != null) {
                    //input {"data":"key=IAfpK, age=58, key=WNVdi, age=64, key=jp9zt
                    //output
                    //0={"data"
                    //1="key=IAfpK, age=58, key=WNVdi, age=64, key=jp9zt
                    String[] strings = thisLine.split(":");
                    // replace all will removes "} this pattren . replace will removes this " also
                    // output -key=IAfpK, age=58, key=WNVdi, age=64, key=jp9zt,

                    //differenc between replace all -regex etha use pananum
                    // and replace- normal character or character sequence etha use pananum

                    String parsedString = strings[1].replaceAll("\"}","").replace("\"","");
                    //input -key=IAfpK, age=58, key=WNVdi, age=64, key=jp9zt,
                    //output -["key=IAfpK", " age=58", " key=WNVdi", " age=64", " key=jp9zt",
                    String[] keyValues = parsedString.split(",");
                    // if you split with =  age is [0] , 58 [1]
                    // and count how many of this more than or equal to 50
                    System.out.println(Arrays.stream(keyValues).filter(s -> s.contains("age") && Integer.parseInt(s.split("=")[1]) >= 50).count());
                }
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
    }

}

