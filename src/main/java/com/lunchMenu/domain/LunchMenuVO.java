package com.lunchMenu.domain;

import lombok.*;

import java.time.LocalDate;

@Getter

@Builder

@NoArgsConstructor

@AllArgsConstructor
public class LunchMenuVO {
  private Long menuNo;
  private String menuTitle;
  private LocalDate menuRegDate;
}







