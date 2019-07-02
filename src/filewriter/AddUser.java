package filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Addnames {
    public static void writeNames(File file, String name, String age) throws IOException {
        FileWriter fw = new FileWriter("someFile.txt", true);
        PrintWriter printWriter = new PrintWriter(fw);
        printWriter.println(name + "," + age);
        printWriter.close();
    }

}
