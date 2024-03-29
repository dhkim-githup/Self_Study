package com.study.myhome.controller;

import com.study.myhome.model.Board;
import com.study.myhome.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BoardApiController {

        @Autowired
        private BoardRepository repository;


        // Aggregate root
        // tag::get-aggregate-root[]
        @GetMapping("/boards")
        List<Board> all(@RequestParam(required = false, defaultValue = "") String title,
                        @RequestParam(required = false, defaultValue="") String content) {
            if(StringUtils.isEmpty(title) && StringUtils.isEmpty(title)) {
                return repository.findAll();
            }else{
                return repository.findByTitleAndContent(title,content);
            }
        }
        // end::get-aggregate-root[]

        @PostMapping("/boards")
        Board newBoard(@RequestBody Board newBoard) {
            return repository.save(newBoard);
        }

        // Single item

        @GetMapping("/boards/{id}")
        Board one(@PathVariable Long id) {

            return repository.findById(id).orElse(null);
        }

        @PutMapping("/boards/{id}")
        Board replaceBoard(@RequestBody Board newBoard, @PathVariable Long id) {

            return repository.findById(id)
                    .map(board -> {
                        board.setTitle(newBoard.getTitle());
                        board.setContent(newBoard.getContent());
                        return repository.save(board);
                    })
                    .orElseGet(() -> {
                        newBoard.setId(id);
                        return repository.save(newBoard);
                    });
        }

        @DeleteMapping("/boards/{id}")
        void deleteBoard(@PathVariable Long id) {
            repository.deleteById(id);
        }
    }

