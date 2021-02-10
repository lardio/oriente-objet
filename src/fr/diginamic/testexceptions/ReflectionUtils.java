package fr.diginamic.testexceptions;

import java.lang.reflect.Field;

public class ReflectionUtils {
    public static void afficherAttributs(Object obj) throws IllegalArgumentException, IllegalAccessException, ReflectionException {
        if (obj == null) {
            throw new ReflectionException("L'objet est null.");
        }
        Class<?> classe = obj.getClass();
        Field[] fields = classe.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("La valeur de l'attribut " + field.getName() + " est " +
            field.get(obj).toString());
        }
    }
}
