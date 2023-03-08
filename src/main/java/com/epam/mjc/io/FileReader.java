package com.epam.mjc.io;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
          try(java.io.FileReader fileReader=new java.io.FileReader(file);
              BufferedReader bufferedReader=new BufferedReader(fileReader)
          ) {
              String nameLine = bufferedReader.readLine();
              String ageLine = bufferedReader.readLine();
              String emailLine = bufferedReader.readLine();
              String phoneLine = bufferedReader.readLine();
              String name = nameLine.split(": ")[1];
              Integer age = Integer.parseInt(ageLine.split(": ")[1]);
              String email = emailLine.split(": ")[1];
              Long phone = Long.parseLong(phoneLine.split(": ")[1]);

              return new Profile(name, age, email, phone);


          } catch (FileNotFoundException e) {
              e.printStackTrace();
          } catch (IOException e) {
              e.printStackTrace();
          }




















        /*try {
             fstream = new FileInputStream(file);
             in = new DataInputStream(fstream);
            out = new BufferedReader(new InputStreamReader(in));

            String nameLine = out.readLine();
            String ageLine = out.readLine();
            String emailLine = out.readLine();
            String phoneLine = out.readLine();
            String name = nameLine.split(": ")[1];
            Integer age = Integer.parseInt(ageLine.split(": ")[1]);
            String email = emailLine.split(": ")[1];
            Long phone = Long.parseLong(phoneLine.split(": ")[1]);

            return new Profile(name, age, email, phone);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                 in.close();
                out.close();
            } catch (NullPointerException | IOException e) {
                e.printStackTrace();
            }
        }*/

        return new Profile();
    }
    }

