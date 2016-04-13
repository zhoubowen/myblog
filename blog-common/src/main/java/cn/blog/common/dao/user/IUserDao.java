package cn.blog.common.dao.user;

import cn.blog.common.entity.user.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Created by bowen on 16-4-4下午2:57.
 */
public interface IUserDao {

    //@Select("select `id`, `name`, `age` from `user` where `id` = #{id}")
    User findById(@Param("id") Integer id);

    //@Insert("insert into user(`name`, `age`) values(#{name}, #{age})")
    void insert(@Param("name") String name);

    User findByName(@Param("name")String name);
}
