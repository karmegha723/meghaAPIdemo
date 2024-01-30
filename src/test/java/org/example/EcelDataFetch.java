package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EcelDataFetch {

    public  List<String> datafetch() throws IOException {
        File file = new File("C:\\Users\\DESKTOP\\Desktop\\Book1.xlsx");
        FileInputStream ds = new FileInputStream(file);

        List<String> ls = new ArrayList<String>();
        Workbook wb = WorkbookFactory.create(ds);
        Sheet sheet = wb.getSheet("Sheet1");
        String sheetName =sheet.getSheetName();
        System.out.println(sheetName);
        int row_count=sheet.getLastRowNum();
        System.out.println(row_count);
        for(int i=1;i<=row_count;i++)
        {
            Row row = sheet.getRow(i);
            for(int j=0;j<row.getLastCellNum();j++) {
                Cell cell = row.getCell(j);
                if(cell.getCellType()==CellType.STRING)
                {

                    String value = cell.getStringCellValue();
                    System.out.println(value);
                    ls.add(value);
                }
                else
                {
                   String value= NumberToTextConverter.toText(cell.getNumericCellValue());
                    System.out.println(value);
                    ls.add(value);
                }


            }


        }
        return  ls;





    }
    @Test
    public void test1()
    {

    }
}
