import java.util.Scanner;

public class prefixsumarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,1,3,6,5};
        int pref []=new int[arr.length];
        // arr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int r=sc.nextInt();
        int l=sc.nextInt();
        int sum=arr[r+1]-arr[l-2];
        System.out.println(sum);
    }
}
