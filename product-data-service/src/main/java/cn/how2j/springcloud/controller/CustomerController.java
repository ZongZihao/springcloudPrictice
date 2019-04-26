package cn.how2j.springcloud.controller;

import cn.how2j.springcloud.pojo.Customer;
import cn.how2j.springcloud.pojo.IdModel;
import cn.how2j.springcloud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 宗子豪 on 2019-04-26
 */
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/customerlist")
    public Object customerList(){
        List<Customer> list = customerService.CustomerList();
        return list;
    }

    @PostMapping("/customer")
    public Object customer(@RequestBody  IdModel model){
        Customer customer = customerService.getCustomer(model.getId());
        return customer;
    }

}
