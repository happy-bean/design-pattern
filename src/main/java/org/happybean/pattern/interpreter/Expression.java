package org.happybean.pattern.interpreter;

/**
 * @author wgt
 * @date 2018-12-05
 * @description
 **/
public interface Expression {
    public boolean interpret(String context);
}
