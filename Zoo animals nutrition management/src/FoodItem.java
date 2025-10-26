public class FoodItem {

    private String name;
    private double calories;
    private double protein;

    public FoodItem(String name, double calories, double protein){
        this.calories = calories;
        this.name = name;
        this.protein = protein;
    }

    public String getName(){
        return name;
    }

    public double getCalories(){
        return calories;
    }

    public double getProtein(){
        return protein;
    }
}
