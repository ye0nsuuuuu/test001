package member.service;

import member.dto.MemberDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum MemberService {
    INSTANCE;
    public List<MemberDTO> getList(){
        List<MemberDTO> listSample2 = IntStream.range(0,10).mapToObj(i->{
            MemberDTO dto = new MemberDTO();
            dto.setMemberNo((long)i);
            dto.setMemberName("Sample Member Name"+i);
            dto.setMemberBirth(LocalDate.now());
            return dto;
        }).collect(Collectors.toList());
        return listSample2;
    }
}
