package com.vernyhora.laba01.analyzer;

import java.util.Map;
import java.util.TreeMap;

public class ArraySorterData {
    private Class arraySorter;
    private Map<Integer, Long> results;

    public ArraySorterData(Class arraySorter) {
        this.arraySorter = arraySorter;
        this.results = new TreeMap<>();
    }

    public Class getArraySorter() {
        return arraySorter;
    }

    public void setArraySorter(Class arraySorter) {
        this.arraySorter = arraySorter;
    }

    public Map<Integer, Long> getResults() {
        return results;
    }

    public void setResults(Map<Integer, Long> results) {
        this.results = results;
    }
}
