package com.icefire.keep.move.designpatterns.factory.service;

import com.icefire.keep.move.designpatterns.factory.service.Computer;

/**
 * @author: icefire
 * @date: 2022/5/18 17:36
 * @description: 抽象工厂类
 */
public abstract class AbstractComputerFactory {

    public abstract Computer createDesktopComputer();

    public abstract Computer createNoteBookComputer();

}
