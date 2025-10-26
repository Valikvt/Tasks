//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create Zoo
        Zoo zoo = new Zoo("Savannah Wildlife Park");

        // Hire staff
        Nutritionist alice = zoo.hireNutritionist("Alice", 12321);
        Zookeeper bob = zoo.hireZookeeper("Bob", 3221);

        // Nutritionist adds species
        Species lion = alice.addSpecies("Lion", 50, 15);

        // Zookeeper adds animal
        Animal simba = bob.addAnimal("Simba", 180, Sex.MALE, lion);

        // Nutritionist creates diet and food
        DietPlan lionDiet = alice.createDiet("Lion Standard Diet");
        alice.addFoodToDiet(lionDiet, new FoodItem("Beef", 2000, 150));
        alice.addFoodToDiet(lionDiet, new FoodItem("Chicken", 800, 60));
        lionDiet.setFeedingTime("09:00", "Morning Meal");
        lionDiet.setFeedingTime("17:00", "Evening Meal");

        // Assign diet
        alice.assignDietToAnimal(simba, lionDiet);

        // Nutritionist views needs
        alice.viewAnimalNutritionNeeds(simba);

        // Zookeeper serves food and checks schedule
        bob.serveFood(simba);
        bob.viewFeedingSchedule(simba);

    }
}