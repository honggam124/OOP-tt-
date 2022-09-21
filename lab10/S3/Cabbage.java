public class Cabbage implements Vegetable {
    private String type ="red";
    private double weight = 5;
    public String getinfo() {
        return this.type + ", "+ this.weight;
    }
}