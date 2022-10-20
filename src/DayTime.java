public class DayTime{
    public static void main(String[] args) {
        int x; // зачем эта переменная?? если вводится другая ниже?
        for (int i = 1; i < 25; i++) {
            if (i<=12 && i>=6){
                System.out.println("Morning " + i + ":00");
            } else if (i>=12 && i<=18) {
                System.out.println("Day " + i + ":00");
            } else if (i>=18 && i<=22) {
                System.out.println("Evening " + i + ":00");
            } else if (i<=5 || i>=22) {
                System.out.println("Night " + i + ":00");
            } else {
                    System.out.println("Wrong number " + i + ". It's not a time");
                }
        }
    }
}