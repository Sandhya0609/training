package basics.core;
//Write a program to print prime numbers between 10 and 99. For Loop


public class PrimeNumbers {
    public static void main(String[] args) {
        for(int i=10;i<100;i++){
            if(i%2!=0){
                System.out.println(i);

            }
        }
    }
}
