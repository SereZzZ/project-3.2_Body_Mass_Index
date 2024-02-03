public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeters = 1.87;
        double weightKg = 98;
        int index = service.calculate(heightMeters, weightKg);
        System.out.println("Body mass index: " + index);

    }
}