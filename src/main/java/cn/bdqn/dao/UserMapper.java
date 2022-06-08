package cn.bdqn.dao;

import cn.bdqn.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> list();

    void add(@Param("username") String username, @Param("password") String password);

    void update(@Param("username") String username, @Param("id") Integer id);

    void delete(Integer id);

    User getUserById(int id);
}
