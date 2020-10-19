package com.oldwang.agent.demo1;

//代理模式
public class Proxy implements Rent{
    private Rent rent;

    public Proxy() {
    }

    public Proxy(Rent rent) {
        this.rent = rent;
    }

    public void rent() {
        seeHouse();
        rent.rent();
        fee();
        sign();
    }
    //看房
    public void seeHouse() {
        System.out.println("看房子");
    }
    //收费
    public void fee() {
        System.out.println("收中介费");
    }
    //合同
    public void sign() {
        System.out.println("签合同");
    }
}
