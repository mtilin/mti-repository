import CommonUtil.ConfigReader;
import CommonUtil.InputStreamFactory;
import Director.Director;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        Workbook wb = Director.build();

        Sheet sheet = wb.getSheetAt(0);

        int firstRowIndex = sheet.getFirstRowNum();
        int lastRowIndex = sheet.getLastRowNum();

        for (int rowIndex =  firstRowIndex;rowIndex<=lastRowIndex;rowIndex++){
            Row row = sheet.getRow(rowIndex);
            if (row!=null){
                int firstCellIndex = row.getFirstCellNum();
                int lastCellIndex = row.getLastCellNum();
                for (int columnIndex = firstCellIndex;columnIndex<lastCellIndex;columnIndex++){
                    Cell cell = row.getCell(columnIndex);
                    System.out.print(cell.toString()+"\t");
                }
            }
            System.out.print("\n");
        }

    }
}
