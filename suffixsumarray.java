public class suffixsumarray {
    public static void main(String[] args) {
        int arr []={2,5,6,1,3};
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                arr[i]=arr[i]+arr[j];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
