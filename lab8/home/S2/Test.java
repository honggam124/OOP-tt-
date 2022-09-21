class Test {
    public static void main(String[] args) {
        Dictionary test = new Dictionary();
        test.put("Study", "hoc");
        test.put("Soccer","da banh");
        test.put("call", "goi");
        System.out.println(test.checkExists("call"));
        System.out.println(test.checkExists("phone"));
        System.out.println(test.get("Soccer"));
        System.out.println(test.get("play"));
    }
}