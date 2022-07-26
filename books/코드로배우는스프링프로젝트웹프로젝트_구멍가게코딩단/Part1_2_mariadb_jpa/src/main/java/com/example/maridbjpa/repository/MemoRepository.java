package com.example.maridbjpa.repository;

import com.example.maridbjpa.entity.Memo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/* Jpa interface 선언만으로 스프링의빈으로 등록됨 */
public interface MemoRepository extends JpaRepository<Memo, Long> {

    // Mno 를 between 을 가져오도록 함
    List<Memo> findByMnoBetweenOrderByMnoAsc(Long from, Long to);

    // Mno 를 between 을 사용하여 가져오고 페이징 처리를 함
    Page<Memo> findByMnoBetween(Long from, Long to, Pageable pageable);

    void deleteMemoByMnoLessThan(Long num);
}
