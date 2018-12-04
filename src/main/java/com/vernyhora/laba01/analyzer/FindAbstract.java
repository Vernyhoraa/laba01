package com.vernyhora.laba01.analyzer;

import com.vernyhora.laba01.sorters.AbstractSorter;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Class for discovering all abstract methods in the abstractSorter class
 * @see AbstractSorter
 * @see java.lang.reflect.Method
 * @see Modifier
 * @see Reflections
 * @author <Vernyhora Elena>
 */

public class FindAbstract {
    /**
     * looking for abstract methods
     * in the class {@link AbstractSorter}
     * @return list of methods
     */
    public List<AbstractSorter> findAbstract() throws IllegalAccessException, InstantiationException {
        Reflections reflections = new Reflections("com.vernyhora.laba01");
        Set<Class<? extends AbstractSorter>> subTypesOf = reflections.getSubTypesOf(AbstractSorter.class);
        List<AbstractSorter> list = new ArrayList<>();

        for (Class clazz : subTypesOf) {
            if (!Modifier.isAbstract(clazz.getModifiers())) {
                AbstractSorter obj = (AbstractSorter) clazz.newInstance();
                list.add(obj);
            }
        }
        return list;
    }
}
