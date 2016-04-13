package cn.blog.common.service.user;

import cn.blog.common.entity.user.User;
import cn.blog.common.form.UserCreateForm;

import java.util.Collection;

/**
 * Created by bowen on 16-4-4下午2:58.
 */
public interface UserService {

    User findById(Integer id);

    void addUser(String name);



    User getUserById(long id);

    User getUserByName(String name);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
