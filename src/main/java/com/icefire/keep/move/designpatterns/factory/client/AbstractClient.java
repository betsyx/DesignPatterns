package com.icefire.keep.move.designpatterns.factory.client;

import com.icefire.keep.move.designpatterns.factory.service.Computer;
import com.icefire.keep.move.designpatterns.factory.util.AsusComputerFactory;
import com.icefire.keep.move.designpatterns.factory.util.MsiComputerFactory;

/**
 * @author: icefire
 * @date: 2022/5/18 18:11
 * @description: 抽象工厂
 */
public class AbstractClient {
    public static void main(String[] args) {
        MsiComputerFactory msi = new MsiComputerFactory();
        Computer desktopComputer = msi.createDesktopComputer();
        Computer noteBookComputer = msi.createNoteBookComputer();
        desktopComputer.cpu();
        desktopComputer.memory();
        desktopComputer.power();
        desktopComputer.disk();
        desktopComputer.cooling();
        desktopComputer.graphicsCard();

        noteBookComputer.cpu();
        noteBookComputer.memory();
        noteBookComputer.power();
        noteBookComputer.disk();
        noteBookComputer.cooling();
        noteBookComputer.graphicsCard();

        AsusComputerFactory asus = new AsusComputerFactory();
        Computer asusDesktopComputer = asus.createDesktopComputer();
        Computer asusNoteBookComputer = asus.createNoteBookComputer();
        asusDesktopComputer.cpu();
        asusDesktopComputer.memory();
        asusDesktopComputer.power();
        asusDesktopComputer.disk();
        asusDesktopComputer.cooling();
        asusDesktopComputer.graphicsCard();

        asusNoteBookComputer.cpu();
        asusNoteBookComputer.memory();
        asusNoteBookComputer.power();
        asusNoteBookComputer.disk();
        asusNoteBookComputer.cooling();
        asusNoteBookComputer.graphicsCard();
    }
}
