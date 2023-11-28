package ss_15_textFilet.bai_1;

import java.io.*;

public class FileUtil {
    private static final String FILE_PATH = "D:\\codegym\\C0823G1-nguyentrucvi\\module_2\\src\\ss_15_textFilet\\bai_1\\ListMilk.csv";
    private static final String FILE_TARGET = "D:\\codegym\\C0823G1-nguyentrucvi\\module_2\\src\\ss_15_textFilet\\bai_1\\targer_file.csv";

    public static String readCSV(String filePath) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String temp = "";

        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                temp += line + "\n";
            }

        } catch (IOException e) {
            System.out.println("file not found");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("file not found");
            }
        }
        return temp;
    }

    public static void WriteCSV(String temp, String file_target) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file_target);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(temp);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
        }


    public static void main(String[] args) {
        try {
            System.out.println(readCSV(FILE_PATH));
            WriteCSV(readCSV(FILE_PATH), FILE_TARGET);
        } catch (RuntimeException e) {
            System.out.println("không tìm thấy");
        }
    }


}
