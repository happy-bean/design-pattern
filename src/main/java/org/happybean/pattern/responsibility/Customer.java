package org.happybean.pattern.responsibility;

/**
 * @author wgt
 * @date 2018-11-26
 * @description 客户，请求折扣
 **/
public class Customer {

    private PriceHandler handler;

    public void setHandler(PriceHandler handler) {
        this.handler = handler;
    }

    public void requestDiscount(float discount){
        handler.processDiscount(discount);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setHandler(PriceHandler.createPriceHandler());
        customer.requestDiscount(0.55f);
    }
}
