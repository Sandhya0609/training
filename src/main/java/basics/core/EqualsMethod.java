package basics.core;

public class EqualsMethod
{
    public static void main(String[] args)
    {
        String str1=new String("Sam");
        String str2="Sam";
       System.out.println("Hello..."+str1.equals(str2));//boolean result (equals is a method , compare the  memory location)
        System.out.println(str1==str2);//== is a operator ,compare primitive data types and also address


        int n1=10;
        int n2=10;
        if(n1==n2) {
            System.out.println("Numbers are Equal");
        }
        else {
            System.out.println("Not Equal");
        };
    }
}
