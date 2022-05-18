package com.icefire.keep.move.designpatterns.factory.serviceIml;

/**
 * @author: icefire
 * @date: 2022/5/18 17:56
 * @description:
 */
public class AsusDesktopComputer extends DesktopComputer {
    @Override
    public void cpu() {
        System.out.println("这是华硕台式电脑的CPU");
    }

    @Override
    public void memory() {
        System.out.println("这是华硕台式电脑的内存");
    }

    @Override
    public void cooling() {
        System.out.println("这是华硕台式电脑的散热");
    }

    @Override
    public void disk() {
        System.out.println("这是华硕台式电脑的硬盘");
    }

    @Override
    public void power() {
        System.out.println("这是华硕台式电脑的电源");
    }

    @Override
    public void graphicsCard() {
        System.out.println("这是华硕台式电脑的显卡");
    }
}
