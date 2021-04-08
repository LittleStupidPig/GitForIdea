package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Analyse {
    public static void main(String[] args) {
        File file = new File("C:/Users/斯/Desktop/test", "20210218_600111.txt");
        ReadFile(file);
    }

    public static void ReadFile(File file) {
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)
        ) {
            while (true) {
                if(br.readLine()==null)
                    break;
                String line = br.readLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
