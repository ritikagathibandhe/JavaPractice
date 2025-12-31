import java.util.Scanner;

public class JavaArray2 {
    public static void main(String[] args) {
        int []x=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter s elements:");
        for(int i=0;i<x.length;i++){
            x[i]=s.nextInt();

        }
        System.out.println("The elements are:");
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}
