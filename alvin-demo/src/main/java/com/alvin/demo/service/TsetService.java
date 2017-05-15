package com.alvin.demo.service;

import com.alvin.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xu on 2017/5/3.
 */
@Service
@Transactional
public class TsetService {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(TsetService.class);

    @Autowired
    TestMapper testMapper;

    public Long selsetOne(){
        Long l = testMapper.selsetOne();
        logger.info("mysql：" + l);
        return l;
    }
}
