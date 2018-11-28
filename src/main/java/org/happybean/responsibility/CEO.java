package org.happybean.responsibility;

/**
 * @author wgt
 * @date 2018-11-26
 * @description CEO，可以批准55%以内的折扣，超过则拒绝
 **/
public class CEO extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.55f) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            System.out.format("%s拒绝了折扣：%.2f%n", this.getClass().getName(), discount);
        }
    }
}
