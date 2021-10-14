public class Main {
    public static void main(String[] args) {

    BmiService service = new BmiService();
    double bmi = service.calculate ( 164,67);
    System.out.printf("BMI = "+"%.2f", bmi);

    }
}
