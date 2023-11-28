package kr.ac.kopo.guestbook.service;
import kr.ac.kopo.guestbook.entity.Guestbook;
import kr.ac.kopo.guestbook.dto.GuestbookDTO;

public interface GuestbookService {
    Long register(GuestbookDTO dto);

    default Guestbook dtoToEntity(GuestbookDTO dto) {
        Guestbook guestbookEntity = Guestbook.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .build();
        return guestbookEntity;
    }


}
