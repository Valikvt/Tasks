import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String name;
    private double weightKg;
    private Sex sex;
    private Species species;
    private DietPlan assignedDiet;

    public Animal(String name, double weightKg, Sex sex, Species species){
        this.name = name;
        this.weightKg = weightKg;
        this.sex = sex;
        this.species = species;
    }

    public String getName(){
        return name;
    }

    public Species getSpecies() {
        return species;
    }

    public DietPlan getAssignedDiet() {
        return assignedDiet;
    }

    public void setAssignedDiet(DietPlan assignedDiet){
        this.assignedDiet = assignedDiet;
    }

    public double getWeightKg(){
        return weightKg;
    }

    public void setWeightKg(double weightKg){
        this.weightKg = weightKg;
    }

    public void printNutritionalNeeds(){
        NutritionRequirement req = species.getNutritionRequirement();
        double calories = req.calculateDailyCalories(weightKg);
        double protein = req.calculateDailyProtein(weightKg);

        System.out.println(name + "( " + species.getSpeciesName() + " ) requires: ");
        System.out.println(calories + " kcal per day");
        System.out.println(protein + " g of protein per day");
    }
}
