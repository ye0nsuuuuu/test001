package com.busanit501.samplejsp501.connectTest;

import com.lunchMenu.dao.LunchMenuDAO;
import com.lunchMenu.domain.LunchMenuVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
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
    @Test
    public void insert()throws Exception{
        LunchMenuVO vo= LunchMenuVO.builder()
                .menuTitle("국수")
                .menuRegDate(LocalDate.of(2024,5,20))
                .build();
        dao.insert(vo);
    }
    @Test
    public void update()throws Exception{
        LunchMenuVO vo = LunchMenuVO.builder()
                .menuNo(4L)
                .menuTitle("라면")
                .menuRegDate(LocalDate.now())
                .build();
        dao.update(vo);
    }

//    @Test
//    public void delete()throws Exception{
//        dao.delete(2L);
//    }
}
