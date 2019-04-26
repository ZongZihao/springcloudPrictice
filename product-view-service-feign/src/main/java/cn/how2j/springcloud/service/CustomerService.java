package cn.how2j.springcloud.service;

import cn.how2j.springcloud.client.CustomerClientFeign;
import cn.how2j.springcloud.pojo.Customer;
import cn.how2j.springcloud.pojo.IdModel;
import cn.how2j.springcloud.web.CustomerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by 宗子豪 on 2019-04-26
 */
@Service
public class CustomerService {

    @Autowired
    CustomerClientFeign customerClientFeign;

    @RequestMapping("customerlist")
    public List<Customer> customerList(){
        return customerClientFeign.CustomerList();
    }

    @RequestMapping(value = "customer", method = RequestMethod.POST)
    public Customer getCustomer(@RequestBody IdModel model){
        return customerClientFeign.Customer(model);
    }

}
