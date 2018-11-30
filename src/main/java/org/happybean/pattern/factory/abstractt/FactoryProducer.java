package org.happybean.pattern.factory.abstractt;

/**
 * @author wgt
 * @date 2018-11-30
 * @description
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
