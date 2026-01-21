public class GcdOfTwoNumbers {
    public static int GCD(int n1,int n2){
        if(n1<n2){
            int temp = n1;n1 = n2;n2 =temp;
        }
        int rem = n1%n2;
        if(rem != 0){
            return(GCD(n2,rem));
        }
        else
            return n2;
    }
    public static void main(String args[]){
        System.out.println(GCD(13,20));
        System.out.println(Math.pow(-2,31));
    }
}
