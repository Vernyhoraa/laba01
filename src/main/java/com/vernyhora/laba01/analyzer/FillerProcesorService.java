package com.vernyhora.laba01.analyzer;

import com.vernyhora.laba01.fillers.ArrayGenerator;
import com.vernyhora.laba01.fillers.FillerProcessor;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for discovering all static methods in the generator class
 * @see  FillerProcessor
 * @see ArrayGenerator
 * @see Class
 * @see Class#getMethods()
 * @see Class#getMethod(String, Class[])`
 *
 * @author <Vernyhora Elena>
 */
public class FillerProcesorService {
    /**
     * looking for static methods marked with annotation {@link FillerProcessor}
     * in the class {@link ArrayGenerator}
     * @return list of methods
     */
    public List<Method> findMethods() {
        List<Method> methods = new ArrayList<>();
        Class neededClass = ArrayGenerator.class;

        Method[] allMethods = neededClass.getMethods();

        for (Method method : allMethods) {
            if (Modifier.isStatic(method.getModifiers())) {
                if (method.isAnnotationPresent(FillerProcessor.class)) {
                    methods.add(method);
                }
            }
        }
        return methods;
    }

}
