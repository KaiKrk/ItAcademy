package filewriter;

import java.io.*;
import java.util.Scanner;

public class Delete {

    public static void deleteNames(File file, String removeName) {
        try {
            PrintWriter pw = new PrintWriter("output.txt");
            BufferedReader br = new BufferedReader(new FileReader("someFile.txt"));
            String line1 = br.readLine();
            while (line1 != null) {
                boolean flag = false;
                if (line1.contains(removeName)) {
                    flag = true;
                }
                if (!flag)
                    pw.println(line1);
                line1 = br.readLine();
            }
            pw.flush();
            br.close();
            pw.close();
            File oldFile = file;
            oldFile.delete();
            File newFile = new File("output.txt");
            newFile.renameTo(new File("someFile.txt"));
            System.out.println("File operation performed successfully");

        } catch (Exception e) {
        }
    }

}
