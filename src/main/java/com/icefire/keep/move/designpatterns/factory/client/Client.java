package com.icefire.keep.move.designpatterns.factory.client;

import com.icefire.keep.move.designpatterns.consts.Const;
import com.icefire.keep.move.designpatterns.factory.ComputerFactory;
import com.icefire.keep.move.designpatterns.factory.service.Computer;

/**
 * @author: icefire
 * @date: 2022/5/18 15:12
 * @description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        Computer msiComputer = new ComputerFactory().create(Const.msiComputer);
        msiComputer.cooling();
        msiComputer.cpu();
        msiComputer.disk();
        msiComputer.graphicsCard();
        msiComputer.memory();
        msiComputer.power();

        Computer asusComputer = new ComputerFactory().create(Const.msiComputer);
        asusComputer.cooling();
        asusComputer.cpu();
        asusComputer.disk();
        asusComputer.graphicsCard();
        asusComputer.memory();
        asusComputer.power();
    }
}
