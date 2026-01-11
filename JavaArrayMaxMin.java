import java.util.Scanner;

public class JavaArrayMaxMin {
    public static void main(String[] args) {
        int max;
        int min;
        int size;
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size:");
        size =s.nextInt();
        int x[]=new int [size];
        System.out.println("Enter "+size+" elements:");
        for(i=0;i<x.length;i++){
            x[i]=s.nextInt(); 
        }
        max=x[0];
        for(i=0;i<x.length;i++){
            if(max<x[i]){
                max=x[i];
            }
        }
        System.out.println("Largest number:"+max);

        min=x[0];
        for(i=0;i<x.length;i++){
            if(min>x[i]){
                min=x[i];
            }
        }
        System.out.println("Smallest number:"+min);
    }
}
