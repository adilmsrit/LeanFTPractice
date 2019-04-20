package TempTest;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadExcelFile {
    String fileLocation = "D:\\adil.xlsx";

    FileInputStream file = new FileInputStream(new File(fileLocation));
    Workbook workbook = new XSSFWorkbook(file);
    Sheet sheet = workbook.getSheetAt(0);

    Map<Integer, List<String>> data = new HashMap<>();
    int i = 0;

    public ReadExcelFile() throws IOException {
    }


    public void readExcel() {
        for (Row row : sheet) {
            data.put(i, new ArrayList<String>());
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.println("Its a string");

                        break;
                    case NUMERIC:
                        System.out.println("Its numeric");
                        break;
                    case BOOLEAN:
                        System.out.println("Its Boolean");
                        break;
                    case FORMULA:
                        System.out.println("Its formula");
                        break;
                    default:
                        data.get(new Integer(i)).add(" ");
                }
            }
            i++;

        }

    }

    public static void main(String[] args) throws IOException {
        ReadExcelFile readExcelFile = new ReadExcelFile();

        readExcelFile.readExcel();

    }

}
