package com.example.boot.controller;

import com.example.boot.entity.Board;
import com.example.boot.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "Hello Boot";
    }

    // 글 작성 화면 이동
    @GetMapping("/board/write")
    public String boardWriteForm(){
        return "board_write";
    }

    // 글쓰기 실행
    @PostMapping("/board/writedo")
    public String boardWriteDo(Board board){
        System.out.println("title"+board.getTitle());
        System.out.println("content"+board.getContent());

        //public String boardWriteDo(String title , String content){
        //System.out.println("title"+title);
        //System.out.println("content"+content);
        boardService.write(board);

        return "";
    }

    // 글 리스트 보기
    @GetMapping("/board/list")
    public String boardList(Model model){
            model.addAttribute("list", boardService.boardList());
        return "boardList";
    }

    // 상세화면 보기
    @GetMapping("/board/view")
    public String boardView(Model model,int id){

        model.addAttribute("board",boardService.boardView(id));
        return "boardView";
    }


}
