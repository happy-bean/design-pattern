package org.happybean.pattern.responsibility;

/**
 * @author wgt
 * @date 2018-11-26
 * @description 销售人员，可以批准5%以内的折扣
 **/
public class Sales extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.05f) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
