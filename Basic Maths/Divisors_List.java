import java.util.ArrayList;
import java.util.List;

public class Divisors_List {
    public static List<Integer> divisors(int n) {
        List<Integer> smallDivisors = new ArrayList<>();
        List<Integer> largeDivisors = new ArrayList<>();

        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                smallDivisors.add(i);

                if (i != n / i) {
                    largeDivisors.add(0, n / i);
                }
            }
        }

        // Combine lists
        smallDivisors.addAll(largeDivisors);
        return smallDivisors;
    }
}