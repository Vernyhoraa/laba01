package com.vernyhora.laba01.analyzer;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ExcelDataModel {
    private Method method;
    private Map<Class, ArraySorterData> dataMap;

    public ExcelDataModel(Method method) {
        this.method = method;
        dataMap = new HashMap<>();
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Map<Class, ArraySorterData> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<Class, ArraySorterData> dataMap) {
        this.dataMap = dataMap;
    }
}
