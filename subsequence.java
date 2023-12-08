import java.util.*;
public class subsequence {

    public static void subsequence(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char cur=s.charAt(0);
        String remString=s.substring(1);
        subsequence(remString, ans+cur);
        subsequence(remString, ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        subsequence(s,"");
        System.out.println();
    }
}
