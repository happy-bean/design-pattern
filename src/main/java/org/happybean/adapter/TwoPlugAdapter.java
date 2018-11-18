package org.happybean.adapter;

/**
 * @author wgt
 * @date 2018-11-18
 * @description 二相电转三相电转接口
 **/
public class TwoPlugAdapter implements ThreePlugIf {

    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug plug) {
        this.plug = plug;
    }

    public void powerWithThree() {

        System.out.println("转换");
        plug.powerWithTwo();
    }
}
