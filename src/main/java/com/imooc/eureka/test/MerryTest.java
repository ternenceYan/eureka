package com.imooc.eureka.test;

public class MerryTest {
    public static void main(String[] args) {
        ProxyInterface proxyInterface = new CompanyMerry(new HomeMerry(),new HomeMerry2());
        proxyInterface.merry();
    }
}
