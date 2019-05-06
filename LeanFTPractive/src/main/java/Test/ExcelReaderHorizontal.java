package Test;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class ExcelReaderHorizontal {

    public static final String EXCELFILELOCATION = "D:\\ExcelFileH.xlsx";

    private static FileInputStream fis;
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFRow row;

    public static void loadExcel() throws Exception {
        System.out.println("Loading Excel Data...");
        File file = new File(EXCELFILELOCATION);
        fis = new FileInputStream(file);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet("TestData");
        fis.close();
    }

    public static Map<String, Map<String, String>> getDataMap() throws Exception {
        if (sheet == null) {
            loadExcel();
        }

        Map<String, Map<String, String>> superMap = new HashMap<String, Map<String, String>>();
        Map<String, String> myMap = new HashMap<String, String>();

        /*for (int i = 0; i < row.getLastCellNum() - 1; i++) {
            row = sheet.getRow(i);
            String keyCell = row.getCell(0).getStringCellValue();
            int colNum = row.getLastCellNum();
            for (int j = 1; j < colNum; j++) {
                String value = row.getCell(j).getStringCellValue();
                myMap.put(keyCell, value);
            }
            superMap.put("MASTERDATA", myMap);
        }*/

        for (int i = 0; i < row.getLastCellNum(); i++) {
            String keyCell = row.getCell(i).getStringCellValue();

            int rowNum = sheet.getLastRowNum();
            for (int j = 0; j < rowNum - 1; j++) {
                String value = row.getCell(j).getStringCellValue();
                myMap.put(keyCell, value);
            }
            superMap.put("MASTERDATA", myMap);
        }

        return superMap;
    }

    public static String getValue(String key) throws Exception {
        Map<String, String> myVal = getDataMap().get("MASTERDATA");
        String retValue = myVal.get(key);

        return retValue;
    }


    public static void main(String[] args) {
        try {
            System.out.println(getValue("baseUrl"));
            System.out.println(getValue("username"));
            System.out.println(getValue("password"));
            System.out.println(getValue("firstName"));
            System.out.println(getValue("lastName"));
            System.out.println(getValue("Address"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


