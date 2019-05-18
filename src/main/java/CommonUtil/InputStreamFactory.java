package CommonUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamFactory {
    /***
     * return inputstream by reading file according to path
     * @param path file path
     * @return inputstream
     */
    public static InputStream readExcelFile(String path){
        InputStream in = null;
        try {
            in = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Unable to find excel_file by designative path.");
        }
        return in;
    }
}
