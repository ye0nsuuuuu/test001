package com.busanit501.samplejsp501.connectTest.service;

import com.todo.dto.MemberDTO;
import com.todo.dto.TodoDTO;
import com.todo.service.MemberService;
import com.todo.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
@Log4j2
public class MemberServiceTests {
    private MemberService memberService;

    // 아래에 다른 메서드들이 실행되기전에, 먼저 실행이 됨.(역할, todoService 초기화 해주는 역할)
    @BeforeEach
    public void ready(){
        memberService = MemberService.INSTANCE;
    }

    @Test
    public  void getOneMemberTest() throws Exception {

        // 인자 값으로 TodoDTO 를 사용해야함.
        MemberDTO memberDTO = memberService.getOneMember("lsy","1234");
        log.info("memberDTO : "+ memberDTO);
    }
}