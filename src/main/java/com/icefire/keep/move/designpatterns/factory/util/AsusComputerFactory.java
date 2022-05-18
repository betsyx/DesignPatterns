package com.icefire.keep.move.designpatterns.factory.util;

import com.icefire.keep.move.designpatterns.factory.service.AbstractComputerFactory;
import com.icefire.keep.move.designpatterns.factory.service.Computer;
import com.icefire.keep.move.designpatterns.factory.serviceIml.AsusDesktopComputer;
import com.icefire.keep.move.designpatterns.factory.serviceIml.AsusNoteBookComputer;

/**
 * @author: icefire
 * @date: 2022/5/18 17:59
 * @description:
 */
public class AsusComputerFactory extends AbstractComputerFactory {

    @Override
    public Computer createDesktopComputer() {
        return new AsusDesktopComputer();
    }

    @Override
    public Computer createNoteBookComputer() {
        return new AsusNoteBookComputer();
    }
}
