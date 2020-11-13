package Lesson7;

import javafx.fxml.FXML;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws Exception {
/*
        Class c1 = Cat.class;
        Class c2 = new Cat("A", 4, "r").getClass();
        Class c3 = Class.forName("lesson7.Cat");
        Constructor<Cat> constr = c1.getConstructor(String.class, int.class, String.class);
        Cat cat = constr.newInstance("Barsik", 7, "red");
        cat.info();
        System.out.println(int.class);
        System.out.println(int[].class);
        System.out.println(int[][].class);
        Method[] methods = c1.getMethods();
        for (Method m: methods) {
            System.out.println(m);
        }
        Method[] methods = c1.getDeclaredMethods();
        for (Method m: methods) {
            System.out.println(m);
        }
        Method mInfo = c1.getDeclaredMethod("info");
        mInfo.invoke(cat);

        int mod = mInfo.getModifiers();
        System.out.println(mod);
        System.out.println("isPublic "+Modifier.isPublic(mod));
        System.out.println("isFinal "+Modifier.isFinal(mod));
        System.out.println("isAbstract "+Modifier.isAbstract(mod));
        System.out.println("isSynchronized "+Modifier.isSynchronized(mod));
        Field[] fields = c1.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        Field field = c1.getDeclaredField("name");
        System.out.println(field.get(cat));
        Field field = c1.getDeclaredField("color");
        field.setAccessible(true);
        System.out.println(field.get(cat));
        field.set(cat, "purple");
        cat.info();
        SecurityManager;*/



        Class mt = MyTest.class;

        Method[] methods = mt.getDeclaredMethods();
        for (Method m : methods) {
            if(m.isAnnotationPresent(Anno.class)){
                System.out.println(m.getAnnotation(Anno.class).description());
                m.invoke(null);
            }
        }
    }
}
