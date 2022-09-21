class Person {
    private String name;
    private int birthYear;
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public String getName() {
        return this.name;
    }
    public void setName() {
        this.name = name;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
    public void setBirthYear() {
        this.birthYear = birthYear;
    }
    public String toString() {
        return "Name: "+this.name+", birth year: "+this.birthYear;
    }
}