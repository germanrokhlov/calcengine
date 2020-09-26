package com.pluralsight.calcengine;

public class Multiplier extends CalculateBase implements MathProcessing{

    public Multiplier () {}
    public Multiplier (double leftVal, double rightVal){
        super (leftVal, rightVal);
    }

    @Override
    public void calculate () {
        double value;
        value = getLeftVal() * getRightVal();
        setResult(value);
    }

    @Override
    public String keyword() {
        return "Multiply";
    }

    @Override
    public double doCalculations(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
