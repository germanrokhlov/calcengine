package com.pluralsight.calcengine;

public class Adder extends CalculateBase implements MathProcessing{


    public Adder (){}
    public Adder (double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
         setResult(result);
    }

    @Override
    public String keyword(){
        return "Add";
    }

    @Override
    public double doCalculations(double leftVal, double rightVal){
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }

}
