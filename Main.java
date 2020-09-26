package com.pluralsight.calcengine;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] statements = {
          "add 1.0 16.0",
          "divide 1.0 16.0",
          "multiply 1.0 2.0"
        };

       DynamicHelper helper = new DynamicHelper(new MathProcessing [] {

               new Adder(),
               new Divider(),
               new Multiplier()

       });

       for (String statement : statements){
           double output = helper.process(statement);
           System.out.println(output);

       }

    }
}


//String [] statements = {
//  "add 1.0 2.0",
//  "multiply 1.0 15.0",
//        "add 1.0",
//        "add XX 2.0",
//        "addX 2.0 2.0",
//
//};
//
//
//CalculateHelper helper = new CalculateHelper();
//for (String statement : statements) {
//    try {
//        helper.process(statement);
//        System.out.println(helper.result);
//    } catch (InvalidStatementException e) {
//        System.out.println(e.getMessage());
//    }
//}


//        Scanner in = new Scanner(System.in);
//        double leftVal = in.nextDouble();
//        double rightVal = in.nextDouble();
//
//        CalculateBase[] calculators = new CalculateBase[4];
//        calculators[0] = new Substractor (leftVal, rightVal);
//        calculators[1] = new Adder(10.0d, 5.0d);
//        calculators[2] = new Divider(10.0d, 0.0d);
//        calculators[3] = new Divider(10.0d, 15.0d);
//
//        for (CalculateBase calculator : calculators) {
//            calculator.calculate();
//            System.out.println(calculator.getResult());
//        }


