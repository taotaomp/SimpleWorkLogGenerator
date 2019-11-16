import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testProperties {
    @Test
    public void test() throws IOException {
        File file = new File("a.txt");
        file.createNewFile();
//        Properties properties = new Properties();
//        properties.load(new FileInputStream("./"));
    }
}
