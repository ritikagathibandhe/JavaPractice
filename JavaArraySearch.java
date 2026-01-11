import java.util.Scanner;

public class JavaArraySearch {
    public static void main(String[] args) {
        int  size;
        int i;
        int loc=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array:");
        size=s.nextInt();
        int []x=new int[size];

        System.out.println("Enter Array of "+size+" elements:");
        for(i=0;i<x.length;i++){
            x[i]=s.nextInt();
        }

        System.out.println("Enter element to be searched:");
        int search=s.nextInt();

        for(i=0;i<x.length;i++){
            if(x[i]==search){
                loc=i+1;
                break;
            }
        }
        if (loc==0) {
            System.out.println("Location not found");
        }
        else{
            System.out.println("Element found at location:"+loc);
        }
    }
}
