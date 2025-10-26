public class Species {

    private String speciesName;
    private NutritionRequirement req;

    public Species(String speciesName, NutritionRequirement req){
        this.speciesName = speciesName;
        this.req = req;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public NutritionRequirement getNutritionRequirement(){
        return req;
    }
}
