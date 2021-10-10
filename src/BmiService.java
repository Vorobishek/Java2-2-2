public class BmiService {
    public double calculate (double height, double weight){
        double heightSquare = (height / 100) * (height / 100);
        double bmi = weight / heightSquare;
        return (bmi);
    }
}
