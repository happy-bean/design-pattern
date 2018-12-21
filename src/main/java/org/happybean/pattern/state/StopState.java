package org.happybean.pattern.state;

/**
 * @author wgt
 * @date 2018-12-21
 * @description
 **/
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
