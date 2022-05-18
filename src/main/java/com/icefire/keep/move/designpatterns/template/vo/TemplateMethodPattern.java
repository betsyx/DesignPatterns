package com.icefire.keep.move.designpatterns.template.vo;

import lombok.Data;

/**
 * @author: icefire
 * @date: 2022/5/18 11:29
 * @description:
 */
@Data
public class TemplateMethodPattern {

    public void TemplateMethd(){
        this.getUp();
        this.eat();
        this.practice();
    }

    public void getUp(){
        System.out.println("我起床啦");
    }

    public void eat(){
        System.out.println("我吃饭啦");
    }

    public void practice(){
        System.out.println("我锻炼啦");
    }

}
