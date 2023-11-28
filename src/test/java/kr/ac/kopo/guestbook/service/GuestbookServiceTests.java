package kr.ac.kopo.guestbook.service;

import kr.ac.kopo.guestbook.dto.GuestbookDTO;
import kr.ac.kopo.guestbook.dto.PageRequestDTO;
import kr.ac.kopo.guestbook.dto.PageResultDTO;
import kr.ac.kopo.guestbook.entity.Guestbook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GuestbookServiceTests {
    @Autowired
    private GuestbookService service;

    @Test
    public void testRegister(){
        GuestbookDTO guestbookDTO = GuestbookDTO.builder()
                .title("DTO Test Title....")
                .content("DTO Test Content....")
                .writer("user0")
                .build();

        System.out.println(service.register(guestbookDTO));
    }

    @Test
    public void testList(){
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(12)
                .size(10)
                .build();

        PageResultDTO<GuestbookDTO, Guestbook> resultDTO = service.getList(pageRequestDTO);

        System.out.println("이전: " + resultDTO.isPrev());
        System.out.println("다음: " + resultDTO.isNext());
        System.out.println("전체 페이지: " + resultDTO.getTotalPage());
        System.out.println("시작 페이지 번호: " + resultDTO.getStart());
        System.out.println("마지막 페이지 번호: " + resultDTO.getEnd());


        for (GuestbookDTO guestbookDTO: resultDTO.getDtoList()
             ) {
            System.out.println(guestbookDTO);
        }


        System.out.println("--------------------------------------");
        resultDTO.getPageList().forEach(i -> System.out.println(i));






    }



}
