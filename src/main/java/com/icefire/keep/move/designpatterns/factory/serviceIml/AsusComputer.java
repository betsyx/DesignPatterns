package com.icefire.keep.move.designpatterns.factory.serviceIml;

import com.icefire.keep.move.designpatterns.factory.service.Computer;

/**
 * @author: icefire
 * @date: 2022/5/18 15:10
 * @description:
 */
public class AsusComputer implements Computer {

    @Override
    public void cpu() {
        System.out.println("这是华硕的CPU");
    }

    @Override
    public void memory() {
        System.out.println("这是华硕的内存");
    }

    @Override
    public void cooling() {
        System.out.println("这是华硕的散热");
    }

    @Override
    public void disk() {
        System.out.println("这是华硕的硬盘");
    }

    @Override
    public void power() {
        System.out.println("这是华硕的电源");
    }

    @Override
    public void graphicsCard() {
        System.out.println("这是华硕的显卡");
    }
}
