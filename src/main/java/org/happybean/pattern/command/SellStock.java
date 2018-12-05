package org.happybean.pattern.command;

/**
 * @author wgt
 * @date 2018-12-05
 * @description
 **/
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}