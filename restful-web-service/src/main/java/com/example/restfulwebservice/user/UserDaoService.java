package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount=3;
    static {
        users.add(new User(1, "Kenneth", new Date()));
        users.add(new User(2, "Alice",new Date()));
        users.add(new User(3, "Eric",new Date()));
    }
    public List<User> findAll(){
        return users;
    }
    public User save(User user){//전달되어진 user 값 안에
        if(user.getId()==null){//값이 존재하지 않으면
            user.setId(++usersCount);//전체 리스트에 usersCount를 더한다 +1후 id값 설정
        }
        users.add(user);
        return user;
    }
    public User findOne(int id){//id값 전달되면
        for(User user: users){//사용자 목록에서
            if(user.getId()==id){//id값이 일치하는 것을 찾아 반환
                return user;
            }
        }
        return null;
    }
}
