public class BmiService {
    public int calculate (double heightMeters, double weightKg){
        double result = weightKg / (heightMeters * heightMeters);
        int index = (int) result;
        return index;

    }
}
