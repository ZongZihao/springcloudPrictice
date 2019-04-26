package cn.how2j.springcloud.service;

import cn.how2j.springcloud.mapper.CustomerMapper;
import cn.how2j.springcloud.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 宗子豪 on 2019-04-26
 */

@Service
public class CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    public List<Customer> CustomerList(){
        return customerMapper.findAll();
    }

    public Customer getCustomer(int id){
        return customerMapper.selectById(id);
    }

}
