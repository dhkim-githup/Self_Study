package com.example.maridbjpa.repository;

import com.example.maridbjpa.entity.Memo;
import jdk.nashorn.internal.runtime.options.Option;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemoRepositoryTest {

    @Autowired
    MemoRepository memoRepository;


    @Test // 해당 위치의 메서드만 단독으로 테스트 가능
    public void doTest(){
        // 동적 proxy로 실제 객체가 생성됨
        System.out.println("doTest : " + memoRepository.getClass().getName());
    }

    /* 데이타 입력 */
    //@Transactional // 실행 후 롤백처리 함
    @Test // 해당 위치의 메서드만 단독으로 테스트 가능
    public void testInsertDummies(){
        IntStream.rangeClosed(1,100).forEach(i -> {
            Memo memo = Memo.builder().memoText("Sample.."+i).build();
            // Save - 값이 있으면 update, 없으면 insert
            memoRepository.save(memo);
        } );
    }

    /* 데이타 조회 */
    @Test
    public void doSelect(){
        Long mno = 301L;

        // findById = java.util Optional 타입으로 반환
        Optional<Memo> result = memoRepository.findById(mno);

        if(result.isPresent()){
            Memo memo = result.get();
            System.out.println("doSelect : "+ memo);
        }
    }

    /* 데이타 저장 */
    @Commit // 기본적으로 commit 을 하지만, 명시화
    @Test
    public void doSave(){
        Memo memo = Memo.builder()
                        .mno(302L)
                        .memoText("Update Text")
                        .build();

        memoRepository.save(memo);
    }

    /* 데이타 삭제 */
    @Test // 해당 위치의 메서드만 단독으로 테스트 가능
    @Transactional // 실행 후 롤백처리 함
    public void doDelete(){
        Long mno = 301L;
        memoRepository.deleteById(mno);
            //memoRepository.deleteAll();
    }

    /* 데이타 페이징 */
    @Test
    public void doPaging(){
        // 1page 10개씩
        Pageable pageable = PageRequest.of(0,10);
        Page<Memo> result = memoRepository.findAll(pageable);
        System.out.println("doPaging : "+result);

        System.out.println("-----------------------------------------------");

        System.out.println("Total Page : "+result.getTotalPages()); // 총 페이지수
        System.out.println("Total count : "+result.getTotalElements()); // 전체개수
        System.out.println("Page Number : "+result.getNumber()); // 현재 페이지번호, 0부터 시작
        System.out.println("Page Size : "+result.getSize()); // 페이지당 데이타 개수
        System.out.println("has next page : "+result.hasNext()); // 다음 페이지 존재여부
        System.out.println("first page : "+result.isFirst()); // 시작페이지(0) 여부

        System.out.println("-----------------------------------------------");
        for(Memo memo : result.getContent()){
            System.out.println(memo);
        }
    }

    /* 데이타 정렬 */
    @Test
    public void doSort(){
        Sort sort1 = Sort.by("mno").descending();
        Pageable pageable = PageRequest.of(0,10, sort1);
        Page<Memo> result = memoRepository.findAll(pageable);

        result.get().forEach(memo ->{
            System.out.println("doSort : "+memo);

        } );

        // 여러컬럼 정렬
        Sort sort2 = Sort.by("mno").descending();
        Sort sort3 = Sort.by("memoText").ascending();
        Sort sortAll = sort2.and(sort3);
        Pageable pageable1 = PageRequest.of(0,10,sortAll);
        Page<Memo> result2 = memoRepository.findAll(pageable1);
    }

    @Test
    public void doQueryMethods(){

        // Mno 를 between 을 가져오도록 함
        List<Memo> list = memoRepository.findByMnoBetweenOrderByMnoAsc(310L, 320L);
        for (Memo memo : list){
            System.out.println("doQueryMethods : "+memo);
        }

        // Mno 를 between 을 사용하여 가져오고 페이징 처리를 함
        Pageable pageable = PageRequest.of(0,10, Sort.by("mno").ascending());
        Page<Memo> result = memoRepository.findByMnoBetween(350L, 400L, pageable);
        result.get().forEach(memo -> System.out.println(memo));


    }

    /* deleteBy 경우 기본적으로 Rollback 처리 된다고 하는데.... 잘 모르겠음 */
    @Commit
    @Transactional
    @Test
    public void doDeleteBy(){
        memoRepository.deleteMemoByMnoLessThan(10L);
    }

}