package filewriter;

import java.io.File;

public class WriteNameInFIle {

    public static void main(String[] args) {
        String name, removeName;
        String age;
        name = "Piotr";
        age = "30";
        File file = new File("someFile.txt");
        try {
            Addnames.writeNames(file, name, age);
        } catch (Exception e) {
            System.out.println("An error has occured");
        }
        removeName ="Marcin";
        try {
            Delete.deleteNames(file, removeName);
        } catch (Exception e) {
            System.out.println("An error has occured");
        }
    }


}
