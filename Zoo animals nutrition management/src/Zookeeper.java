public class Zookeeper extends Employee{

    public Zookeeper(String name, long id, Zoo zoo) {
        super(name, id, zoo);
    }

    public Animal addAnimal(String name, double weight, Sex sex, Species species) {
        Animal animal = new Animal(name, weight, sex, species);
        zoo.addAnimalInternal(animal);
        System.out.println(this.name + " added a new animal: " + animal.getName());
        return animal;
    }

    public void recordWeight(Animal animal, double weight) {
        animal.setWeightKg(weight);
        System.out.println(this.name + " recorded new weight for " + animal.getName() + ": " + weight + " kg");
    }

    public void serveFood(Animal animal) {
        if (animal.getAssignedDiet() == null) {
            System.out.println("No diet assigned to " + animal.getName());
            return;
        }
        System.out.println(this.name + " is feeding " + animal.getName() + " according to " + animal.getAssignedDiet().getName());
        animal.getAssignedDiet().serve();
    }

    public void viewFeedingSchedule(Animal animal) {
        if (animal.getAssignedDiet() == null) {
            System.out.println(animal.getName() + " has no diet plan assigned.");
            return;
        }
        System.out.println(this.name + " views feeding schedule for " + animal.getName() + ":");
        animal.getAssignedDiet().showSchedule();
    }

    public void viewAnimals() {
        zoo.listAnimals();
    }
}
