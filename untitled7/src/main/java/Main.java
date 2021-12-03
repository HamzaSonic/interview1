import java.io.File;
import java.util.HashMap;
import java.util.Map;

//count the number of files in specific directory and if the file is xsd file do something and if it is doc file do another thing

public class Main {

    public static void main(String[] args) {
        File file =new File("path");
        if (!file.isDirectory()) {
            System.out.println(0);
            return;
        }
        int count =countInDirectory(file);
        System.out.println(count);
    }

    public static int countInDirectory(File file){
        int count = 0;
        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory())
                countInDirectory(file);
            else{
                String name = file.getName().substring(file.getName().length()-4);
                Filat filat =FilatFactory.getFile(name);
                filat.doSomething();
            }
            //factory design pattern and strategy

        }
        return count;
    }

}
