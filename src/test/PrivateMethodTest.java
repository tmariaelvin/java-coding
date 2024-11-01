package test;


import main.Addition;
import main.PrivateMethodSample;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrivateMethodTest {


    @Test
    public void testSum() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Addition addition = new Addition();
        int res = addition.sum(1,2);

        Method method = Addition.class.getDeclaredMethod("addition", int.class, int.class);
        method.setAccessible(true);

        // Invoke the private method and assert the result
        Integer result = (Integer) method.invoke(addition, 5, 2);
        assertEquals(7, result);
    }
}


/*
Method method = TargetClass.getDeclaredMethod(methodName, argClasses);
method.setAccessible(true);
return method.invoke(targetObject, argObjects);
And for fields:

Field field = TargetClass.getDeclaredField(fieldName);
field.setAccessible(true);
field.set(object, value);*/
