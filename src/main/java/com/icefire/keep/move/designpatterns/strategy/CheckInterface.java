package com.icefire.keep.move.designpatterns.strategy;

import java.util.Date;
import java.util.List;

/**
 * @author: icefire
 * @date: 2022/7/21 15:17
 * @description: 统一封装接口类
 */
public interface CheckInterface {

    /**
     * 分模板分批次 检查核对
     * @param list
     * @param startTime
     * @param endDate
     * @param tid
     */
    void check(List<String> list, Date startTime, Date endDate, String tid);

}
