import java.util.Scanner;

public class JavaArrayEvenOdd {
    public static void main(String[] args) {
        int []x=new int[5];
        int count1=0;
        int count2=0;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Array elements:");
        for(int i=0;i<x.length;i++){
            x[i]=s.nextInt();
        }

        System.out.println("The even numbers are:");
        for(int i=0;i<x.length;i++){
            if(x[i]%2==0)
            {
                System.out.println(x[i]);
                count1+=1;
            }
        }
        System.out.println("The total even elements are:"+count1);

        System.out.println("The odd elements are:");
        for(int i=0;i<x.length;i++){
            if(x[i]%2!=0){
                System.out.println(x[i]);
                count2+=1;
            }
        }
        System.out.println("The total odd elements are:"+count2);
    }
}
