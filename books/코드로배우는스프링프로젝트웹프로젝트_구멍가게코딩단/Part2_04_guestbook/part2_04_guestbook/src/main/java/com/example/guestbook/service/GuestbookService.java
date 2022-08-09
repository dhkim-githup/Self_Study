package com.example.guestbook.service;

import com.example.guestbook.dto.GuestbookDTO;
import com.example.guestbook.entity.Guestbook;

public interface GuestbookService {
    Long register(GuestbookDTO dto);

    /*
      Java8에서 인터페이스에 디폴트 메소드(Default methods) 기능추가
      기존 : 인터페이스는 메소드 정의만 할 수 있고 구현은 할 수 없었음
      변경 : Java8부터 디폴트 메소드라는 개념이 생겨 구현 내용도 인터페이스에 포함시킬 수 있음.
     */
    default Guestbook dtoToEntity(GuestbookDTO dto){
        Guestbook guestbook = Guestbook.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .build();
        return guestbook;
    }
}
