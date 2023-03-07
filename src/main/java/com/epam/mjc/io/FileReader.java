package com.epam.mjc.io;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
        BufferedReader out = null;
        try {
            FileInputStream fstream = new FileInputStream(file);
            DataInputStream in = new DataInputStream(fstream);
            out = new BufferedReader(new InputStreamReader(in));

            String nameLine = out.readLine();
            String ageLine = out.readLine();
            String emailLine = out.readLine();
            String phoneLine = out.readLine();
            String name = nameLine.split(": ")[1];
            Integer age = Integer.parseInt(ageLine.split(": ")[1]);
            String email = emailLine.split(": ")[1];
            Long phone = Long.parseLong(phoneLine.split(": ")[1]);
            in.close();
            out.close();
            return new Profile(name, age, email, phone);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new Profile();
    }
}
