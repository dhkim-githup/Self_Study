package com.example.boot.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardControllerTest {

    @Test
    public void test(){

        BoardController boardController = new BoardController();
        System.out.println(boardController.index());

    }

}