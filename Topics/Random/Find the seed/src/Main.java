import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        Random random = new Random();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int d = b - a;
        int[] seeds = new int[k];
        //TODO create two nested for-loop
        //TODO make external loop to cycle from seed A to seed B
        for (int i = a; i < b; i++) {
            //TODO internal loop generate N random nums (0, K) and...
            for (int j = 0; j < n; j++) {
                seeds[j] = random.nextInt(k);
            }
            //TODO ...find max

        }
        //TODO record and output first seed for which max from internal loop in min
    }
}