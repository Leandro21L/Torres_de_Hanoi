package co.edu.uptc.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FileManager {

    private HashMap<String, Integer> list;
    private BufferedReader reader;
    private String csvPath = "./difficulty.csv";

    public FileManager() {
    }

    public HashMap<String, Integer> readData() {
        try {
            reader = new BufferedReader(new FileReader(csvPath));
            list = new HashMap<>();
            String line = reader.readLine();
            while (line != null) {
                String[] data = line.split(";");
                list.put(data[0], Integer.parseInt(data[1]));
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}