class Reverse_Integer_LC7 {
    public int reverse(int n) {
        long rev = 0;
        while(n>0 || n<0){
            rev = (rev*10) + (n%10);
            n/=10;
        }
        if(rev<Integer.MIN_VALUE || (rev>Integer.MAX_VALUE)){
            return 0;
        }
        return (int)rev;
    }
}