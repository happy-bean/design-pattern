package org.happybean.pattern.responsibility;

/**
 * @author wgt
 * @date 2018-11-26
 * @description 副总裁，可以批准50%以内的折扣
 **/
public class VicePresident extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.50f) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
