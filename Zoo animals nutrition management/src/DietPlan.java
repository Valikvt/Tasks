import java.util.ArrayList;
import java.util.List;

public class DietPlan {

    private String name;
    private List<FoodItem> foodItems = new ArrayList<>();
    private FeedingSchedule schedule = new FeedingSchedule();

    public DietPlan(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addFoodItem(FoodItem foodItem){
        foodItems.add(foodItem);
        System.out.println(foodItem.getName() + " has been added to the diet " + name);
    }

    public void setFeedingTime(String time, String description){
        schedule.addFeedingTime(time, description);
    }

    public void showSchedule(){
        schedule.printSchedule();
    }

    public void serve(){
        System.out.println("Food has been served for " + name);
        for (FoodItem f : foodItems){
            System.out.println(f.getName() + " : " + f.getCalories() + "kcal");
        }
    }
}
