package com.example.clientchat.history;

import java.io.*;

public class History {


    public static boolean saveHistory(String text) {
        File history = new File("history.txt");
        if(!history.exists()){
            try{
                if (!history.createNewFile()){
                    return false;
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

        String fileName = "history.txt";
        File userHistory = new File(fileName);

        try {
            PrintWriter fileWriter = new PrintWriter(new FileWriter(userHistory, true));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }


}
