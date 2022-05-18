package com.icefire.keep.move.designpatterns.factory.serviceIml;

import com.icefire.keep.move.designpatterns.factory.service.Computer;

/**
 * @author: icefire
 * @date: 2022/5/18 17:41
 * @description: 台式电脑
 */
public abstract class DesktopComputer implements Computer {

    /**
     * cpu
     */
    @Override
    public abstract void cpu();

    /**
     * 内存
     */
    @Override
    public abstract void memory();

    /**
     * 散热
     */
    @Override
    public abstract void cooling();

    /**
     * 硬盘
     */
    @Override
    public abstract void disk();

    /**
     * 电源
     */
    @Override
    public abstract void power();

    /**
     * 显卡
     */
    @Override
    public abstract void graphicsCard();
}
