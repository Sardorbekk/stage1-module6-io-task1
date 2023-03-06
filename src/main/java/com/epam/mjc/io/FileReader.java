package com.epam.mjc.io;

import java.io.*;
import java.util.HashMap;


public class FileReader {

    public Profile getDataFromFile(File file) {
        try {

            FileInputStream fstream=new FileInputStream("C:\\Users\\Sardor.me\\IdeaProjects\\stage1-module6-io-task1\\src\\main\\resources\\Profile.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader out=new BufferedReader(new InputStreamReader(in));
            String strLine;


            while ((strLine=out.readLine())!=null){
                System.out.println(strLine);
            }
         in.close();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new Profile();
    }
}
