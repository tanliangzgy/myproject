package com.jxd.test;

import com.jxd.emp.EmpApplication;
import com.jxd.emp.mapper.IEmpMapper;
import com.jxd.emp.mapper.IUserMapper;
import com.jxd.emp.model.Emp;
import com.jxd.emp.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author tanliang
 * @Date 2020/10/23
 * @Version 1.0
 */

@RunWith(SpringRunner.class)    //用谁作为启动器去加载所有的底层配置
@SpringBootTest(classes = EmpApplication.class)   //启动主程序
public class TestDao {
    @Autowired
    private IEmpMapper empMapper;

    @Autowired
    private IUserMapper userMapper;

    @Test
    public void test(){
        List<Emp> list = empMapper.getAll();
        System.out.println("数据条数是："+list.size());
    }

    @Test
    public void testUser(){
        List<Users> list = userMapper.selectList(null);
        System.out.println("数据条数是："+list.size());
    }

}
