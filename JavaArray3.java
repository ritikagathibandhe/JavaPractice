import java.util.Scanner;

public class JavaArray3 {
    public static void main(String[] args) {
        int []x=new int[5];
        int []y=new int[5];
        int []z=new int[5];
        Scanner s=new Scanner(System.in);

        System.out.println("Enter elements of array1:");
        for(int i=0;i<x.length;i++)
        {
            x[i]=s.nextInt();
        }

        System.out.println("Enter elements of Array2:");
        for(int i=0;i<y.length;i++){
            y[i]=s.nextInt();
        }

        System.out.println("The addition of two arrays are:");
        for(int i=0;i<z.length;i++){
            z[i]=x[i]+y[i];
            System.out.println(" "+z[i]);
        }
    }   
}
