package IBuilder;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;

public abstract class IExcelBuilder {
    protected InputStream fis;

    //根据文件后缀得到文件对应的类
    public abstract Workbook getHandleApplication(String extension, InputStream inputStream);
}
