import java.io.File;

public class FR {
    public static void main(String[] args) {
        File f = new File("../inf403/File.md");

        boolean result = f.renameTo(new File("File.md"));
        System.out.println(result);

    }
}
