package com.icefire.keep.move.designpatterns.factory.service;

/**
 * @author: icefire
 * @date: 2022/5/18 15:04
 * @description:
 */
public interface Computer {

    /**
     * cpu
     */
    void cpu();

    /**
     * 内存
     */
    void memory();

    /**
     * 散热
     */
    void cooling();

    /**
     * 硬盘
     */
    void disk();

    /**
     * 电源
     */
    void power();

    /**
     * 显卡
     */
    void graphicsCard();
}
