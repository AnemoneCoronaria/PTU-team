package com.PTUproject.user.repository;

import com.PTUproject.user.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("insert into tablename(id, password) values (#{id}, #{password})")
    public int insert(User user);

    @Update("update tablename set password = #{password} where id = #{id}")
    public int update(User user);
    //이거 int 맞나...?

    @Delete("delete from tablename where id = #{id}")
    public int delete(long id);

    @Select("select COUNT(*) from tablename")
    public int count();

    @Select("select * from tablename order by id asc ")
    @ResultType(User.class)
    public List<User> selectAll();

    @Select("SELECT * FROM tablename WHERE id = #{id}")
    @Results(id = "userResultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "password", column = "password") })
    public User selectById(String id);

}




