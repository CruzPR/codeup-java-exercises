public class DishTest {
    public static void main(String[] args) {

    Dish dish1 = new Dish();

    dish1.setNameOfDish = "Sushi Roll";
    dish1.setCostInCents = 1000;
    dish1.setWouldRecommend = true;

    dish1.printSummary();


    Dish dish2 = new Dish(1000, "Cat Food", false);
    dish2.printSummary();

    DishTools.shoutDishName(dish2);

    DishTools.analyseDishCost(dish2);





    }

}