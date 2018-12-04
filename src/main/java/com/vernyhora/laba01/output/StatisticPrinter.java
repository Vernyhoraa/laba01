package com.vernyhora.laba01.output;

import java.lang.reflect.Method;
import java.util.Map;

/**
 *
 * @see com.vernyhora.laba01.analyzer.Analyzer
 * @see Map
 * @author <Vernyhora Elena>
 */

public class StatisticPrinter {

    public void printResult(Map<Class, Map<Method, Long>> analyze) {

        for (Map.Entry<Class, Map<Method, Long>> entry : analyze.entrySet()) {
            Map<Method, Long> value = entry.getValue();
            Class key = entry.getKey();

            System.out.println("***********" + key.getSimpleName());

            for (Map.Entry<Method, Long> generatorResult : value.entrySet()) {
                Method keyResult = generatorResult.getKey();
                Long valueResult = generatorResult.getValue();

                System.out.println("  @  " + keyResult.getName() + " - " + valueResult);
            }

        }

    }
}