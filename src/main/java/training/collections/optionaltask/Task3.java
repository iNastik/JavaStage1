package training.collections.optionaltask;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        File mainFile = new File("C:\\Test");
        File[] arrayFiles = mainFile.listFiles();
        List<File> fileList = new ArrayList<>(Arrays.asList(arrayFiles));

        for (int i = 0; i < fileList.size(); i++) {
            File file = fileList.get(i);
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                fileList.addAll(Arrays.asList(files));
            }
        }

        for (File file : fileList) {
            System.out.println(file.getName());
        }
    }
}
