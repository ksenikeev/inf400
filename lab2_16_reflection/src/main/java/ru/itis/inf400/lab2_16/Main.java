package ru.itis.inf400.lab2_16;

import ru.itis.inf400.lab2_16.model.Hotel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class clazz = Hotel.class;

        System.out.println("getTypeName " + clazz.getTypeName());
        System.out.println("getName " + clazz.getName());
        System.out.println("getSimpleName " + clazz.getSimpleName());

        System.out.println("Parent: " + clazz.getSuperclass().getSimpleName());

        Field[] fields = clazz.getFields();
        System.out.println("Fields:");
        for (Field f : fields) {
            System.out.println(f.getName() + " : " + f.getType().getSimpleName());
        }

        fields = clazz.getDeclaredFields();
        System.out.println("DeclaredFields:");
        for (Field f : fields) {
            System.out.println(f.getName() + " : " + f.getType().getSimpleName());
        }

        Method[] methods = clazz.getMethods();
        System.out.println("Methods:");
        for (Method m : methods) {
            System.out.println(m.getName() + "(" + m.getParameterCount() + ")"
                    + " -> " + m.getReturnType().getSimpleName());
        }

        methods = clazz.getDeclaredMethods();
        System.out.println("Methods:");
        for (Method m : methods) {
            System.out.println(m.getName() + "(" + m.getParameterCount() + ")"
                    + " -> " + m.getReturnType().getSimpleName());
        }


        Constructor defaultConstructor = clazz.getConstructor();

        Object hotel = defaultConstructor.newInstance();
        System.out.println(hotel.getClass());

        Field fieldName = clazz.getDeclaredField("name");
        fieldName.setAccessible(true);
        fieldName.set(hotel, "Гостиница");

        Method methodName = clazz.getMethod("setAddress", String.class);
        methodName.invoke(hotel, "Казань");

        System.out.println(hotel);
    }
}
