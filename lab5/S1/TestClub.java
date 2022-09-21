public class TestClub {
    public static void main(String[] args) {
        Club test = new Club();
        Club test1 = new Club("Gam",1,2,3);
        Club test2 = new Club(test1);
        Club test3 = new Club("Thinh",6,2,2);
        System.out.println("----default:");
        System.out.println(test.toString());
        System.out.println(test.isFinish());
        System.out.println(test.getPoints());
        System.out.println("----Test 1:");
        System.out.println(test1.toString());
        System.out.println(test1.isFinish());
        System.out.println(test1.getPoints());
        System.out.println("----Test 2: Copy");
        System.out.println(test2.toString());
        System.out.println(test2.getPoints());
        System.out.println("----Test 3:");
        System.out.println(test3.toString());
        System.out.println(test3.isFinish());
        System.out.println(test3.getPoints());
    }
}
