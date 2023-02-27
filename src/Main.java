import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();

        File dir1 = new File("D://Games/src");
        if (dir1.mkdir())
            str1.append(dir1.getName() + " каталог создан\n");
            //System.out.println(dir1.getName() + "каталог создан\n");

        File dir2 = new File("D://Games/res");
        if (dir2.mkdir())
            str1.append(dir1.getName() + " каталог создан\n");
        File dir3 = new File("D://Games/savegames");
        if (dir3.mkdir())
            str1.append(dir1.getName() + " каталог создан\n");
        File dir4 = new File("D://Games/temp");
        if (dir4.mkdir())
            str1.append(dir1.getName() + " каталог создан\n");

        File dir11 = new File("D://Games/src/main");
        if (dir11.mkdir())
            str1.append(dir1.getName() + " каталог создан\n");
        File dir12 = new File("D://Games/src/test");
        if (dir12.mkdir())
            str1.append(dir1.getName() + " каталог создан\n");

        File dir111 = new File("D://Games/src/main", "Main.java");
        try {
            if (dir111.createNewFile())
                str1.append(dir111.getName() + " файл создан\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File dir112 = new File("D://Games/src/main","Utils.java");
        try {
            if (dir112.createNewFile())
                str1.append(dir112.getName() + " файл создан\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File dir21 = new File("D://Games/res/drawables");
        if (dir21.mkdir())
            str1.append(dir1.getName() + " каталог создан\n");
        File dir22 = new File("D://Games/res/vectors");
        if (dir22.mkdir())
            str1.append(dir1.getName() + " каталог создан\n");
        File dir23 = new File("D://Games/res/icons");
        if (dir23.mkdir())
            str1.append(dir1.getName() + " каталог создан\n");


        File dir41 = new File("D://Games/temp","temp.txt");
        try {
            if (dir41.createNewFile())
                str1.append(dir41.getName() + " файл создан\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        try (FileWriter writer  = new FileWriter("D://Games/temp/temp.txt")) {
            writer.write(str1.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}