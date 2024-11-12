import java.util.Random;

public class DataStatistics {
    public static void run(){
        final int[] dataPoints = new int[100];
        Random rand = new Random();
        int MIN = 0;
        int MAX = 100;
        int item = InputHelper.getRangedInt("Enter an Integer from 1-100.", MIN, MAX);

        for(int i = 0; i< dataPoints.length; i++){dataPoints[i] = rand.nextInt(MAX)+1;} //+1 because rand goes from 0-99

        //prints all items in list
        for(int dataPoint : dataPoints){System.out.print(dataPoint + " | ");}

        int sum = InputHelper.getSum(dataPoints);
        int average = InputHelper.getAvg(dataPoints);
        int max = InputHelper.getMax(dataPoints);
        int min = InputHelper.getMin(dataPoints);
        int hits = InputHelper.getHits(dataPoints, item);

        System.out.println("\n\nSUM: "+sum+"\nAVERAGE: "+average+"\nMIN: "+min+"\nMAX: "+max+"\n\nYour selected number "+item+" appeared "+hits+" times.\n");
    }
}
