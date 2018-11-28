package org.happybean.responsibility;

/**
 * @author wgt
 * @date 2018-11-26
 * @description 总监，可以批准40%以内的折扣
 **/
public class Director extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.4f) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
