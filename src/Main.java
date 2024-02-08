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



    }
}
