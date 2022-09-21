class Manager extends Employee {
    private String position;
    private String department; 
    private double salaryCoefficientPosition;
    public Manager(){
        super();
        this.position = "head of the office";
        this.department = "administrative office";
        this.salaryCoefficientPosition = 5.0;
    }
    public Manager(String ID, String fullName, double coefficientsSalary, String position, double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary);
        this.position = position;
        this.salaryCoefficientPosition=salaryCoefficientPosition;
        this.yearJoined=2020;
        this.numDayOff=0;
    }
    public Manager(String ID, String fullName, double coefficientsSalary, int yearJoined, int numDayOff,  String position, String department, double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary, yearJoined, numDayOff);
        this.position = position;
        this.department = department;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }
    public String considerEmulation(){
        return "A";
    }
    public double bonusByPosition() {
        double basicSalary = 1150;
        double positionBonus = basicSalary*salaryCoefficientPosition;
        return positionBonus;
    }
    public double getSalary() {
        double basicSalary = 1150;
        double sal = basicSalary+basicSalary*(coefficientsSalary + 0.5) + getSenioritySalary() + bonusByPosition();
        return sal;
    }
}

