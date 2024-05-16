package menu.service;

import member.dto.MemberDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum MenuService {
    INSTANCE;

    // 임시 리스트 출력하는 기능.
    public List<MemberDTO> getList() {

        List<MemberDTO> listSample = IntStream.range(0,10).mapToObj(i -> {
            MemberDTO dto = new MemberDTO();
            dto.setMemberNo((long)i);
            dto.setMemberName("Sample Menu Title " + i);
            dto.setMemberBirth(LocalDate.now());
            return dto;
        }).collect(Collectors.toList());
        return listSample;
    }



}
