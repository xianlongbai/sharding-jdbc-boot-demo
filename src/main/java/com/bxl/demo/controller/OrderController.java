package com.bxl.demo.controller;

import com.bxl.demo.config.GeneratorOnleKey;
import com.bxl.demo.dao.OrderDao;
import com.bxl.demo.entity.Order;
import io.shardingsphere.core.keygen.KeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by root on 2019/4/28.
 */
@RestController
@RequestMapping("/demo")
public class OrderController {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private GeneratorOnleKey keyGenerator;

    @RequestMapping(value = "/add", method = GET)
    @ResponseBody
    public String add(){
//        for(int i=0;i<10;i++){
//            Order order = new Order();
//            order.setOrderId((long) i);
//            order.setUserId((long) i);
//            orderDao.saveToOne(order);
//        }
        Order order = new Order();
        order.setUserId(13L);
        order.setOrderId(keyGenerator.generateKey().longValue());
        orderDao.saveToOne(order);
        return "success";
    }

    @RequestMapping("/query")
    public List<Order> queryAll(){
        List<Order> res = orderDao.findAllData();
        return res;
    }


}
