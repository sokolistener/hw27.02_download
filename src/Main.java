import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static void createDirection (String dirPath, StringBuilder stringBuilder) {
        File dir = new File(dirPath);
        if (dir.mkdir())
            stringBuilder.append(dir.getName() + " каталог создан\n");
    }

    static void createFile (String filePath,String fileName, StringBuilder stringBuilder) {
        File dir = new File(filePath, fileName);
        try {
            if (dir.createNewFile())
                stringBuilder.append(dir.getName() + " файл создан\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        String[] dirArray = new String[] {"D://Games/src", "D://Games/res", "D://Games/savegames", "D://Games/temp", "D://Games/src/main",
                "D://Games/src/test", "D://Games/res/drawables", "D://Games/res/vectors", "D://Games/res/icons"};
        String[] fileNames = new String[] {"Main.java", "Utils.java", "temp.txt"};
        String[] filePath = new String[] {"D://Games/src/main", "D://Games/src/main", "D://Games/temp"};

        for (String dir : dirArray) {
            createDirection(dir, str1);
        }

        for (int i = 0; i < fileNames.length; i++) {
            createFile(filePath[i],fileNames[i], str1);
        }
//
        try (FileWriter writer  = new FileWriter("D://Games/temp/temp.txt")) {
            writer.write(str1.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}