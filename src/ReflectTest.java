

import java.lang.reflect.Field;

public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.sy.config.Reflect");
            Field[] fields = c.getFields();
            Field[] fields1 = c.getDeclaredFields();
            for (Field field :fields){
                System.out.println(field);
                System.out.println(field.getName());
            }
            for (Field field :fields1){
                System.out.println(field);
            }
            System.out.println(Integer.class.isPrimitive());
            Object o = c.newInstance();
            System.out.println(o);
            Field field2 = c.getDeclaredField("b");
            Field field = c.getDeclaredField("a");
            Field field1 = c.getDeclaredField("aSs");
            field2.setAccessible(true);
            field1.set(o,new ASsImpl());
            field2.set(o,131.2);
            field.set(o,1);
            field2.setAccessible(false);
            System.out.println(o);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
