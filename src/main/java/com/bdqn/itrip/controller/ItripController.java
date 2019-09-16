package com.bdqn.itrip.controller;

import com.bdqn.itrip.exception.BusinessExcpetion;
import com.bdqn.itrip.exception.CommonReturnType;
import com.bdqn.itrip.exception.EmBusinessError;
import com.bdqn.itrip.pojo.ItripUser;
import com.bdqn.itrip.service.IItripsevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@ClassName:itripController
 *@Description:爱旅行用户控制器
 *@Author:lzq
 *@Date: 2019/9/12 10:25
 **/
@Controller
@RequestMapping("/itrip")
public class ItripController {
    @Autowired
    private IItripsevice iItripsevice;
    /**
     * Description:
     * param: 获取某个用户信息
     * return:
     * Date: 2019/9/12 10:32
     */
    @GetMapping("/getItripUserById/{id}")
    @ResponseBody
        public CommonReturnType getItripUserById(@PathVariable("id") Long id) throws BusinessExcpetion {
        ItripUser itripUser=iItripsevice.finItripUserById(id);
        if (itripUser==null){
            throw  new BusinessExcpetion(EmBusinessError.USER_NOT_EXIST);
        }
        return CommonReturnType.create(itripUser);
    }


    @GetMapping("/index")
    public  String index(Model model){
        model.addAttribute("username","张三");
        return "index";
    }
}
