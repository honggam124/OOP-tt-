class Employee extends Person {
    private String id;
    private int salary;
    public Employee(String name, int birthYear, String id, int salary)  {
        super(name, birthYear);
        this.id = id;
        this.salary = salary;
    }
    public String getID() {
        return this.id;
    }
    public void setID() {
        this.id = id;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setSalary() {
        this.salary = salary;
    }
    public String toString() {
        return "Name: "+super.getName()+ ", birth year: "+super.getBirthYear()+", id: "+this.id+", salary: "+this.salary;
    }
}