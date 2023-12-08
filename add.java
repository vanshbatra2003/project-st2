import java.util.ArrayList;
import java.util.*;

public class add {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=5;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<=n-1; i++){
            arr.add(scan.nextInt());
        }arr.remove(1);
      System.out.print(arr);      
    }
}
