package cn.bdqn.service;

import cn.bdqn.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    List<User> list();

    void add(String username,String password);

    void update(String username, Integer id);

    void delete(Integer id);

    User getUserById(int id);
}
