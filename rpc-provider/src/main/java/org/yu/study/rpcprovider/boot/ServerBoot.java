package org.yu.study.rpcprovider.boot;


import org.yu.study.rpcprovider.service.UserServiceImpl;
/**
 * @Author: YHY
 * @desc: todo
 * @Date: 2022/3/20
 */
public class ServerBoot {

    public static void main(String[] args) throws InterruptedException {
        //启动服务器
        UserServiceImpl.startServer("127.0.0.1", 8999);
    }
}
