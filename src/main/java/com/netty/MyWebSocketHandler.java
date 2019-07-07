package com.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;

import java.net.InetSocketAddress;

/**
 * @Author lujiaming
 * @Date 2019/5/20
 * @Description 接收/处理/响应客户端websocket请求的核心业务处理类
 **/
public class MyWebSocketHandler extends SimpleChannelInboundHandler<Object> {
    private WebSocketServerHandshaker webSocketServerHandshaker;
    private static final String WEB_SOCKET_UEL = "ws://localhost:8888/websocket";
    /**
     * 服务端处理客户端websocket请求的核心方法
     * @param ctx
     * @param o
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object o) {
        System.out.println("server channelRead......");
        System.out.println(ctx.channel().remoteAddress()+"----->Server :"+ o.toString());
        //将客户端的信息直接返回写入ctx
        ctx.write("server say :"+o);
        //刷新缓存区
        ctx.flush();
    }

    /**
     * 客户端与服务端创建连接的时候调用
     * @param ctx
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx){
        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
        String clientIp = insocket.getAddress().getHostAddress();
    }

    /**
     * 客户端与服务端断开连接的时候调用
     * @param ctx
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx){
        NettyConfig.group.remove(ctx.channel());
        System.out.println("客户端与服务端连接关闭...");
    }

    /**
     * 服务端接收客户端发送过来的数据结束之后调用
     * @param ctx
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx){
        ctx.flush();
    }

    /**
     * 工程出现异常的时候调用
     * @param ctx
     * @param cause
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause){
        cause.printStackTrace();
        ctx.close();
    }
}
