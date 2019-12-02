package com.example.cloud.configserver.controller;

import com.example.cloud.configserver.constants.MessageConstant;
import com.example.cloud.configserver.model.MSGModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @PostMapping("sendMsg")
    public Object sendMsg(){
        MSGModel msgModel=new MSGModel();
        msgModel.setName("订单");
        msgModel.setAge(2);
        msgModel.setRemark("this is order the first message");
        MSGModel jobModel=new MSGModel();
        jobModel.setName("职位");
        jobModel.setAge(23);
        jobModel.setRemark("this is the job first message");
        rabbitTemplate.convertAndSend(MessageConstant.MSG_GLOBAL_EXCHANGE,MessageConstant.MSG_ORDER_ROUT_KEY,msgModel);
        rabbitTemplate.convertAndSend(MessageConstant.MSG_GLOBAL_EXCHANGE,MessageConstant.MSG_JOB_ROUT_KEY,jobModel);
        return "success";
    }

/*    @PostMapping("getMsg")
    public Object getMsg(){

    }*/
}
