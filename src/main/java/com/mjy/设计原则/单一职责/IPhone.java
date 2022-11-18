package com.mjy.设计原则.单一职责;

/**
 * @Author: Mo Jianyue
 * @Description
 * @Date: 2022/11/18 10:39 AM
 * @Modified By
 */
public interface IPhone {
    void dial(String phoneNumber);
    void chat(Object o);
    void hangup();
}
