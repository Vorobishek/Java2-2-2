public class Main {
    public static void main(String[] args) {
    double height = 164;
    double weight = 67;

    BmiService service = new BmiService();
    double bmi = service.calculate ( height,weight);
    System.out.printf("BMI = "+"%.2f", bmi);

    }
}
