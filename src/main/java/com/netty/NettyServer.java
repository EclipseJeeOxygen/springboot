package com.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @Author lujiaming
 * @Date 2019/5/21
 * @Description
 **/
public class NettyServer {
    public static void start() throws Exception {
        /**
         * bossGroup, 父类的事件循环组只是负责连接，获取到连接后交给 workergroup子的事件循环组，
         * 参数的获取，业务的处理等工作均是由workergroup这个子事件循环组来完成，一个事件循环组一样
         * 可以完成所有的工作，但是Netty推荐的方式是使用两个事件循环组。
         */
        //创建父事件循环组
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        //创建子类的事件循环组
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            //创建启动服务器的对象
            ServerBootstrap serverBootstrap = new ServerBootstrap();

            /**
             * group方法接收两个参数， 第一个为父时间循环组，第二个参数为子事件循环组
             */
            serverBootstrap.group(bossGroup, workerGroup)
                    //bossGroup的通道，只是负责连接
                    .channel(NioServerSocketChannel.class)
                    //workerGroup的处理器，
                    .childHandler(new NettyServerInitializer());
            //绑定端口
            ChannelFuture channelFuture = serverBootstrap.bind(7777).sync();
            channelFuture.channel().closeFuture().sync();

        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
