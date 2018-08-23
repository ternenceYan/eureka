package com.imooc.eureka.test;

public class CompanyMerry implements ProxyInterface {

    private ProxyInterface proxyInterface;
    private ProxyInterface proxyInterface2;
    public CompanyMerry(){

    }
    public CompanyMerry(ProxyInterface proxyInterface,ProxyInterface proxyInterface2){
        this.proxyInterface = proxyInterface;
        this.proxyInterface2 = proxyInterface2;
    }
    @Override
    public void merry() {

        System.out.println("我们来安排。。。");
        proxyInterface.merry();
        proxyInterface2.merry();
        System.out.println("完毕。。。");
    }
}
