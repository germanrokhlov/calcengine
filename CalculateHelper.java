package com.pluralsight.calcengine;

public class CalculateHelper {

  MathCommand command;
  double leftValue;
  double rightValue;
  double result;


  public void process (String statement) throws InvalidStatementException{

      String[] parts = statement.split(" ");
      if (parts.length != 3)
          throw  new InvalidStatementException("incorrect number of fields", statement);
      String commandstr = parts[0];


      try {
          leftValue = Double.parseDouble(parts[1]);
          rightValue = Double.parseDouble(parts[2]);
      } catch (NumberFormatException e){

          throw new InvalidStatementException("Non-numeric data", statement ,e);
      }
      command = null;
      cmdfromstring(commandstr);

      if (command == null)
          throw new InvalidStatementException("Invalid command", statement);

      CalculateBase helper = null;

      switch (command){
          case Add:
              helper = new Adder(leftValue, rightValue);
              break;
          case Multiply:
              helper = new Multiplier(leftValue, rightValue);
              break;

      }

      helper.calculate();
      result = helper.getResult();

  }

  private void cmdfromstring (String commandstr){

      if (commandstr.equalsIgnoreCase(MathCommand.Add.toString()))
          command = MathCommand.Add;
      else if (commandstr.equalsIgnoreCase(MathCommand.Multiply.toString()))
          command = MathCommand.Multiply;

  }


    }
