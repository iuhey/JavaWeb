package com.lc.service.Role;

import com.lc.dao.BaseDao;
import com.lc.dao.Role.RoleDao;
import com.lc.dao.Role.RoleDaoImpl;
import com.lc.pojo.Role;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class RoleServiceImpl implements RoleService {
    //业务层调用持久层
    private RoleDao roleDao = null;
    public RoleServiceImpl(){
        this.roleDao =new RoleDaoImpl();
    }
    @Override
    public List<Role> getRoleList()  {
        Connection conn = null;
        List<Role> roleList = null;
        try {
            //获取数据库连接
            conn = BaseDao.getConnection();
            roleList = roleDao.getRoleList(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeResource(conn,null,null);
            return roleList;
        }
    }
    @Test
    public void testGetRoleList(){
        RoleServiceImpl roleService = new RoleServiceImpl();
        List<Role> roleList = roleService.getRoleList();
        for (Role role : roleList) {
            System.out.println(role.getRoleName());
        }
    }
}
