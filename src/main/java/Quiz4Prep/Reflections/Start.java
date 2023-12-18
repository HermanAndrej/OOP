package Quiz4Prep.Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Start {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        int[] grades = {5, 2, 3, 1, 2, 3, 3, 2};

        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(grades);

        System.out.println(gradeAnalyzer.calculateAverageGrade());
        gradeAnalyzer.printGradeSummary();

        Field[] fields = gradeAnalyzer.getClass().getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
        }

        Method[] methods = gradeAnalyzer.getClass().getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }

        for(Method method : methods){
            if(method.getName().contains("print")){
                System.out.println(method.getName());
            }
        }

        for(Method method : methods){
            if(method.getName().contains("calculate")){
                System.out.println(method.getName());
            }
        }

        for(Method method : methods){
            if(method.getName().contains("print")){
                method.invoke(gradeAnalyzer);
            }
        }

        for(Field field : fields){
            if(field.getName().equals("grades")){
                field.setAccessible(true);
            }
        }

    }
}
