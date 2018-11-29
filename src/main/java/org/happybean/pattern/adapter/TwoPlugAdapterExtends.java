package org.happybean.pattern.adapter;

/**
 * @author wgt
 * @date 2018-11-18
 * @description
 **/
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {

    @Override
    public void powerWithThree() {
        System.out.println("转换");
        this.powerWithTwo();
    }
}
