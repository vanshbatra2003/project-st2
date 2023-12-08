public class first {
    public static void main(String[] args) {
        int arr[]={3,3,1,2,3,3};
        int target =3;
        int sub=0;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    sub++;
                }
            }
        }
        System.out.println(sub*2);
    }
}
