public class BmiService {
    public int calculate(int weight, int height) {
        int bmi = (int) (weight / (Math.pow(height, 2) / 10_000));
        return bmi;
    }

}
