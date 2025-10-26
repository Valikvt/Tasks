public class NutritionRequirement {

    private double caloriesRequirements;
    private double proteinRequirements;

    public NutritionRequirement(double caloriesRequirements, double proteinRequirements){
        this.caloriesRequirements = caloriesRequirements;
        this.proteinRequirements = proteinRequirements;
    }

    public double calculateDailyCalories(double weightKg){
        return weightKg * caloriesRequirements;
    }

    public double calculateDailyProtein(double weightKg){
        return weightKg * proteinRequirements;
    }
}
