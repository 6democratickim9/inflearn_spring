package com.example.restfulwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor //전체 모든 필드에 대해 파라미터로 갖는 생성자
public class User {
    private Integer id;
    private String name;
    public Date joinDate;

}
