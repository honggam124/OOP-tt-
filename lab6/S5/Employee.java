class Employee {
    protected String ID;
    protected String fullName;
    protected int yearJoined;
    protected double coefficientsSalary;
    protected int numDayOff;
    public Employee() {
        this.ID = "0" ;
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDayOff= 0;
    }
    public Employee(String ID, String fullName, double coefficientsSalary) {
        this.ID = ID ;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.yearJoined = 2020;
        this.numDayOff = 0;
    }
    public Employee(String ID, String fullName, double coefficientsSalary, int yearJoined, int numDayOff) {
        this.ID = ID ;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.yearJoined = yearJoined;
        this.numDayOff = numDayOff;
    }
    public double getSenioritySalary() {
        double basicSalary = 1150;
        double yearsOfWork = 2022 - this.yearJoined;
        double senioritySalary = yearsOfWork*basicSalary/100;
        return senioritySalary;
    }
    public String considerEmulation() {
        if(this.numDayOff <=1) return "A";
        else if(this.numDayOff <=3) return "B";
        return "C";
    }
    public double getSalary() {
        double basicSalary = 1150;
        double emulationCoefficient;
        emulationCoefficient = 0.5;
        if(considerEmulation().equals("A")==true) emulationCoefficient=1;
        else if(considerEmulation().equals("B")==true) emulationCoefficient=0.75;
        return basicSalary+basicSalary*(coefficientsSalary+emulationCoefficient)+getSenioritySalary();
    }

}