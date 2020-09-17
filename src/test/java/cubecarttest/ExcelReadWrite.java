package cubecarttest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.List;

public class ExcelReadWrite {
    public String excelRead(String fileName, String sheetName, int rowNumber, int cellNumber)
    {
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        XSSFWorkbook workbook=null;
        try {
            workbook=new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        XSSFSheet sheet=workbook.getSheet(sheetName);

        int totalRow=sheet.getLastRowNum();

        XSSFRow row=sheet.getRow(rowNumber);
        String cellValue=null;
        try {
            XSSFCell cell = row.getCell(cellNumber);
            cellValue = cell.getStringCellValue();
        }catch (NullPointerException e) {

        }
        return cellValue;

    }

    public String readMultipleCell(String fileName,String sheetName) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        XSSFWorkbook workbook=null;
        try {
            workbook=new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        XSSFSheet sheet=workbook.getSheet(sheetName);
        int lastRow=sheet.getLastRowNum();
        String cellValue=null;
        for(int i=1;i<=lastRow;i++)
        {
            XSSFRow row=sheet.getRow(i);
            XSSFCell cell=row.getCell(1);
            cellValue=cell.getStringCellValue();
            System.out.println(cellValue);
        }
        return cellValue;

    }

    public void productsWrite(String fileName, String sheeName, List<String> products)
    {
        File excelFile=new File(fileName);

        XSSFWorkbook workbook=new XSSFWorkbook();


        XSSFSheet sheet=workbook.createSheet(sheeName);
        int totalRow=products.size();

        for(int rowNumber=0;rowNumber<totalRow;rowNumber++)
        {
            String[] productsContent=products.get(rowNumber).split(",");

            XSSFRow row=sheet.createRow(rowNumber);
            for(int cellNumber=0;cellNumber< productsContent.length;cellNumber++)
            {
                XSSFCell cell = row.createCell(cellNumber);
                cell.setCellValue(productsContent[cellNumber]);
            }
        }

        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            workbook.write(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
