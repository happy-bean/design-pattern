package org.happybean.pattern.state;

/**
 * @author wgt
 * @date 2018-12-21
 * @description
 **/

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
