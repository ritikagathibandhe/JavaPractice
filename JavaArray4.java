import java.util.Scanner;

public class JavaArray4 {
    public static void main(String[] args) {
        int []x=new int[5];
        int count1=0;
        int count2=0;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Array Elements:");
        for(int i=0;i<x.length;i++)
        {
            x[i]=s.nextInt();
        }

        System.out.println("The positive elements are:");
        for(int i=0;i<x.length;i++)
        {
            if(x[i]>0)
                {
                    System.out.println(x[i]);
                    count1+=1;

                }      
        }
        System.out.println("The total positive numbers are:"+count1);

        System.out.println("The negative elements are:");
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
            count2+=1;

            //incomplete
        }
    }
}
