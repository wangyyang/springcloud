package com.example.cloud.configserver.common;

import com.example.cloud.configserver.constants.MessageConstant;
import com.example.cloud.configserver.model.MSGModel;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class MQReceiver {

    /**
     * 按照exchange 和 key 进行匹配.
     * 订单消息接受商
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(MessageConstant.MSG_GLOBAL_EXCHANGE),
            key = MessageConstant.MSG_ORDER_ROUT_KEY,
            value = @Queue(value = MessageConstant.MSG_ORDER_QUEUE_NAME))
    )
    public void orderProcess(MSGModel message){
        System.out.println("order接收到的消息是:"+message.getName()+","+message.getAge()+","+message.getRemark());
    }


    /**
     * 按照exchange 和 key 进行匹配.
     * 职位消息接受商
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange(MessageConstant.MSG_GLOBAL_EXCHANGE),
            key = MessageConstant.MSG_JOB_ROUT_KEY,
            value = @Queue(value = MessageConstant.MSG_JOB_QUEUE_NAME))
    )
    public void jobProcess(MSGModel message){
        System.out.println("job接收到的消息是:"+message.getName()+","+message.getAge()+","+message.getRemark());
    }
}
