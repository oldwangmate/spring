package com.oldwang.agent.demo1;

public class Client {

    public static void main(String[] args) {
        //房东要租房子
        HostMaster hostMaster = new HostMaster();
        //代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(hostMaster);
        //看不到房东，但通过代理，还是租到了房子
        proxy.rent();
    }
}
