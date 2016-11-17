package StrategyPattern;

/**
 * Created by xhon on 16-11-17.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("11 + 2 = " + context.executeStrategy(11, 2));

        context = new Context(new OperationSubstract());
        System.out.println("19 - 5 = " + context.executeStrategy(19, 5));

        context = new Context(new OperationMultiply());
        System.out.println("8 * 3 = " + context.executeStrategy(8, 3));
    }
}
