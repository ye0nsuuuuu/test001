package com.lunchMenu.dao;

import com.lunchMenu.domain.LunchMenuVO;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LunchMenuDAO_backup {

    public List<LunchMenuVO> selectAll() throws Exception {
        String sql = "select * from lunchmenu";
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement ps = connection.prepareStatement(sql);
        @Cleanup ResultSet rs = ps.executeQuery();
        List<LunchMenuVO> list = new ArrayList<>();
        while (rs.next()) {
            LunchMenuVO lunchMenuVOBuilder = LunchMenuVO.builder()
                    .menuNo(rs.getLong("menuNo"))
                    .menuTitle(rs.getString("menuTitle"))
                    .menuRegDate(rs.getDate("menuRegDate").toLocalDate())
                    .build();
            list.add(lunchMenuVOBuilder);
        }


        return list;
    }

    public LunchMenuVO selectOne(Long menuNo) throws Exception {
        String sql = "select * from lunchmenu where menuNo = ?";
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement ps = connection.prepareStatement(sql);
        ps.setLong(1, menuNo);
        @Cleanup ResultSet rs = ps.executeQuery();
        rs.next();

        LunchMenuVO lunchMenuVO = LunchMenuVO.builder()
                .menuNo(rs.getLong("menuNo"))
                .menuTitle(rs.getString("menuTitle"))
                .menuRegDate(rs.getDate("menuRegDate").toLocalDate())
                .build();
        return lunchMenuVO;
    }

    public void insert(LunchMenuVO lunchMenuVO) throws Exception {
        String sql = "insert into lunchmenu (MenuTitle, MenuRegDate) values (?,?);";
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, lunchMenuVO.getMenuTitle());
        ps.setDate(2, Date.valueOf(lunchMenuVO.getMenuRegDate()));
        ps.executeUpdate();
    }

    public void update(LunchMenuVO lunchMenuVO) throws Exception {
        String sql = "update lunchmenu set MenuRegDate = ?,menuTitle = ? where menuNo = ? ";
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement ps = connection.prepareStatement(sql);
        ps.setDate(1, Date.valueOf(lunchMenuVO.getMenuRegDate()));
        ps.setString(2, lunchMenuVO.getMenuTitle());
        ps.setLong(3, lunchMenuVO.getMenuNo());

        ps.executeUpdate();
    }


    public void delete(Long menuNo) throws Exception {
        String sql = "delete from lunchmenu where menuNo = ?";
        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement ps = connection.prepareStatement(sql);
        ps.setLong(1, menuNo);
        ps.executeUpdate();
    }
}


