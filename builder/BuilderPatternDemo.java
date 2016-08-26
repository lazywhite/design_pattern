/**
 * PatternType: Creation
 * Item: interface 
 *      Burger: abstract class
 *          VegBurger
 *          ChickenBurger
 *      ColdDrink
 *          Coke
 *          Pepsi
 *
 * Meal: a list of Item
 *      addItem
 *      getCost()
 *      showItems
 * MealBuilder: return a Meal 
 *
 *
**/
public class BuilderPatternDemo{
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("\tTotal Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("None Veg Meal");
        nonVegMeal.showItems();
        System.out.println("\tTotal Cost: " + nonVegMeal.getCost());

    }
}
