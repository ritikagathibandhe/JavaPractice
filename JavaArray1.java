public class JavaArray1 {
    public static void main(String[] args) {
        int []x={10,20,30,40,50};
        System.out.println("Elements of Array: ");
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }

        for(int i=x.length-1;i>=0;i--){
            System.out.println(x[i]);
        }
    }
}
