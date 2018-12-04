package com.vernyhora.laba01;

import com.vernyhora.laba01.analyzer.ArraySorterData;
import com.vernyhora.laba01.analyzer.ExcelDataModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CreateExcelDemo {
    private String[] header = {"Name", "10", "100", "1000"};


    public void printExcel(List<ExcelDataModel> analyze) {
        Workbook book = new HSSFWorkbook();
        for (ExcelDataModel excelDataModel : analyze) {
            Sheet sheet = book.createSheet(excelDataModel.getMethod().getName());
            int rowNum = 0;
            for (ArraySorterData arraySorterData : excelDataModel.getDataMap().values()) {
                Row row = sheet.createRow(rowNum++);
                int cellNum = 0;
                row.createCell(cellNum++).setCellValue(arraySorterData.getArraySorter().getSimpleName());
                for (Map.Entry<Integer, Long> times : arraySorterData.getResults().entrySet()) {
                    row.createCell(cellNum++).setCellValue(times.getValue());
                }
            }
        }

        try (FileOutputStream out = new FileOutputStream(new File("Vernyhora.xls"))) {
            book.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel файл успешно создан!");
    }


    public void printHeader(Row row) {
        for (int i = 0; i < header.length; i++) {
            row.createCell(i).setCellValue(header[i]);
        }


    }
}
