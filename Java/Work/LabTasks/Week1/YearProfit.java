package Java.Work.LabTasks.Week1;

public class YearProfit {
    public static void main(String[] args) {
        double investment = 1000.0;
        double rate = 0.05;
        int years = 10;

        for (int i=1; i<=years; i++){
            double profit = investment * Math.pow(1+rate, i);
            String output = i + " year    profit is: "+profit;
            System.err.println(output);
        }
    }
}
