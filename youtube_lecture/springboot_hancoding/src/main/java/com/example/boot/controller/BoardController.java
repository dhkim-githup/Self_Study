package com.example.boot.controller;

import com.example.boot.entity.Board;
import com.example.boot.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String boardWriteDo(Board board, Model model){
        System.out.println("title"+board.getTitle());
        System.out.println("content"+board.getContent());

        //public String boardWriteDo(String title , String content){
        //System.out.println("title"+title);
        //System.out.println("content"+content);
        boardService.write(board);

        model.addAttribute("message","글작성이 완료되었어요.");
        model.addAttribute("url","/board/list");


        return "message";
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

    // 게시글 삭제
    @GetMapping("/board/delete")
    public String boardDelete(int id){
        boardService.boardDelete(id);
        return "redirect:/board/list";
    }

    // 게시글 수정 - 화면
    @GetMapping("/board/modify/{id}") // Id 를 pathvariable 에서 받느낟.
    public String boardModify(@PathVariable("id") int id, Model model){
        model.addAttribute("board", boardService.boardView(id));
        return "board_modify";
    }
    // 게시글 수정 - 실행
    @PostMapping("/board/update/{id}")
    public String boardUpdate(@PathVariable("id") int id, Model model, Board board){

        // 기존 자료에 덮어 씌운다.
        Board boardTemp = boardService.boardView(id);
        boardTemp.setTitle(board.getTitle());
        boardTemp.setContent(board.getContent());

        boardService.write(boardTemp);

        return "redirect:/board/list";
    }
}
