package com.bdqn.itrip.service;

import com.bdqn.itrip.pojo.ItripUser;

/**
 *@ClassName:IItripsevice
 *@Description:爱旅行用户业务接口
 *@Author:lzq
 *@Date: 2019/9/12 10:29
 **/
public interface IItripsevice {

    ItripUser finItripUserById(Long id);
}
