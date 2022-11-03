package com.example.coffeedev.comm;

import lombok.extern.log4j.Log4j2;

/**
 * CustomException 생성, Exception 처리는 나에게..
 */
@Log4j2
public class MyExceptionRuntime extends RuntimeException{

    public MyExceptionRuntime(String s){
        super("My Exception 처리 =>"+s);
    }

    public MyExceptionRuntime(String s, String sClass){
        super("My Exception 처리 =>"+s);
        log.info("MyException Class 오류발생 =>"+sClass);
    }
}
