package demo.yangxu.web.controller;

import demo.yangxu.domain.User;
import demo.yangxu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAll(){
        System.out.println("test");
        return userService.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public User findById(Integer id){
        return userService.findById(id);
    }

    /**
     * 更新
     * @param user
     */
    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        System.out.println(user);
        userService.updateUser(user);
    }
}
