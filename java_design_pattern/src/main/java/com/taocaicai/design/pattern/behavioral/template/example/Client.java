package com.taocaicai.design.pattern.behavioral.template.example;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 03:40:3:40
 * @description 模版方法
 */
public class Client {
    public static void main(String[] args) {
        StudyAbroad studyAbroad = new StudyInAmerica();
        studyAbroad.templateMethod();
    }
}
