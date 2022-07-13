package com.icefire.keep.move.designpatterns.strategy;

import org.springframework.stereotype.Component;

/**
 * @author: icefire
 * @date: 7/14/2022 12:07 AM
 * @description:
 */
@Component
public class MechantMethodStrategy implements MethodStrategy{

    @Override
    public String request(String value) {
        return null;
    }
}
