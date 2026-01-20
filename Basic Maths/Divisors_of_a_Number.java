public class Divisors_of_a_Number {
    public static void divisors(int n){
        int sq = (int) Math.sqrt(n);
        for(int i=1;i<=sq;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }

        int startLoop2 = sq;
        if(sq*sq == n)
            startLoop2 = sq - 1;

        for(int i = startLoop2;i>=1;i--){
            if(n%i==0){
                System.out.print(n/i + " ");
            }
        }
    }

    public static void main(String[] args){
        divisors(2);

    }
}