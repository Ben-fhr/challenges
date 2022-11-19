import java.util.Scanner;

public class challenge9 {
    public static void main(String args[]) {

        // int check;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number you are unsure about being a prime number");
        int number = sc.nextInt();

        //int[] arrPrim = { 2, 3, 5, 7 };
        //int[] arrNoPrim = { 0, 1 };

        // check = number-1;
        /*
         * for(int i=1; i< number; i++){
         * if(number%i == 0){
         * System.out.println(number+" is not a prime number")
         * }else{
         * System.out.println(number+" is indeed a prime number");
         * }
         * }
         */

        if(number == 0 || number == 1){
            System.out.println(number + " is not a prime number");
        }else if(number == 2 || number == 3 || number == 5 || number == 7){
            System.out.println(number+ " is a prime number");
        }else if (number / 1 == number && number / number == 1 && number % 2 != 0 && number % 3 != 0 && number % 5 != 0
                    && number % 7 != 0) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }

        sc.close();

    }
/* 
    public static Boolean isPrimeNum(int number, int[] arrPrim) {
        for (int i = 0; i <= arrPrim.length - 1; i++) {
            if (number == arrPrim[i]) {
                System.out.println("This is a prime number");
                return true;
            } else {
                return false;
            }
        }
        return false;
        
    }

    public static Boolean isNoPrimeNum(int number, int[] arrNoPrim) {
        for (int i = 0; i <= arrNoPrim.length - 1; i++) {
            if (number == arrNoPrim[i]) {
                System.out.println("This is no prime number");
                return true;
            } else {
                return false;
            }
        }
        return false;
    }*/
}
