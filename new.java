import java.util.*;
public class new{
    public static void main(String[] args) {
        String n="111";
        String s=n.replaceAll("10", "");
        String str=s.replaceAll("00", "");
        System.out.println(str.length());
    }
}
