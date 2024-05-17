package com.todo.dao;

import com.todo.domain.LunchMenuVO;
import com.todo.domain.TodoVO;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LunchMenuDAO {

public List<LunchMenuVO> selectAll() throws Exception{
    String sql = "select * from lunchmenu";
    @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
    @Cleanup PreparedStatement ps = connection.prepareStatement(sql);
    @Cleanup ResultSet rs = ps.executeQuery();
    List<LunchMenuVO> list = new ArrayList<>();
    while (rs.next()) {
        LunchMenuVO lunchMenuVOBuilder = LunchMenuVO.builder()
                .menuNo(rs.getLong("menuNo"))
                .menuName(rs.getString("MenuTitle"))
                .menuDate(rs.getDate("MenuRegDate").toLocalDate())
                .build();
        list.add(lunchMenuVOBuilder);
    }


    return list;
}

}
