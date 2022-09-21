class MathStudent extends Student {
    String sID;
    public MathStudent(String sName, int gpa, String sID) {
        super(sName, gpa);
        this.sID = sID;
    }
    public String getRank() {
        if(super.gpa>=5) return "Passed";
        return "Failed";
    }
    public String toString() {
        return super.sName+"-"+this.sID+"-"+super.gpa;
    }
}