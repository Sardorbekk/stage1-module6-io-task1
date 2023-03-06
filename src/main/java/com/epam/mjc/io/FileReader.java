package com.epam.mjc.io;

import java.io.*;



public class FileReader {

    public Profile getDataFromFile(File file)  {
        DataInputStream in = null;
        BufferedReader out = null;
        try {

            FileInputStream fstream=new FileInputStream(file);
             in = new DataInputStream(fstream);
             out=new BufferedReader(new InputStreamReader(in));
            String strLine;


            while ((strLine=out.readLine())!=null){
                System.out.println(strLine);
            }

        } catch (IOException e) {

            e.getMessage();
        }
        finally {


            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return new  Profile();
    }
}
