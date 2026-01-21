public class Armstrong_Number_LC1134 {
    public static boolean armstrongNumber(int n){
        int temp = n;
        int sum = 0;
        while(n>0){
            sum += (int)Math.pow((n%10),3);
            n /= 10;
        }
        if(sum == temp)
            return true;
        else
            return false;
    }
    public static void main(String args[]){

    }
}
