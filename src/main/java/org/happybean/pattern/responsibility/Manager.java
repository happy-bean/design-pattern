package org.happybean.pattern.responsibility;

/**
 * @author wgt
 * @date 2018-11-26
 * @description 经理，可以批准30%以内的折扣
 **/
public class Manager extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.3f) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
