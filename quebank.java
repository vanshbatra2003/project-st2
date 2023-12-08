// public class quebank {
//     public static void main(String[] args) {
//         String str[]="chitkara is the best collage".split(" ");
//         int max=0;
//         for(String words : str){
//             if(words.length()>max){
//                 max=words.length();
//             }
//         }
//         System.out.println(max);
//     }    
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str =sc.nextLine();
//         String words []=str.split(" ");
//         int maxlength=0;
//         for(int i =0;i<words.length;i++){
//             if(words[i].length()>maxlength){
//                 maxlength=words[i].length();
//             }
//         }
//         System.out.println(maxlength);
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         String str="bananna";
//         StringBuilder st=new StringBuilder();
//         char arr[]=str.toCharArray();
//         for(int i =0;i<arr.length;i++){
//             if(i==0 || arr[i]!=arr[i-1]){
//                 st.append(arr[i]);
//             }
//         }
//         System.out.println(st.toString());
//     }
// }


// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         StringBuilder s=new StringBuilder();
//         char arr []=str.toCharArray();
//         for(int i =0;i<arr.length;i++){
//             if(i==0 || arr[i]!=arr[i-1]){
//                 s.append(arr[i]);
//             }
//         }
//         System.out.println(s.toString());
//     }
// }


// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int x=sc.nextInt();
//         int fresh []=new int[n];
//         int cost []=new int[n];
//         for(int i =0;i<fresh.length;i++){
//             fresh[i]=sc.nextInt();
//         }
//         for(int i =0;i<cost.length;i++){
//             cost[i]=sc.nextInt();
//         }
//         int totalcost=0;
//         for(int i =0;i<n;i++){
//             if(fresh[i]>x){
//                 totalcost=cost[i];
//             }
//         }
//         System.out.println(totalcost);
//     }
// }

// import java.util.Scanner;

// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int alice []=new int [n];
//         int bob []=new int [n];
//         int happy=0;
//         for(int i =0;i<alice.length;i++){
//             alice[i]=sc.nextInt();
//         }
//         for(int i =0;i<bob.length;i++){
//             bob[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             if(!(alice[i]>2*bob[i] || bob[i]>2*alice[i])){
//                 happy++;
//             }
//         }
//         System.out.println(happy);
//     }
// }



// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         char arr[]=str.toCharArray();
//         StringBuilder s=new StringBuilder();
//         for(int i =0;i<arr.length;i++){
//             if(!(arr[i]==' ')){
//                 s.append(arr[i]);
//             }
//         }
//         System.out.println(s.toString());
//     }
// }

// import java.util.Scanner;

// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         int id=sc.nextInt();
//         int salary=sc.nextInt();
//         if(!name.matches("^[a-zA-Z]*$")){
//             System.out.println("name not valid ");
//         }
//         else if(id<=0){
//             System.out.println("invalid id");
//         }
//         else if (salary<0) {
//             System.out.println("invalid salary");
//         }
//         else{
//             System.out.println("all valid ");
//         }
//     }
// }




// public class quebank{
//     public static void main(String[] args) {
//         int n []={12,6,29};
//         int m []={23,5,8};
//         int k []={90,20,59};
//         int target=101;
//         for(int i=0;i<n.length;i++){
//             for(int j=0;j<m.length;j++){
//                 for(int l=0;l<k.length;l++){
//                     if(n[i]+m[j]+k[l]==target){
//                         System.out.println(n[i]+" "+m[j]+" "+k[l]);
//                     }
//                 }
//             }
//         }
//     }
// }





