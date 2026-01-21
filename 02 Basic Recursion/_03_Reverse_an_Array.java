public class _03_Reverse_an_Array {
    public void reverseArray(int arr[]) {
        int p1 = 0, p2 = arr.length-1;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }

    }
}
