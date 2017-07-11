/**
 * PatternType: Build
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
 * 使用多个简单对象构建出一个复杂的对象
 * 将一个复杂的构建与其表现相分离, 使得同样的构建可的得到不同的对象
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
