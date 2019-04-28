package com.bxl.demo.dao;

import com.bxl.demo.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * <br>
 * <b>功能：</b>t_order TOrderDao<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2019-04-28 <br>
 * <b>版权所有：<b>Copyright(C) 2015, Beijing TendCloud Science & Technology Co., Ltd.<br>
 */
@Repository
public interface OrderDao  {

    void saveToOne(Order order);

    List<Order> findAllData();
}
