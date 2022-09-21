public class Test {
    public static void main(String[] args) {

        VegetableFactory vegetable = new VegetableFactory();

        Vegetable veg1 = vegetable.getVegetable("Cabbage");
        System.out.println(veg1.getinfo());

        Vegetable veg2 = vegetable.getVegetable("carrot");
        System.out.println(veg2.getinfo()); 

        Vegetable veg3 = vegetable.getVegetable("pumpkin");
        System.out.println(veg3.getinfo());
    }
}