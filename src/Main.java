import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        String folderPath = "C:\\Users\\Иван\\Desktop";
        File file = new File(folderPath);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("Date: " + formatter.format(new Date()));

        System.out.println(file.length());
        System.out.println("= ");
        System.out.println(getFolderSize(file));





    }
    public static long getFolderSize(File folder){
        if (folder.isFile()){
            return folder.length();
        }
        long sum = 0;
        File[] files = folder.listFiles();
        for(File file : files){
            sum += getFolderSize(file);
        }
        return  sum;
    }
}
