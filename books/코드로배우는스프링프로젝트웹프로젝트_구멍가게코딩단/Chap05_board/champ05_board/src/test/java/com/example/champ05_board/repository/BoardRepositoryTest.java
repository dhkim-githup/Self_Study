package com.example.champ05_board.repository;

import com.example.champ05_board.entity.Board;
import com.example.champ05_board.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardRepositoryTest {
    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void insertBoard() {

        IntStream.rangeClosed(1,100).forEach(i -> {
            Member member = Member.builder().email("user"+i +"@aaa.com").build();

            Board board = Board.builder()
                    .title("Title..."+i)
                    .content("Content...." + i)
                    .writer(member)
                    .build();
            boardRepository.save(board);
        });
    }

    @Transactional // FetchType.LAZY 설정 시 필수사용
    @Test
    public void testRead1() {

        Optional<Board> result = boardRepository.findById(100L); //데이터베이스에 존재하는 번호
        Board board = result.get();
        System.out.println("======== Line 1 =====");
        System.out.println(board);
        System.out.println("======== Line 2 =====");
        System.out.println(board.getWriter());

    }

    @Test
    public void testReadWithWriter() {

        Object result = boardRepository.getBoardWithWriter(100L);

        Object[] arr = (Object[])result;

        System.out.println("-------------------------------");
        System.out.println(Arrays.toString(arr));

    }

    /*
    @Test
    public void testGetBoardWithReply() {

        List<Object[]> result = boardRepository.getBoardWithReply(100L);

        for (Object[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }


    @Test
    public void testWithReplyCount(){

        Pageable pageable = PageRequest.of(0,10, Sort.by("bno").descending());

        Page<Object[]> result = boardRepository.getBoardWithReplyCount(pageable);

        result.get().forEach(row -> {

            Object[] arr = (Object[])row;

            System.out.println(Arrays.toString(arr));
        });
    }

    @Test
    public void testRead3() {

        Object result = boardRepository.getBoardByBno(100L);

        Object[] arr = (Object[])result;

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testSearch1() {

        boardRepository.search1();

    }

    @Test
    public void testSearchPage() {

        Pageable pageable =
                PageRequest.of(0,10,
                        Sort.by("bno").descending()
                                .and(Sort.by("title").ascending()));

        Page<Object[]> result = boardRepository.searchPage("t", "1", pageable);

    }

//    @Test
//    public void testSearch(){
//
//        PageRequestDTO pageRequestDTO = new PageRequestDTO();
//        pageRequestDTO.setPage(1);
//        pageRequestDTO.setSize(10);
//        pageRequestDTO.setType("twc");
//        pageRequestDTO.setKeyword("3");
//
//        Pageable pageable = pageRequestDTO.getPageable(Sort.by("bno").descending());
//
//        Page<Object[]> result = boardRepository.searchList( pageRequestDTO );
//
//        System.out.println(result);
//
//        result.get().forEach(row -> {
//
//            Object[] arr = (Object[])row;
//
//            System.out.println(Arrays.toString(arr));
//        });
//
//    }

     */

}