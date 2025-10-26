public abstract class Employee {

    protected String name;
    protected long employeeId;
    protected Zoo zoo;

    public Employee(String name, long employeeId, Zoo zoo){
        this.name = name;
        this.employeeId = employeeId;
        this.zoo = zoo;
    }

    public String getName(){
        return name;
    }

    public Zoo getZoo(){
        return zoo;
    }
}
