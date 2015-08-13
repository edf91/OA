package org.wxd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wxd.api.AProxy;
import org.wxd.api.AService;

import javax.annotation.Resource;

/**
 * Created by wangxd on 2015/8/3.
 */
@ContextConfiguration("classpath:META-INF/application.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ATest {
    @Resource
    private AService aService;

    private AProxy a = new AProxy("47fccc78-67ec-450f-b15e-be519899c2ec","ss");

    public void saveA() {
        System.out.println("save ------------------------------" + a.getId());
        aService.save(a);
//        getA(a.getId());
    }

    public void getA(String id){
        System.out.println("get method ----- " + id);
        System.out.println(aService.get(id).getName());
    }
    @Test
    public void removeA(){
        System.out.println("remove method ----- " + a.getId());
        aService.remove(a);
    }

}
