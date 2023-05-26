package basics.core;
//Write a program to print first 5 values which are divisible by 2, 3, and 5. While Loop


import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        int num =1;
        List<Integer> list=new ArrayList<Integer>();
        while(num<=150){
            if(num%2==0 && num%3==0 && num%5==0){
                list.add(num);
            }
            num++;
        }
        System.out.println("First 5 numbers divisible by 2,3 and 5 are :" +list);

//        for(int i=1;i<150;i++){
//            if(i%2==0 && i%3==0 && i%5==0){
//                System.out.println(i+" divisible by 2 , 3 and 5  for loop");
//            }
//      }

    }
}
