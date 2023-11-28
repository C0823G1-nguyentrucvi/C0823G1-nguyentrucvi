package ss_15_textFilet.bai_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_PATH = "D:\\codegym\\C0823G1-nguyentrucvi\\module_2\\src\\ss_15_textFilet\\bai_2\\Nation_file.csv";

    public static List<Nation> readCSV() throws RuntimeException {
        List<Nation> nations = new ArrayList<>();
        Nation nation;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String[] tempStr;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null){
                 tempStr = temp.split(",");
                nation = new Nation(Integer.parseInt(tempStr[0]), tempStr[1], tempStr[2]);
                nations.add(nation);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return nations;
    }

    public static void main(String[] args) {
        try {
            List<Nation> Nations = readCSV();

            for (Nation nation : Nations) {
                System.out.println(nation);
            }
        } catch (RuntimeException e) {
            System.out.println("không tìm thấy");
        }
    }
}

