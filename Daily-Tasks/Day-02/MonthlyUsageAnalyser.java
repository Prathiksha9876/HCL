
public class MonthlyUsageAnalyser {

    private static final int MONTHS_IN_YEAR = 12;
    private static final long LOW_USAGE_LIMIT = 150;
    private static final long MEDIUM_USAGE_LIMIT = 200;

    public static void main(String[] args) {

        // 1. Monthly usage data for 12 months
        int[] monthlyUsage = {
            120, 150, 135, 160,
            180, 175, 190, 200,
            185, 210, 220, 240
        };

        long totalUsage = 0L;
        int maxUsage = monthlyUsage[0];
        int minUsage = monthlyUsage[0];

        System.out.println("===== MONTHLY USAGE =====");

        // 2. Calculate total, maximum and minimum
        for (int month = 0; month < MONTHS_IN_YEAR; month++) {

            int usage = monthlyUsage[month];

            System.out.println(
                "Month " + (month + 1) + ": " + usage
            );

            totalUsage += usage;

            if (usage > maxUsage) {
                maxUsage = usage;
            }

            if (usage < minUsage) {
                minUsage = usage;
            }
        }

        // 3. Calculate average using type casting
        double averageUsage =
                (double) totalUsage / MONTHS_IN_YEAR;

        // 4. Assign grade using ternary operator
        char grade = averageUsage >= MEDIUM_USAGE_LIMIT
                ? 'A'
                : averageUsage >= LOW_USAGE_LIMIT
                ? 'B'
                : 'C';

        // 5. Display annual summary
        System.out.println("\n===== ANNUAL SUMMARY =====");
        System.out.println("Total Usage: " + totalUsage);
        System.out.println("Average Usage: " + averageUsage);
        System.out.println("Maximum Usage: " + maxUsage);
        System.out.println("Minimum Usage: " + minUsage);
        System.out.println("Usage Grade: " + grade);

        // 6. Demonstrate integer overflow and long
        int number = Integer.MAX_VALUE;
        long correctedNumber = (long) number + 1L;

        System.out.println("\n===== OVERFLOW CHECK =====");
        System.out.println("Integer Maximum: " + number);
        System.out.println("Integer after adding 1: " + (number + 1));
        System.out.println("Long after adding 1: " + correctedNumber);

        // 7. Two-dimensional array for three houses
        // Each house contains usage data for four weeks
        int[][] houseUsage = {
            {100, 120, 110, 130},
            {150, 140, 160, 155},
            {90, 95, 100, 105}
        };

        System.out.println("\n===== THREE HOUSE USAGE =====");

        for (int house = 0; house < houseUsage.length; house++) {

            long houseTotal = 0L;

            for (int week = 0;
                 week < houseUsage[house].length;
                 week++) {

                houseTotal += houseUsage[house][week];
            }

            System.out.println(
                "House " + (house + 1) + " Total: " + houseTotal
            );
        }
    }
}
