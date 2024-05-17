package com.todo.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
public class LunchMenuVO {
  private Long menuNo;
  private String menuName;
  private LocalDate menuDate;
}







