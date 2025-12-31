import java.util.Scanner;

public class AdditionofNums {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1=s.nextInt();
        System.out.println("Enter Second number:");
        int num2=s.nextInt();
        int addition=num1+num2;
        System.out.println("Addition of "+num1+" and "+num2+"="+addition);
    }
}
