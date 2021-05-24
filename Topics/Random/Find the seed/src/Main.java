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
        Integer[] maxSeeds = new Integer[k];
        Integer[] minSeeds = new Integer[b - a];
        int max = 0;
        int min;
        //TODO create two nested for-loop
        //TODO make external loop to cycle from seed A to seed B (inclusive)
        for (int i = a; i <= b; i++) {
            //TODO internal loop generate N random nums (0, K) and...
            for (int j = 0; j < n; j++) {
                maxSeeds[j] = random.nextInt(k);
            }
            //TODO ...find max
            max = Collections.max(Arrays.asList(maxSeeds));
            minSeeds[i] = max;
        }
        //TODO record and output first seed for which max from internal loop is min
        min = Collections.min(Arrays.asList(minSeeds));
        System.out.printf("%d\n%d", max, min);
    }
}