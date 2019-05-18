package Director;

import CommonUtil.ConfigReader;
import CommonUtil.ExtensionHandler;
import CommonUtil.InputStreamFactory;
import ConcreteBuilder.ExcelBuilder;
import IBuilder.IExcelBuilder;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.InputStream;

public class Director {
    public static Workbook build(){
        String ExcelPath = ConfigReader.readConfigFile();
        InputStream fis = InputStreamFactory.readExcelFile(ExcelPath);
        String extension = ExtensionHandler.getExtension(ExcelPath);

        IExcelBuilder eb = new ExcelBuilder();
        Workbook wb = eb.getHandleApplication(extension,fis);

        return wb;
    }

}
