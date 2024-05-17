package com.todo.dto;

import java.time.LocalDate;

public class LunchMenuDTO {
    private Long menuNo;
    private String menuName;
    private LocalDate menuDate;

    public Long getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(Long menuNo) {
        this.menuNo = menuNo;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public LocalDate getMenuDate() {
        return menuDate;
    }

    public void setMenuDate(LocalDate menuDate) {
        this.menuDate = menuDate;
    }

    @Override
    public String toString() {
        return "LunchMenuDTO{" +
                "menuNo=" + menuNo +
                ", menuName='" + menuName + '\'' +
                ", menuDate=" + menuDate +
                '}';
    }
}