// public class quebank{
//     public static void main(String[] args) {
//         String s="while (i < n { sum += i; i++; }";
//         char arr []=s.toCharArray();
//         int count =0;
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]=='('){
//                 count++;
//             }
//             else if (arr[i]==')'){
//                 count--;
//             }
//         }
//         if(count!=0){
//             System.out.println("not valid");
//         }
//         else{
//             System.out.println("valid");
//         }
//     }
// }




// iska
// check 
// krna 
// h 
// ek
// baar
// dekhna
// h
// isse
// import java.util.Scanner;

// public class quebank{
//     public static void main(String[] args) {
//         String s="0101";
//         char arr []=s.toCharArray();
//         StringBuilder str=new StringBuilder();
//         for(int i =0;i<arr.length-1;i++){
//             if(!((arr[i]=='0' && arr[i+1]=='1' )||( arr[i]=='0' && arr[i+1]=='0'))){
//                 str.append(arr[i]);
//             }
//         }
//         System.out.println(str.toString());
//     }
// }

// import java.sql.Array;
// import java.util.Scanner;

// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int ans=0;
//         int arr []=new int [n];
//         for(int i =0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]%2==0){
//                 ans+=arr[i]/2;
//             }
//             else if (arr[i]%2!=0){
//                 arr[i]=arr[i]-1;
//                 ans+=arr[i]/2;
//             }
//         }
//         System.out.println(ans);
//     }
// }






// public class quebank{
//     public static void main(String[] args) {
//         int n=5;
//         int m=3;
        
//         if(n>m){
//             for(int i =1;i<100;i++){
//                 n*=i;
//                 if(n%m==0){
//                     System.out.println(n);
//                     break;
//                 }
//             }
//         }
//         else{
//             for(int i =1;i<100;i++){
//                 m*=i;
//                 if(m%n==0){
//                     System.out.println(m);
//                     break;
//                 }
//             }
//         }
//     }
// }








// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         int arr []={1,3,5,7,9,0};
        
//         for(int i=0;i<arr.length-1;i++){
//             for(int j =i+1;j<arr.length-1;j++){
//                 if(arr[i]>arr[j]){
//                     int temp=arr[j];
//                     arr[j]=arr[i];
//                     arr[i]=temp;
//                 }
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }






// import java.util.Scanner;

// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int c1=sc.nextInt();
//         int c2=sc.nextInt();
//         int c3=sc.nextInt();
//         int c4=sc.nextInt();

//         int n=sc.nextInt();
//         int m=sc.nextInt();

//         int a []=new int[n];
//         int b []=new int[m];

//         for(int i=0;i<a.length;i++){
//             a[i]=sc.nextInt();
//         }
//         for(int i =0;i<b.length;i++){
//             b[i]=sc.nextInt();
//         }
//         int tr=0;
//         for(int i=0;i<a.length;i++){
//             tr+=Math.min(a[i]*c1,c2);
//         }
//         tr=Math.min(tr,c3);
//         int tb=0;
//         for(int i =0;i<b.length;i++){
//             tb+=Math.min(b[i]*c1,c2);
//         }
//         tb=Math.min(tb,c3);
//         int total=Math.min(tr+tb, c4);
//         System.out.println(total);
//     }
// }

// import java.util.Scanner;

// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int c1=sc.nextInt();
//         int c2=sc.nextInt();
//         int c3=sc.nextInt();
//         int c4=sc.nextInt();

//         int n=sc.nextInt();
//         int m=sc.nextInt();

//         int a []=new int[n];
//         int b []=new int[m];

//         for(int i=0;i<a.length;i++){
//             a[i]=sc.nextInt();
//         }
//         for(int i=0;i<b.length;i++){
//             b[i]=sc.nextInt();
//         }

//         int tr=0;
//         for(int i=0;i<a.length;i++){
//             tr+=Math.min(a[i]*c1,c2);
//         }
//         tr=Math.min(tr, c3);
//         int tb=0;
//         for(int i=0;i<b.length;i++){
//             tb+=Math.min(b[i]*c1,c2);
//         }
//         tb=Math.min(tb, c3);
//         int total=Math.min(tr+tb, c4);
//         System.out.println(total);
//     }
// }





// import java.util.Scanner;

// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         char arr [][]=new char[n][10];
//         for(int i =0;i<n;i++){
//             for(int j=0;j<10;j++){
//                 String answer=sc.next();
//                 arr[i]=answer.toCharArray();
//             }
//         }
//         char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'}; 
//         for (int i = 0; i < n; i++) {
//             int count = 0;
//             for (int k = 0; k < 10; k++) {
//                 if (arr[i][k] == keys[k]) {
//                     count++;
//                 }
//             }
//             System.out.println(count);
//         }
//     }
// }






// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         String str="TestString";
//         StringBuilder s=new StringBuilder();
//         char arr []=str.toCharArray();
//         int index []={2,5};
//         for(int i=0;i<arr.length;i++){
//             if(((i==2) || (i==5))){
//                 s.append("*");
//             }
//             else{
//                 s.append(arr[i]);
//             }
//         }
//         System.out.println(s.toString());
//     }
// }






// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int original=n;
//         int sum=0;
//         int nod=String.valueOf(n).length();
//         while(n>0){
//             int digit=n%10;
//             sum+=Math.pow(digit,nod);
//             n/=10;
//         }
//         boolean l=sum==original;
//         System.out.println(l);
//     }
// }






// import java.util.Arrays;
// import java.util.Scanner;

// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int arr []=new int [n];
//         for(int i =0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         Arrays.sort(arr);
//         // for(int i =0;i<arr.length;i++){
//         //     System.out.print(arr[i]+" ");
//         // }
//         int max=arr[arr.length-1];
//         for(int i=0;i<arr.length;i++){
//             if(!(max%arr[i]==0)){
//                 System.out.println("false");
//                 break;
//             }
//             else{
//                 System.out.println("true");
//                 break;
//             }
//         }
//     }
// }

// import java.util.Scanner;

// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         String arr []=new String [n];
//         for(int i =0;i<arr.length;i++){
//             arr[i]=sc.next();
//         }
//         String target=sc.next();
//         for(int i=0;i<arr.length;i++){
//             if(arr[i].compareTo(target)>0){
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }





// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     ArrayList<Integer> names=new ArrayList<Integer>();
//     int a=sc.nextInt();
//     while(a!=-1){
//         names.add(a);
//         a=sc.nextInt();
//     }
//     int b=sc.nextInt();
//     int len=names.size()-b;
//     System.out.println(names.get(len));
//     }
// }







// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String s1 = sc.next();
//         int size = s1.length();
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         for(int i=0;i<str.length();){
//             String temp = str.substring(i,i+size);
//             if(temp.equals(s1)){
//                 arr.add(i);
//                 i = i+size;
//             }
//             else{
//                 i++;
//             }
//         }
//         if(arr.size()==0){
//             System.out.println(-1);
//         }
//        
//     }
// }



// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         String s=sc.nextLine();
//         String find=sc.next();
//         int size=find.length();
//         ArrayList<Integer>arr=new ArrayList<Integer>();
//         for(int i =0;i<s.length();){
//             String temp=s.substring(i, i+size);
//             if(temp.equals(find)){
//                 arr.add(i);
//                 i=i+size;
//             }
//             else{
//                 i++;
//             }
//         }
//         if(arr.size()==0){
//             System.out.println(-1);
//         } 
//         else{
//             System.out.print('[');
//             for(int i=0;i<arr.size()-1;i++){
//                 System.out.print(arr.get(i));
//                 System.out.print(',');
//             }
//             System.out.print(arr.get(arr.size()-1));
//             System.out.print(']');
//         }
//     }
// }









// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         String s=sc.nextLine();
//         String find=sc.next();
//         int size=find.length();
//         ArrayList<Integer> arr=new ArrayList<Integer>();
//         for(int i =0;i<s.length();){
//             String temp=s.substring(i, i+size);
//             if(temp.equals(find)){
//                 arr.add(i);
//                 i=i+size;
//             }
//             else{
//                 i++;
//             }
//         }
//         if(arr.size()==0){
//             System.out.println("-1");
//         }
//         else{
//             System.out.print('[');
//             for(int i=0;i<arr.size()-1;i++){
//                 System.out.print(arr.get(i));
//                 System.out.print(',');
//             }
//             System.out.print(arr.get(arr.size()-1));
//             System.out.print(']');
//         }
//     }
// }








// public class quebank{
//     public static void main(String[] args) {
//         int arr []={1,2,3,4,5};
//         for(int i =arr.length-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         String s []=new String [n];
//         for(int i=0;i<s.length;i++){
//             s[i]=sc.next();
//         }
//         String target=sc.next();
//         for(int i=0;i<s.length;i++){
//             if(s[i].compareTo(target)>0){
//                 System.out.println(s[i]);
//             }
//         }
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         // int n=sc.nextInt();
//         String s[]=sc.nextLine().split(" ");
//         int max=0;
//         for(String words : s){
//             if(words.length()>max){
//                 max=words.length();
//             }
//         }
//         System.out.println(max);

//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.next();
//         StringBuilder str=new StringBuilder();
//         char arr []=s.toCharArray();
//         for(int i=0;i<arr.length;i++){
//             if(i==0 || arr[i]!=arr[i-1]){
//                 str.append(arr[i]);
//             }
//         }
//         System.out.println(str.toString());
//     }
// }


// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int x=sc.nextInt();
//         int fresh []=new int [n];
//         int cost []=new int [n];
//         for(int i =0;i<fresh.length;i++){
//             fresh[i]=sc.nextInt();
//         }
//         for(int i =0;i<cost.length;i++){
//             cost[i]=sc.nextInt();
//         }
//         int totalcost=0;
//         for(int i=0;i<n;i++){
//             if(fresh[i]>x){
//                 totalcost+=cost[i];
//             }
//         }
//         System.out.println(totalcost);
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int alice []=new int [n];
//         int bob []=new int [n];
//         for(int i=0;i<alice.length;i++){
//             alice[i]=sc.nextInt();
//         }
//         for(int i=0;i<bob.length;i++){
//             bob[i]=sc.nextInt();
//         }
//         int happy=0;
//         for(int i=0;i<n;i++){
//             if(!(alice[i]>(bob[i]*2) || bob[i]>(alice[i]*2))){
//                 happy++;
//             }
//         }
//         System.out.println(happy);
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         StringBuilder str=new StringBuilder();
//         char arr []=s.toCharArray();
//         for(int i =0;i<s.length();i++){
//             if(!(arr[i]==' ')){
//                 str.append(arr[i]);
//             }
//         }
//         String up=str.toString();
//         up=up.substring(0, 1).toUpperCase()+up.substring(1);
//         System.out.println(up);
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         ArrayList <Integer> arr=new ArrayList<Integer>();
//         int a=sc.nextInt();
//         while(a!=-1){
//             arr.add(a);
//             a=sc.nextInt();
//         }
//         int b=sc.nextInt();
//         int len=arr.size()-b;
//         System.out.println(arr.get(len));
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         ArrayList <Integer> arr=new ArrayList<Integer>();
//         String s=sc.nextLine();
//         String find=sc.next();
//         int size=find.length();
//         for(int i=0;i<s.length();){
//             String temp=s.substring(i, i+size);
//             if(temp.equals(find)){
//                 arr.add(i);
//                 i=i+size;
//             }
//             else{
//                 i++;
//             }
//         }
//         if(arr.size()==0){
//             System.out.print(-1);
//         }
//         else{
//             System.out.print('[');
//             for(int i=0;i<arr.size()-1;i++){
//                 System.out.print(arr.get(i));
//                 System.out.print(',');
//             }
//             System.out.print(arr.get(arr.size()-1));
//             System.out.print(']');
//         }
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         String name=sc.nextLine();
//         int id=sc.nextInt();
//         int salary=sc.nextInt();
//         if(!(name.matches("^[a-zA-Z]*$"))){
//             System.out.println("invalid name");
//         }
//         else if(id<0){
//             System.out.println("invalid id");
//         }
//         else if(salary<0){
//             System.out.println("invalid salary");
//         }
//         else{
//             System.out.println("all passed");
//         }
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         String s=sc.next();
//         char arr []=s.toCharArray();
//         StringBuilder str=new StringBuilder();
//         for(int i =0;i<arr.length-1;){
//             if((arr[i]>arr[i+1])){
//                 str.append(arr[i]);
//             }
//             else{
//                 str.append(arr[i+1]);
//             }
//             i=i+2;
//         }
//         if(s.length()%2!=0){
//             str.append(s.charAt(s.length()-1));
//         }
//         System.out.println(str.toString());
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int sn=sc.nextInt();
//         int sm=sc.nextInt();
//         int sk=sc.nextInt();
//         int n []=new int [sn];
//         int m []=new int [sm];
//         int k []=new int [sk];
//         for(int i =0;i<n.length;i++){
//             n[i]=sc.nextInt();
//         }
//         for(int i =0;i<m.length;i++){
//             m[i]=sc.nextInt();
//         }
//         for(int i =0;i<k.length;i++){
//             k[i]=sc.nextInt();
//         }
//         int sum=sc.nextInt();
//         for(int i =0;i<n.length;i++){
//             for(int j=0;j<m.length;j++){
//                 for(int l=0;l<k.length;l++){
//                     if(n[i]+m[j]+k[l]==sum){
//                         System.out.println(n[i]+" "+m[j]+" "+k[l]);
//                     }
//                 }
//             }
//         }
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         char arr []=s.toCharArray();
//         int count=0;
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]=='('){
//                 count++;
//             }
//             else{
//                 count--;
//             }
//         }
//         if(count>0){
//             System.out.println("false");
//         }
//         else{
//             System.out.println("true");
//         }
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int count=0;
//         int m=sc.nextInt();
//         for(int i =1;i<=1000;i++){
//             if(count==n){
//                 break;
//             }
//             if(((3*i)+2)%m==0){
//                 System.out.println();
//             }
//             else{
//                 System.out.println((3*i+2));
//                 count++;
//             }
//         }
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int arr []=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         int count =0;
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]%2==0){
//                 count+=arr[i]/2;
//             }
//             if(arr[i]%2!=0){
//                 arr[i]=arr[i]-1;
//                 count+=arr[i]/2;
//             }
//         }
//         System.out.println(count);
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=4;
//         int m=5;
//         int lcm=Math.max(n, m);
//         while(true){
//             if(lcm%n==0 &&lcm%m==0 ){
//                 System.out.println(lcm);
//                 break;
//             }
//             lcm++;
//         }
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int count =0;
//         for(int i=1;i<=n;i++){
//             String ans=Integer.toBinaryString(i);
//             for(int  j=0;j<ans.length();j++){
//                 if(ans.charAt(j)=='1'){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int c1=sc.nextInt();
//         int c2=sc.nextInt();
//         int c3=sc.nextInt();
//         int c4=sc.nextInt();

//         int n=sc.nextInt();
//         int m=sc.nextInt()

//         int a []=new int [n];
//         int b []=new int [m];

//         for(int i=0;i<a.length;i++){
//             a[i]=sc.nextInt();
//         }
//         for(int i=0;i<b.length;i++){
//             b[i]=sc.nextInt();
//         }
//         int tr=0;
//         for(int i=0;i<a.length;i++){
//             tr+=Math.min(a[i]*c1, c2);
//         }
//         tr=Math.min(tr, c3);
//         int tc=0;
//         for(int i=0;i<b.length;i++){
//             tc+=Math.min(b[i]*c1, c2);
//         }
//         tc=Math.min(tc, c3);
//         int totalcost=Math.min(tr+tc,c4);
//         System.out.println(totalcost);
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int original=n;
//         int sum=0;
//         int nod=String.valueOf(n).length();
//         while(n>0){
//             int digit=n%10;
//             sum+=Math.pow(digit,nod);
//             n/=10;
//         }
//         boolean l=sum==original;
//         System.out.println(l);
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int [n];
//         for(int i =0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         Arrays.sort(arr);
//         int max=arr[n-1];
//         for(int i=0;i<arr.length;i++){
//             if(!(max%arr[i]==0)){
//                 System.out.println("false");
//                 break;
//             }
//             else{
//                 System.out.println(true);
//                 break;
//             }
//         }
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int original=n;
//         int sum=0;
//         int nod=String.valueOf(n).length();
//         while(n>0){
//             int digit=n%10;
//             sum+=Math.pow(digit, nod);
//             n/=10;
//         }
//         boolean l=sum==original;
//         System.out.println(l);
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         String s=sc.next();
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         // System.out.print(s.substring(0, a)+"*"+s.substring(a, b)+"*"+s.substring(b));
//         System.out.print(s.substring(0, a)+"*"+s.substring(a, b)+"*"+s.substring(b));
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int count =0;
//         for(int i=1;i<=n;i++){
//             String ans=Integer.toBinaryString(i);
//             for(int  j=0;j<ans.length();j++){
//                 if(ans.charAt(j)=='1'){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         int n=5;
//         int count=0;
//         for(int i=1;i<=n;i++){
//             String ans=Integer.toBinaryString(i);
//             for(int j=0;j<ans.length();j++){
//                 if(ans.charAt(j)=='1'){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=4;
//         int m=6;
//         // int lcm=Math.max(n, m);
//         // while(true){
//         //     if(lcm%n==0 &&lcm%m==0 ){
//         //         System.out.println(lcm);
//         //         break;
//         //     }
//         //     lcm++;
//         // }
//         // int s=n*m;
//         for(int i=1;i<=n*m;i++){
//             if(i%n==0 && i%m==0){
//                 System.out.println(i);
//                 break;
//             }
//         }
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         String s=sc.next();
//         char arr []=s.toCharArray();
//         StringBuilder str=new StringBuilder();
//         for(int i =0;i<arr.length-1;){
//             if(arr[i]>arr[i+1]){
//                 str.append(arr[i]);
//             }
//             else{
//                 str.append(arr[i+1]);
//             }
//             i=i+2;
//         }
//         if(s.length()%2!=0){
//             str.append(s.charAt(s.length()-1));
//         }
//         System.out.print(str.toString());
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         String s="java is fun!";
//         char arr[]=s.toCharArray();
//         int low=0;
//         int high=s.length()-1;
//         while(low<high){
//             if(arr[low]==' ') low++;
//             else if(arr[high]==' ') high--;
//             else{
//                 char temp=arr[low];
//                 arr[low]=arr[high];
//                 arr[high]=temp;
//                 low++;
//                 high--;
//             }
//         }
//         for(int i =0;i<s.length();i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// import java.util.*;
// public class quebank{
//     public static void main(String[] args) {
//         String n="111";
//         String s=n.replaceAll("10", "");
//         String str=s.replaceAll("00", "");
//         System.out.println(str.length());

//     }
// }