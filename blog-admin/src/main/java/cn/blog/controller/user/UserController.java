package cn.blog.controller.user;

import cn.blog.common.service.user.UserService;
import cn.blog.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bowen on 16-4-2上午11:05.
 */
@RestController
@RequestMapping("/user/")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping("list")
    @ResponseBody
    public String list(){
       return userService.findById(1).toString();
    }
}
