package com.bdqn.itrip.service.Impl;

import com.bdqn.itrip.dao.ItripUserMapper;
import com.bdqn.itrip.pojo.ItripUser;
import com.bdqn.itrip.service.IItripsevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *@ClassName:Itripsevice
 *@Description:爱旅行用户业务接口实现类
 *@Author:lzq
 *@Date: 2019/9/12 10:29
 **/
@Service
@Transactional
public class Itripsevice implements IItripsevice {
    @Autowired
    private ItripUserMapper itripUserMapper;
    @Override
    public ItripUser finItripUserById(Long id) {
        return itripUserMapper.selectByPrimaryKey(id);
    }
}
