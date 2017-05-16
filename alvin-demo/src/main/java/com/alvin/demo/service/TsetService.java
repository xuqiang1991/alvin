package com.alvin.demo.service;

import com.alvin.demo.mapper.TestMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by xu on 2017/5/3.
 */
@Service
@Transactional
public class TsetService {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(TsetService.class);

    @Autowired
    TestMapper testMapper;

    /**
     * mybatis测试
     * @return
     */
    public Long selsetOne(){
        Long l = testMapper.selsetOne();
        logger.info("mysql：" + l);
        return l;
    }

    /**
     * 分页测试
     */
    public void selsetList() {
        PageHelper.startPage(1, 10);
        List<String> ls = testMapper.selsetList();
        Page page = (Page) ls;
        Long total = page.getTotal();
        logger.info("total:" + total);
    }
}
