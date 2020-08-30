package com.selenium.rahulcourse.datadriven;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class GetCells {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C://Users//Aynigar//Desktop//demo.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        int sheetsCount = workbook.getNumberOfSheets();
        for (int i = 0; i < sheetsCount; i++) {
            if (workbook.getSheetName(i).equals("sheet1")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> cells = firstRow.iterator();
                int count = 0;
                int column = 0;
                ArrayList<String> a = new ArrayList<String>();
                while (cells.hasNext()) {
                    Cell values = cells.next();
                    System.out.println(values.getStringCellValue());
                    if (values.getStringCellValue().equals("Password1")) {
                        column = count;
                    }
                    count++;
                }
                System.out.println("String is in colum :" + column);
                while (rows.hasNext()) {
                    Row r = rows.next();
                    if (r.getCell(column).getStringCellValue().equalsIgnoreCase("password2")) {
                        Iterator c = r.cellIterator();
                        while (c.hasNext()) {
                            Cell cel = (Cell) c.next();
                            if (cel.getCellTypeEnum() == CellType.STRING) {

                                a.add(cel.getStringCellValue());
                            } else a.add(NumberToTextConverter.toText(cel.getNumericCellValue()));
                        }
                        System.out.println(a.toString());
                    }
                }
            }

        }
    }
}
