package com.pluralsight.calcengine;

public class Divider extends CalculateBase implements MathProcessing {

 public Divider (){}
 public Divider (double leftVal, double rightVal){
     super (leftVal, rightVal);
 }

 @Override
    public void calculate (){
     double value = getRightVal() == 0 ? 0.0 : getLeftVal() / getRightVal();
     setResult(value);
 }

 @Override
    public String keyword(){
     return "Divide";

 }

 @Override
 public double doCalculations(double leftVal, double rightVal){
     setLeftVal(leftVal);
     setRightVal(rightVal);
     calculate();
     return getResult();
 }

}

