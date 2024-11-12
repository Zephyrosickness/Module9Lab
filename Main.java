
public class Main {
    public static void main(String[] args) {
        boolean playAgain;

        do{
            DataStatistics.run();

            playAgain = InputHelper.getYN("Would you like to go again?");
        }while(playAgain);
    }
}