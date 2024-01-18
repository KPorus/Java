public class Selection {
    private static final int[] arr ={10,5,2,60,40,32};
    public static void main(String[] args) {
        
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length;j++) {
                if (arr[j]<arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
