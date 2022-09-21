class Student extends Person {
    private String id;
    private int score;
    public Student(String name, int birthYear, String id, int score) {
        super(name, birthYear);
        this.id = id;
        this.score = score;
    }
    public String getID() {
        return this.id;
    }
    public void setID() {
        this.id = id;
    }
    public int getScore() {
        return this.score;
    }
    public void setScore() {
        this.score = score;
    }
    public String toString() {
        return "Name: "+super.getName()+", birth year: "+super.getBirthYear()+", id: "+this.id+", score: "+this.score;
    }
    
}