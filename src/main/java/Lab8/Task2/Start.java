package Lab8.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Start {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        List<Integer> grades = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 3, 2, 5, 4
        ));
        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(grades);

        Field[] fields = gradeAnalyzer.getClass().getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
        }

        Method[] methods = gradeAnalyzer.getClass().getDeclaredMethods();

        for(Method method : methods){
            if(method.getName().contains("calculate")){
                System.out.println(method.getName());
                System.out.println(method.invoke(gradeAnalyzer));
                //method.invoke(gradeAnalyzer.calculateAvgGrade());
            } else if (method.getName().contains("print")) {
                System.out.println(method.getName());
                method.invoke(gradeAnalyzer);
            }
        }
    }

}
