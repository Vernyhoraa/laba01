package com.vernyhora.laba01.runner;

import com.vernyhora.laba01.CreateExcelDemo;
import com.vernyhora.laba01.analyzer.Analyzer;
import com.vernyhora.laba01.analyzer.ExcelDataMapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author <Vernyhora Elena></>
 */


public class Runner {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        int[] arr = {10, 100, 1000};
        Analyzer analyzer = new Analyzer();
        ExcelDataMapper excelDataMapper = new ExcelDataMapper();

        for (int arrLength : arr) {
            Map<Class, Map<Method, Long>> analyze = analyzer.analyze(arrLength);
            excelDataMapper.collectResults(analyze, arrLength);
        }


        CreateExcelDemo createExcelDemo = new CreateExcelDemo();
        createExcelDemo.printExcel(excelDataMapper.getResults());

    }
}
