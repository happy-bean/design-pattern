package org.happybean.pattern.builder;

/**
 * @author wgt
 * @date 2018-11-30
 * @description
 **/
public class People {

    private String name;

    private int age;

    public People(PeopleBuilder builder) {
        this.age = builder.age;
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static class PeopleBuilder {

        private String name;

        private int age;

        public PeopleBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PeopleBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public People build() {
            return new People(this);
        }
    }
}
