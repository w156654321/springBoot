package com.example.service.impl;

import com.example.dao.CustomerMapper;
import com.example.domain.Info;
import com.example.service.CustomerService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/***
 *
 * 描    述：
 *
 * 创 建 者： liudh
 * 创建时间： 2017/5/10 16:46
 * 创建描述：
 *
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public Info findAll() {
        Info info = customerMapper.findAll();
        return info;
    }
}
