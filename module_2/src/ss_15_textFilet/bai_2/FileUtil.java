package ss_15_textFilet.bai_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_PATH = "D:\\codegym\\C0823G1-nguyentrucvi\\module_2\\src\\ss_15_textFilet\\bai_2\\Nation_file.csv";

    public static List<Nation> readCSV() throws IOException {
        List<Nation> nations = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] arr;
        while ((line = bufferedReader.readLine()) != null) {
            arr = line.split(",");
            int id = Integer.parseInt(arr[0]);
            String code = arr[1];
            String name = arr[2];
            Nation nation = new Nation(id, code, name);
            nations.add(nation);

        }
        bufferedReader.close();
        return nations;
    }

    public static void main(String[] args) {
        try {
            List<Nation> Nations = readCSV();

            for (Nation nation : Nations) {
                System.out.println(nation);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

