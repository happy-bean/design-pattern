package org.happybean.pattern.visitor;

/**
 * @author wgt
 * @date 2018-12-23
 * @description
 **/
public class Mouse  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
