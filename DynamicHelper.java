package com.pluralsight.calcengine;

public class DynamicHelper {

    private MathProcessing [] handlers;

    public DynamicHelper (MathProcessing[] handlers){
        this.handlers = handlers;
    }

     public double process (String statement){

        String [] parts = statement.split(MathProcessing.splittingSymbol);
        String keyword = parts [0];

        MathProcessing theHandler = null;
        for (MathProcessing handler : handlers){
            if(keyword.equalsIgnoreCase(handler.keyword())){
                theHandler = handler;
                break;
            }
        }


        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);

        double result = theHandler.doCalculations(leftVal, rightVal);
        return result;
    }



}
