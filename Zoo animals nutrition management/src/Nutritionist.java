public class Nutritionist extends Employee{

    public Nutritionist(String name, long id, Zoo zoo) {
        super(name, id, zoo);
    }

    public Species addSpecies(String speciesName, double cal, double prot) {
        NutritionRequirement req = new NutritionRequirement(cal, prot);
        Species specie = new Species(speciesName, req);
        zoo.addSpeciesInternal(specie);
        System.out.println(this.name + " added species: " + speciesName);
        return specie;
    }

    public DietPlan createDiet(String name) {
        DietPlan dietPlan = new DietPlan(name);
        zoo.addDietPlanInternal(dietPlan);
        System.out.println(this.name + " created diet plan: " + name);
        return dietPlan;
    }

    public void addFoodToDiet(DietPlan dietPlan, FoodItem food) {
        dietPlan.addFoodItem(food);
        System.out.println(this.name + " added " + food.getName() + " to diet " + dietPlan.getName());
    }

    public void assignDietToAnimal(Animal animal, DietPlan dietPlan) {
        animal.setAssignedDiet(dietPlan);
        System.out.println(this.name + " assigned diet " + dietPlan.getName() + " to " + animal.getName());
    }

    public void viewAnimalNutritionNeeds(Animal animal) {
        System.out.println(this.name + " views nutritional needs for " + animal.getName() + ":");
        animal.printNutritionalNeeds();
    }
}
