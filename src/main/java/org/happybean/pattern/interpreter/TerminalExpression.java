package org.happybean.pattern.interpreter;

/**
 * @author wgt
 * @date 2018-12-05
 * @description
 **/
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
