package com.soft.yann.controller;

import com.soft.yann.bean.Hr;
import com.soft.yann.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HrController {

    @Autowired
    HrService hrService;


    @RequestMapping(value = "/hr/{id}", method = RequestMethod.GET)
    public Hr queryHrById(@PathVariable Long id) {
        return hrService.queryHrById(id);
    }
}
