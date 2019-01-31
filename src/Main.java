import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, World!");
        /* Integer type
        // 64 bit : -2^63 <= x <= 2^63 -1
        long myLongValue = 64L;
        // 32 bit : -2_147_483_648 <= x <= 2_147_483_647
        int  myIntValue = 32;
        // 16 bit : -32768 <= x <= 32767
        short myShortValue = 16;
        // 8 bit : -128 <= x <= 127
        byte myByteValue =  8;

        //Double precision type
        float myFloatValue = 32f;
        // 64 bit : 16 digits precision
        // faster on modern computers
        // built-in functions (sin, cos) use double by default
        double myDoubleValue = 64d;
        // 16 bit
        char myChar = '\u00A9';
        boolean isName = true;
        String myString = "Hello";
        boolean wasCar = isCar ? true:false;*/
        int score = calculateScore("Tim",500);
        calculateScore(500);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score*1000;
    }

    public static void calculateScore(){
        System.out.println("No player name, no player score");
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        if(a-b<0.001){
            return true;

        }else{
            return false;
        }

    }
    public static boolean bark(boolean barking, int hourOfDay){
        boolean wakeUp = false;

        if(barking){
            System.out.println("Here");
            if(hourOfDay < 8 || hourOfDay > 22){
                System.out.println("Here2");
                wakeUp = true;
            }
        }

        if(hourOfDay<0 || hourOfDay>23){
            System.out.println("Here3");
            wakeUp=false;
        }

        return wakeUp;

    }

    private static int calculateHighScore(int score){
        var position = new AtomicInteger(4);

        if( score >= 1000 ) {
            position.set(1);
        } else if( score >= 500 ){
            position.set(2);
        } else if( score >= 100 ){
            position.set(3);
        }

        return position.get();

    }

    private static void printHighScore(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static void printMegaAndKiloByte(int kiloBytes){
        int MB = kiloBytes/1024;
        int KB_remainder = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB="+MB+" MB and " + KB_remainder + " KB");
    }


}
