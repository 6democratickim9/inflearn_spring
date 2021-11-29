package com.example.restfulwebservice;
//lombok dependency: bean class를 만들 때 생성자나 toString같은것들을 자동으로 생성해줌
//우와 정말 사용하지 않을수가 없자나??

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor//생성자를 만들지 않아도 자동으로 생성됨-lombok
public class HelloWorldBean {
    private String message;//이것만 등록시켜놔도 lombok이 있어서 setter,getter 만들어줌
//
//    public HelloWorldBean(String message) {
//        this.message=message;
//    }//이거 굳이 만들필요없음
}
