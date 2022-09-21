class ITStudent extends Student {
    int sID;
    public ITStudent(String sName, int gpa, int sID) {
        super(sName,gpa);
        this.sID = sID;
    }
    public String getRank() {
        if(super.gpa<=5) return "C";
        if(super.gpa<=8) return "B";
        return "A";
    }
    
}