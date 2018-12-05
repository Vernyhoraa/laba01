package com.vernyhora.laba01.analyzer;

import com.vernyhora.laba01.fillers.ArrayGenerator;
import com.vernyhora.laba01.sorters.AbstractSorter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class for generating arrays and measuring sorting speed
 * @see InstantiationException
 * @see IllegalAccessException
 * @see Method
 * @see ArrayGenerator
 * @see AbstractSorter
 *
 * @author <Vernyhora Elena>
 *
 */
public class Analyzer {
    private FillerProcesorService fillerProcesorService = new FillerProcesorService();
    private FindAbstract findAbstract = new FindAbstract();

    private List<AbstractSorter> arraysSorts;
    private List<Method> methodList;
    /**
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public Analyzer() throws InstantiationException, IllegalAccessException {
        this.arraysSorts = findAbstract.findAbstract();
        this.methodList = fillerProcesorService.findMethods();
    }
    public Map<Class, Map<Method, Long>> analyze(int length) throws InvocationTargetException, IllegalAccessException {
        Map<Class, Map<Method, Long>> analyzerMap = new HashMap<>();

        for (AbstractSorter abstractSorter : arraysSorts) {
            Map<Method, Long> sorterResult = new HashMap<>();
            for (Method method : methodList) {
                int[] arr = (int[]) method.invoke(ArrayGenerator.class, length);
                long start = System.nanoTime();
                abstractSorter.sort(arr);
                long end = System.nanoTime();
                long time = end - start;
                sorterResult.put(method, time);
            }
            analyzerMap.put(abstractSorter.getClass(), sorterResult);
        }
        return analyzerMap;
    }
}