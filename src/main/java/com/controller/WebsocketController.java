package com.controller;

import com.service.WebSocketServerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @Author lujiaming
 * @Date 2019/7/20
 * @Description
 **/
@RestController
@RequestMapping("/websocket")
public class WebsocketController {
    //推送数据接口
    @RequestMapping("/push/{cid}")
    public String pushToWeb(@PathVariable String cid, String message) {
        try {
            WebSocketServerService.sendInfo(message, cid);
        } catch (IOException e) {
            e.printStackTrace();
            return cid + "error--->" + e.toString();
        }
        return cid;
    }
}
