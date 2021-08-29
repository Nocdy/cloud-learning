package com.nocdy.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nocdy.springcloud.dao.PaymentMapper;
import com.nocdy.springcloud.entites.Payment;
import com.nocdy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;


/**
 * @author Nocdy
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
}
