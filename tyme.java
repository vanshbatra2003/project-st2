import java.util.Scanner;

public class tyme {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tym=sc.nextLine();
        StringBuffer s=new StringBuffer(tym);
        // System.out.print((char)(s.charAt(0)-32));
        // System.out.println(s.substring(1,s.length()));
        // for(int i=0;i<s.length();i++){
        //     System.out.print((char)(s.charAt(i)-32));
        // }
        // System.out.println();
        // System.out.println(tym.toUpperCase());
        // System.out.print((char)(s.charAt(0)-32));
        // System.out.println(s.substring(1));
        // for(int i =0;i<s.length();i++){
        //     System.out.print((char)(s.charAt(i)-32));
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                System.out.print((char)(s.charAt(i)));
            }
            else{
                System.out.print((char)(s.charAt(i)-32));
            }
        }
        }
    }
    

