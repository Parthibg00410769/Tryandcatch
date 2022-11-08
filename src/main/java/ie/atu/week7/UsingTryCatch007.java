package ie.atu.week7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch007 {
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);
        char Y = 0;
        while (Y==0){
            try {
                System.out.println("Please enter a number between 0-9: ");
                int myNum = myscan.nextInt();
                if (myNum <= 9 && myNum > 0) {

                    System.out.println("You entered " + myNum);
                    break;


                }
            }catch (InputMismatchException e) {
                System.out.println("Not a valid number!!");
                System.out.println(e);
                myscan.next();



            }

        }


    }



}


