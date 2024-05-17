package com.busanit501.samplejsp501.connectTest;

import com.todo.dao.LunchMenuDAO;
import com.todo.domain.LunchMenuVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LunchMenuDAOTest {
    private LunchMenuDAO dao;
    @BeforeEach
    public void ready(){
        dao = new LunchMenuDAO();

    }
    @Test
    public void insertLunchMenu() throws Exception{
        List<LunchMenuVO> samples=dao.selectAll();
        System.out.println("samples : " + samples);
        samples.forEach(vo ->System.out.println("각각 출력해보기 : " + vo) );
    }
}
