public class BuzzFizz {
    static public void main(String[] args) {
        int i;
        for (i = 3; i <= 20; i++){
            System.out.print(i + " ");
            if (i % 3 == 0){
                System.out.print("buzz");
            }if (i % 5 == 0){
                System.out.print("fizz");
            }
            System.out.println();
        }
    }
}
