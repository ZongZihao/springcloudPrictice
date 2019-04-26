package cn.how2j.springcloud.web;

import cn.how2j.springcloud.pojo.Customer;
import cn.how2j.springcloud.pojo.IdModel;
import cn.how2j.springcloud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 宗子豪 on 2019-04-26
 */
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("customerlist")
    public Object customerlist() {
        List<Customer> list = customerService.customerList();
        return list;
    }

    @RequestMapping(value = "customer", method = RequestMethod.POST)
    public Object customer(@RequestBody IdModel model) {
        Customer customer = customerService.getCustomer(model);
        return customer;
    }

}
