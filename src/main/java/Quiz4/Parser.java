package Quiz4;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/*
Implement a method named saveConfigurableFields in a separate class named Parser.
This method should take an object and use reflection to save the names of the fields
annotated with ConfigurableField into a file passed in the filename parameter
in the format fieldname:fieldvalue (repeat this for each field).
In case the data.txt does not exist, you should create the file and add the above,
in case it does exist, you should append the values.
 */
public class Parser {

    public static void saveConfigurableFields(String filename, Object obj) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            Class<?> myClass = obj.getClass();
            Field[] fields = myClass.getDeclaredFields();

            for (Field field : fields) {
                if (field.isAnnotationPresent(ConfigurableField.class)) {
                    field.setAccessible(true);
                    Object value = field.get(obj);
                    writer.write(field.getName() + "=" + value + "\n");
                }
            }
        } catch (IOException | IllegalAccessException e) {
            throw new MySystemException("Exception thrown");
        }
    }
}



