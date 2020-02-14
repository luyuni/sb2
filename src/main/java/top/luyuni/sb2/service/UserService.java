package top.luyuni.sb2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.luyuni.sb2.bean.User;
import top.luyuni.sb2.mapper.UserMapper;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User getUserById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
