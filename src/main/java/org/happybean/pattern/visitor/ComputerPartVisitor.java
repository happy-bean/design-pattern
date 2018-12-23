package org.happybean.pattern.visitor;

/**
 * @author wgt
 * @date 2018-12-23
 * @description
 **/
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
