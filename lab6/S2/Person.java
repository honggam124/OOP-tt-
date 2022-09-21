class Person {
    protected String name;
    protected String address;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress() {
        this.address = address;
    }
    public void setName() {
        this.name = name;
    }
    public String toString() {
        return "Name: "+this.name+", address: "+this.address;
    }
}