package com.icefire.keep.move.designpatterns.factory.util;

import com.icefire.keep.move.designpatterns.factory.service.AbstractComputerFactory;
import com.icefire.keep.move.designpatterns.factory.service.Computer;
import com.icefire.keep.move.designpatterns.factory.serviceIml.MsiDesktopComputer;
import com.icefire.keep.move.designpatterns.factory.serviceIml.MsiNoteBookComputer;

/**
 * @author: icefire
 * @date: 2022/5/18 17:50
 * @description:
 */
public class MsiComputerFactory extends AbstractComputerFactory {

    @Override
    public Computer createDesktopComputer() {
        return new MsiDesktopComputer();
    }

    @Override
    public Computer createNoteBookComputer() {
        return new MsiNoteBookComputer();
    }
}
