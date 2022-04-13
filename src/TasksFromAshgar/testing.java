package TasksFromAshgar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testing {
        public static void main(String[] args) {
            String filePath = System.getProperty("user.dir") +
                    "/configs/FileReading.properties";
            try {
                FileInputStream fis = new FileInputStream(filePath);
                Properties prop = new Properties();
                prop.load(fis);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Ending code");
        }
    }