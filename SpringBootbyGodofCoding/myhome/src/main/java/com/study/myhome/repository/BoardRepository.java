package com.study.myhome.repository;

import com.study.myhome.model.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findByTitle(String title);
    List<Board> findByTitleAndContent(String title, String content);
    Page<Board> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);
}