

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@AnnoDemo(name = "注解类")
public class AnnoTest {
    @AnnoDemo
    public int a ;

    @AnnoDemo(name = "注解方法")
    public void c (){

    }
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.sy.config.AnnoTest");
            if (c.isAnnotationPresent(AnnoDemo.class)){
                Annotation [] annotations = c.getAnnotations();
                for (Annotation annotation :annotations){
                    AnnoDemo annoDemo = (AnnoDemo) annotation;
                    System.out.println(annoDemo.name());
                }
            }
            Method[] methods = c.getMethods();
            for (Method method :methods){
//                System.out.println(method);
                if (method.isAnnotationPresent(AnnoDemo.class)){
                    Annotation annotation = method.getAnnotation(AnnoDemo.class);
                    AnnoDemo annoDemo = (AnnoDemo) annotation;
                    System.out.println(method.getName());
                    System.out.println(annoDemo.name());
                }
            }
            Field [] fields = c.getFields();
            for (Field field :fields){
                if (field.isAnnotationPresent(AnnoDemo.class)){
                    Annotation annotation = field.getAnnotation(AnnoDemo.class);
                    AnnoDemo annoDemo = (AnnoDemo) annotation;
                    System.out.println(field.getName());
                    System.out.println(annoDemo);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
