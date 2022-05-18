package com.icefire.keep.move.designpatterns.factory.util;

import com.icefire.keep.move.designpatterns.consts.Const;
import com.icefire.keep.move.designpatterns.factory.service.Computer;
import com.icefire.keep.move.designpatterns.factory.serviceIml.AsusComputer;
import com.icefire.keep.move.designpatterns.factory.serviceIml.MsiComputer;
import org.springframework.util.ObjectUtils;

/**
 * @author: icefire
 * @date: 2022/5/18 15:16
 * @description:
 */
public class ComputerFactory {

    public Computer create(String type){
        if (ObjectUtils.isEmpty(type)){
            return null;
        }
        if (Const.msiComputer.equals(type)){
            return new MsiComputer();
        }
        if (Const.asusComputer.equals(type)){
            return new AsusComputer();
        }
        return null;
    }

}
