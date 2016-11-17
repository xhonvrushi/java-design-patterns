package StrategyPattern;

/**
 * Created by xhon on 16-11-17.
 */
public class OperationMultiply implements Strategy{

    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
