package cn.bdqn.service.impl;

import cn.bdqn.service.UserService;
import cn.bdqn.dao.UserMapper;
import cn.bdqn.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public void add(String username, String password) {
        userMapper.add(username,password);

    }

    @Override
    public void update(String username, Integer id) {
        userMapper.update(username,id);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
