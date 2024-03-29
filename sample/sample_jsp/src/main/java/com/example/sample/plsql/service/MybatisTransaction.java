package com.example.sample.plsql.service;


import com.example.sample.plsql.dao.DaoCallPlsqlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MybatisTransaction {

    @Autowired
    DaoCallPlsqlMapper daoCallPlsqlMapper;

    public void doCallTransaction() {

        try {


            System.out.println("Break == 1 |>> " + daoCallPlsqlMapper);

            // 정상 입력 구문
            daoCallPlsqlMapper.doInsert();

            // 강제오류 발생 구문
            daoCallPlsqlMapper.doDelete();


        }catch (Exception e){
            System.out.println("Error =>"+e.getMessage());
            throw new RuntimeException();
        }

    }
}
