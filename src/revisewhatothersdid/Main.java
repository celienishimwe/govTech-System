package revisewhatothersdid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter an value integer:");
//        int number = scan.nextInt();
//
//        if(number < 0){
//            System.out.println("this number is negative");
//        }
//        else if( number>0 && number <100 ){
//            System.out.println("this number is btn o and 100");
//        }else{
//            System.out.println("this number is above 100");
//        }
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter number of your class:");
//        int number = scn.nextInt();
//
//        switch(number){
//            case 1:
//                System.out.println("Class A");
//                break;
//            case 2:
//                System.out.println("Class B");
//                break;
//            case 3:
//                System.out.println("Class C");
//                break;
//            default:
//                System.out.println("Invalid Input");
//        }

        Scanner scn = new Scanner(System.in);
        int number;
        do{
            System.out.println("Enter a positive number:");
            number = scn.nextInt();
            }
        while(number < 0);
        System.out.println("positive number received.");

        for(int i=1; i <= number; i++ ){
            System.out.println(i);
        }
        System.out.println("count from largest.");
        int j=number;
        while(j>=0){
            System.out.println(j);
            j--;
        }
        System.out.println("Star Pattern");

        int i;
        int t;
        for(i = 0 ; i < number; i++){
            for(t = 0; t <= i; t++){
                System.out.println("*");
            }
        }


    }
}
