public class Main {
    public static void main(String[] args) {
        //5
        Food food = new Food();
        food.prepare(new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Да");
            }
        }, "Ананас");
    }
}