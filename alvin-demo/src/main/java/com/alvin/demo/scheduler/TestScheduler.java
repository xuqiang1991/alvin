package com.alvin.demo.scheduler;

import com.alvin.demo.service.TsetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * Created by xu on 2017/5/3.
 */
@Component
public class TestScheduler {
    private final Logger logger = LoggerFactory.getLogger(TestScheduler.class);

    @Autowired
    TsetService tsetService;

    @Scheduled(cron="0 0/1 * * * ?") //每分钟执行一次
    public void statusCheck(){
        logger.info("0 0/1 * * * ?  --------  开始……");
        tsetService.selsetOne();
        tsetService.selsetList();
        logger.info("0 0/1 * * * ?  --------  结束");
    }



}
