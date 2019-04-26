package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Customer;
import cn.how2j.springcloud.pojo.IdModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 宗子豪 on 2019-04-26
 */
@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface CustomerClientFeign {

    @GetMapping("/customerlist")
    public List<Customer> CustomerList();

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public Customer Customer(IdModel model);

}
