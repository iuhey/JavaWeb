package com.lc.service.User;
import com.lc.pojo.User;

import java.util.List;


public interface UserService {
    //用户登录
    public abstract User login(String userCode,String passWord);
    //根据用户ID修改密码
    public abstract boolean updatePassword(int id,String passWord);
    //用户管理——查询记录数
    public abstract int getUserCounts(String username,int userRole);
    //根据条件 查询用户列表
    public abstract List<User> getUserList(String QueryUserName,int QueryUserRole,int currentPageNo,int pageSize);
    //用户管理模块中的 子模块—— 添加用户
    public abstract boolean addUser(User user);
    //用户管理模块中的子模块 —— 删除用户
    public abstract boolean deleteUser(int userId);
    //根据id查询用户信息
    public abstract User findById(int userId);
    //用户管理模块中的子模块 —— 更改用户信息
    public abstract boolean modify(int id,User user);
}
