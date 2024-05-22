package com.lunchMenu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Builder

@Data

@NoArgsConstructor

@AllArgsConstructor

public class LunchMenuDTO {
    private Long menuNo;
    private String menuTitle;
    private LocalDate menuRegDate;

}
