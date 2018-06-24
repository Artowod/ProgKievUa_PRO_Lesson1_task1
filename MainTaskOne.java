package ua.prog.kiev.lesson1.taskOne;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainTaskOne {

    private static void manageMethodThroughAnnotation() throws InvocationTargetException, IllegalAccessException {
        TestedClass instanceOfTC = new TestedClass();
        Class<?> test = instanceOfTC.getClass();
        Method[] allClassMethods = test.getDeclaredMethods();
        for (Method method : allClassMethods) {
            if (method.isAnnotationPresent(SumAnnotation.class)) {
                SumAnnotation sa = method.getAnnotation(SumAnnotation.class);
                Integer result = (Integer) method.invoke(instanceOfTC, sa.intOne(), sa.intTwo());
                System.out.println(result);
            }
        }
    }

    public static void main(String[] args) {
        try {
            manageMethodThroughAnnotation();
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
