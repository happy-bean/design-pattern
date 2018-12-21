package org.happybean.pattern.memento;

/**
 * @author wgt
 * @date 2018-12-21
 * @description
 **/
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
