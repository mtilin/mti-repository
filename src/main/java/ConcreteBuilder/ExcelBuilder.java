package ConcreteBuilder;

import IBuilder.IExcelBuilder;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;

public class ExcelBuilder extends IExcelBuilder {

    //继承了父类的文件输入流:fis

    public Workbook getHandleApplication(String extension, InputStream inputStream) {
        try {
            this.fis = inputStream;

            if ("xls".equals(extension))
                return new HSSFWorkbook(fis);
            else if("xlsx".equals(extension))
                return new XSSFWorkbook(fis);
            else
                System.out.println("Only support file ending by xls/xlsx.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
