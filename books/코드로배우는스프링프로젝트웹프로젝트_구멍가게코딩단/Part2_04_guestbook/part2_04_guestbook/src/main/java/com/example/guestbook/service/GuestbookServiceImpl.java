package com.example.guestbook.service;

import com.example.guestbook.dto.GuestbookDTO;
import com.example.guestbook.entity.Guestbook;
import com.example.guestbook.repository.GuestbookRepository;
import com.example.guestbook.service.GuestbookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor // 의존성 자동 주입, 단, final 키워드가 있는것들만
public class GuestbookServiceImpl implements GuestbookService {

    private final GuestbookRepository repository; // 반드시 final 선언

    @Override
    public Long register(GuestbookDTO dto) {
        log.info("DTO ----------------------------");
        log.info(dto);

        /* Dto 를 변환하여 Entity에 입력한다. */
        Guestbook guestbook = dtoToEntity(dto);

        log.info(guestbook);

        /* jpa 를 이용하여 저장한다 */
        repository.save(guestbook);

        /* gno 값을 가져온다. */
        return guestbook.getGno();
    }
}
