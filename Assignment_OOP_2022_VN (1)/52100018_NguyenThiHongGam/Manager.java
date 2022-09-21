public class Manager extends FullTimeStaff {
    private int allowance;

    public Manager(String sID, String sName, int baseSalary,
                 double bonusRate, int allowance) {
                    super(sID, sName, baseSalary, bonusRate);
                    this.allowance = allowance;
    }
    public int getAllowance() {
        return this.allowance;
    }
    public double paySalary(int workedDays) {
        return (double) super.paySalary(workedDays) + (double) this.allowance;
    }
    public String toString() {
        return super.sID + "_" + super.sName + "_" + super.bonusRate + "_" + super.baseSalary + "_" + this.allowance; 
    }
}