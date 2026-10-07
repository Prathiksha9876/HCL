
class MonthlyUsageAnalyser {
    public static void main(String[] args) {

        int[] usage = {
            120, 150, 180, 200,
            170, 190, 220, 250,
            210, 230, 260, 300
        };

        System.out.println("Monthly usage:");
        
        for (int i = 0; i < usage.length; i++) {
            System.out.println("Month " + (i + 1) + ": " + usage[i]);
        }
int total = 0;

for (int value : usage) {
    total += value;
}

System.out.println("Total: " + total);
double average = (double) total / usage.length;

System.out.println("Average: " + average);

int max = usage[0];
int min = usage[0];

for (int value : usage) {
    if (value > max) {
        max = value;
    }

    if (value < min) {
        min = value;
    }
}

System.out.println("Maximum: " + max);
System.out.println("Minimum: " + min);
char grade = average >= 200 ? 'A' : 'B';

System.out.println("Grade: " + grade);
long largeNumber = 2_000_000_000L;
long result = largeNumber + largeNumber;

System.out.println(result);
int[][] houseUsage = {
    {120, 150, 180},
    {200, 170, 190},
    {220, 250, 210}
};
for(int i = 0; i < houseUsage.length; i++) {
    for(int j = 0; j < houseUsage[i].length; j++) {
        System.out.print(houseUsage[i][j]+" ");
    }
    System.out.println();
}
}    
}
