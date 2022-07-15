package com.example.boot.service;

import com.example.boot.entity.Board;
import com.example.boot.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    // 글 저장
    public void write(Board board){
        boardRepository.save(board);
    }

    // 리스트 조회
    public List<Board> boardList(){
        return boardRepository.findAll();
    }

    // 특정 게시글 불러오기
    public Board boardView(int id){
        return boardRepository.findById(id).get();
    }
}
