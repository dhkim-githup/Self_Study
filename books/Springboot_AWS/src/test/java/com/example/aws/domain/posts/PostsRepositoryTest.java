package com.example.aws.domain.posts;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @AfterEach // 이전 @After 동일 , Junit 단위가 끝날때 실행
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void list_call() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        System.out.println("---------------- Point 1 --------------------");

        // .save  테이블에 insert/update 쿼리 실행
        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("jojoldu@gmail.com")
                .build());

        System.out.println("---------------- Point 2 --------------------");
        //when
        List<Posts> postsList = postsRepository.findAll();
        System.out.println("---------------- Point 3 --------------------");

        //then
        Posts posts = postsList.get(0);

        System.out.println(posts.getId() +"|"+posts.getTitle() +"|"+ posts.getAuthor());

        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }

    @Test
    public void BaseTimeEntity_reg() {
        //given
        LocalDateTime now = LocalDateTime.of(2019, 6, 4, 0, 0, 0);
        postsRepository.save(Posts.builder()
                .title("title")
                .content("content")
                .author("author")
                .build());
        //when
        List<Posts> postsList = postsRepository.findAll();

        System.out.println("postList Size"+ postsList.size());

        //then
        Posts posts = postsList.get(0);

        System.out.println(">>>>>>>>> createDate=" + posts.getCreatedDate() + ", modifiedDate=" + posts.getModifiedDate());

        assertThat(posts.getCreatedDate()).isAfter(now);
        assertThat(posts.getModifiedDate()).isAfter(now);
    }

}