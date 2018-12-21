package org.happybean.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wgt
 * @date 2018-12-21
 * @description
 **/
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
