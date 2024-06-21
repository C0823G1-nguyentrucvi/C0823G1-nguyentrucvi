package Lam_lai.common;

import Lam_lai.model.Milk;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {


    private final String FILE = "src/Lam_lai/data/milk.csv";

    public List<String> readFromFile(String FILE) {
        List<String> strings = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                strings.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public void writeFile(String FILE, List<String> stringList) {
        try {
            FileWriter fileWriter = new FileWriter(FILE);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Milk> readFileMilk() {
        List<Milk> milk = new ArrayList<>();
        List<String> strings = readFromFile(FILE);
        String[] temp;
        for (String s : strings) {
            temp = s.split(",");
            String name = temp[0];
            String code = temp[1];
            int NXS = Integer.parseInt(temp[2]);
            Milk milks = new Milk(name, code, NXS);
            milk.add(milks);
        }
        return milk;
    }

    public void writeFile(List<Milk> milks) {
        List<String> strings = new ArrayList<>();
        for (Milk s : milks) {
            strings.add(s.toLine());
        }
        writeFile(FILE, strings);
    }

}
