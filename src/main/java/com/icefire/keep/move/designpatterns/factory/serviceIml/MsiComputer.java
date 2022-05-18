package com.icefire.keep.move.designpatterns.factory.serviceIml;

import com.icefire.keep.move.designpatterns.factory.service.Computer;

/**
 * @author: icefire
 * @date: 2022/5/18 15:10
 * @description: 微星电脑
 */
public class MsiComputer implements Computer {

    @Override
    public void cpu() {
        System.out.println("这是微星的CPU");
    }

    @Override
    public void memory() {
        System.out.println("这是微星的内存");
    }

    @Override
    public void cooling() {
        System.out.println("这是微星的散热");
    }

    @Override
    public void disk() {
        System.out.println("这是微星的硬盘");
    }

    @Override
    public void power() {
        System.out.println("这是微星的电源");
    }

    @Override
    public void graphicsCard() {
        System.out.println("这是微星的显卡");
    }
}
