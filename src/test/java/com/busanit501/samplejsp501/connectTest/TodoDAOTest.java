package com.busanit501.samplejsp501.connectTest;

import com.todo.dao.TodoDAO;
import com.todo.domain.TodoVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TodoDAOTest {
    private TodoDAO todoDAO;
    @BeforeEach
    public void ready() {
        todoDAO= new TodoDAO();
    }
    @Test
    public void getTimeTest() throws Exception{
//        String time = todoDAO.getTime();
        String time = todoDAO.getTime2();
        System.out.println("time : "+ time);
    }

    @Test
    public void getSelectAll()throws Exception{
        List<TodoVO> samples = todoDAO.selectAll();
        System.out.println("samples : " + samples);
        samples.forEach(vo->System.out.println("각각 출력 : " + vo));
    }
}
