package org.happybean.pattern.builder;

/**
 * @author wgt
 * @date 2018-11-30
 * @description 建造者模式
 **/
public class Builder {

    public static void main(String[] args) {
        People people = new People.PeopleBuilder().setAge(10).setName("tom").build();
    }
}
