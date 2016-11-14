package BuilderPattern;

/**
 * Created by xhon on 16-11-11.
 */
public class BuilderPatternDemo {

    public static void main(String[] args){

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost " + nonVegMeal.getCost());
    }


}
