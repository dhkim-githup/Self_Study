package com.example.coffee.comm;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MyExceptionRuntime extends RuntimeException{

    public MyExceptionRuntime(String e){
        super("에러발생 함 =>"+e);
        log.info("에러 메세지 =>"+e);
    }

    public MyExceptionRuntime(String e, String sClass){
        super("에러발생 함 =>"+e);
        log.info("에러 메세지 =>"+e);
        log.info("어디서 왔니? =>"+sClass);
    }
}
