public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 74;
        double height = 174;
        double bmi = service.calculate(mass, height);
        System.out.println(bmi);
    }
}