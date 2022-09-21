public class FullTimeStaff extends  Staff {
    protected int baseSalary;
    protected double bonusRate;

    public FullTimeStaff(String sID, String sName, int baseSalary, double bonusRate) {
        super(sID, sName);
        this.baseSalary = baseSalary;
        this.bonusRate = bonusRate;
    }
    public int getBaseSalary() {
        return this.baseSalary;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getBonusRate() {
        return this.bonusRate;
    }
    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }
    public double paySalary(int workedDays) {
        double pre = 0.0;
        if(workedDays>21) 
            pre += ((double)workedDays-21)*100000.0;
        return ((double) this.baseSalary)*this.bonusRate+pre;
    }
    public String toString() {
        return super.sID + "_" + super.sName + "_" + this.bonusRate + "_" + this.baseSalary;
    }
}