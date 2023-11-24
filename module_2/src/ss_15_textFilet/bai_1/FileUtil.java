package ss_15_textFilet.bai_1;

import java.io.*;

public class FileUtil {
    private static final String FILE_PATH = "D:\\codegym\\C0823G1-nguyentrucvi\\module_2\\src\\ss_15_textFilet\\bai_1\\ListMilk.csv";
    private static final String FILE_TARGET="D:\\codegym\\C0823G1-nguyentrucvi\\module_2\\src\\ss_15_textFilet\\bai_1\\targer_file.csv";

    public static String readCSV(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String temp = "";
        String line ;
        while ((line = bufferedReader.readLine()) != null) {
            temp += line+"\n";

        }
        bufferedReader.close();
        return temp;
    }

    public static void WriteCSV(String temp, String file_target) throws IOException {
        FileWriter fileWriter=new FileWriter(file_target);
        BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
        bufferedWriter.write(temp);
        bufferedWriter.close();
    }

    public static void main(String[] args)  {
       try {
           System.out.println(readCSV(FILE_PATH));
           WriteCSV(readCSV(FILE_PATH), FILE_TARGET);
       } catch (IOException e){
           System.out.println("không tìm thấy");
       }
    }


}
