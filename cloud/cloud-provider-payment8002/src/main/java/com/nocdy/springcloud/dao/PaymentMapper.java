package com.nocdy.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nocdy.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Nocdy
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
