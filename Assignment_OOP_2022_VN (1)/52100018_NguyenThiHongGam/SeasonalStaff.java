class SeasonalStaff extends Staff {
    private int hourlyWage;

    public SeasonalStaff(String sID, String sName, int hourlyWage) {
        super(sID, sName);
        this.hourlyWage = hourlyWage;
    }
    public int getHourlyWage() {
        return this.hourlyWage;
    }
    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    public double paySalary(int workedHours) {
        return (double)this.hourlyWage*workedHours;
    }
    public String toString() {
        return super.sID + "_" + super.sName + "_" + this.hourlyWage;
    }
}