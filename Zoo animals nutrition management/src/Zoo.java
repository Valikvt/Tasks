import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String name;
    private List<Animal> animals = new ArrayList<>();
    private List<DietPlan> dietPlans = new ArrayList<>();
    private List<Species> speciesList = new ArrayList<>();
    private List<Zookeeper> zookeepers = new ArrayList<>();
    private List<Nutritionist> nutritionists = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    public Zookeeper hireZookeeper(String name, long id) {
        Zookeeper zookeeper = new Zookeeper(name, id, this);
        zookeepers.add(zookeeper);
        System.out.println("Hired Zookeeper: " + name);
        return zookeeper;
    }

    public Nutritionist hireNutritionist(String name, long id) {
        Nutritionist nutritionist = new Nutritionist(name, id, this);
        nutritionists.add(nutritionist);
        System.out.println("Hired Nutritionist: " + name);
        return nutritionist;
    }

    protected void addAnimalInternal(Animal animal) {
        animals.add(animal);
    }

    protected void addSpeciesInternal(Species species) {
        speciesList.add(species);
    }

    protected void addDietPlanInternal(DietPlan dietPlan) {
        dietPlans.add(dietPlan);
    }

    public void listAnimals() {
        System.out.println("Animals in " + name + ":");
        for (Animal a : animals)
            System.out.println("- " + a.getName() + " (" + a.getSpecies().getSpeciesName() + ")");
    }
}
