package org.happybean.pattern.visitor;

/**
 * @author wgt
 * @date 2018-12-23
 * @description
 **/
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
