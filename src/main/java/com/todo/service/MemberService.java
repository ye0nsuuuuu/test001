package com.todo.service;

import com.todo.dao.MemberDAO;
import com.todo.domain.MemberVO;
import com.todo.domain.TodoVO;
import com.todo.dto.MemberDTO;
import com.todo.dto.TodoDTO;
import com.todo.util.MapperUtil;
import org.modelmapper.ModelMapper;

public enum MemberService {
    INSTANCE;

    private MemberDAO memberDAO;
    private ModelMapper modelMapper;

    MemberService() {
        memberDAO = new MemberDAO();
        modelMapper = MapperUtil.INSTANCE.get();
    }

    // 하나 조회
    public MemberDTO getOneMember(String mid, String mpw) throws Exception {
        MemberVO sample = memberDAO.getWithPasswordMember(mid, mpw);
//    log.info("TodoService , 확인1, sample : " + sample);
        MemberDTO memberDTO = modelMapper.map(sample, MemberDTO.class);
        return memberDTO;
    }
}
