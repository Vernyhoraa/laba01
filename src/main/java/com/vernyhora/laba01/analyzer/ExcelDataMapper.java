package com.vernyhora.laba01.analyzer;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelDataMapper {
    private Map<Method, ExcelDataModel> result;

    public ExcelDataMapper() {
        result = new HashMap<>();
    }

    public List<ExcelDataModel> getResults() {
        return new ArrayList<>(result.values());
    }

    public void collectResults(Map<Class, Map<Method, Long>> analyzeResult, int elements) {
        for (Map.Entry<Class, Map<Method, Long>> entry : analyzeResult.entrySet()) {
            for (Map.Entry<Method, Long> methodLongEntry : entry.getValue().entrySet()){
                result.putIfAbsent(methodLongEntry.getKey(), new ExcelDataModel(methodLongEntry.getKey()));
                ExcelDataModel excelDataModel = result.get(methodLongEntry.getKey());

                excelDataModel.getDataMap().putIfAbsent(entry.getKey(), new ArraySorterData(entry.getKey()));
                excelDataModel.getDataMap().get(entry.getKey()).getResults().put(elements, methodLongEntry.getValue());
            }
        }
    }
}
