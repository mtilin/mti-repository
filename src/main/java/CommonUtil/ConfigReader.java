package CommonUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    /***
     * reading pre-handle xlsx path from config_file
     * @return xlsxPath User's pre-handle xlsx path
     */
    public static String readConfigFile(){
        //user's pre-handle xlsx path
        String xlsxPath=null;

        //load file inputstream into Properties instance
        Properties p = new Properties();
        InputStream in = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties");
        try {
            p.load(in);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to find config_file in /src.");
        }

        //get parameter from config_file
        try {
            xlsxPath = p.getProperty("XlsxPath");
        }catch (Exception e){
            System.out.println("Unable to find XlsxPath properties in config_file.");
        }

        return xlsxPath;
    }


}
