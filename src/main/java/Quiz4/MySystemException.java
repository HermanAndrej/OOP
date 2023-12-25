package Quiz4;

import java.lang.annotation.Target;


public class MySystemException extends RuntimeException{

    public MySystemException(String message){
        super(message);
    }
}
