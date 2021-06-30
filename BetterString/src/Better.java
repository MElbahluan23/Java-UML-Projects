import java.util.function.BiPredicate;

public class Better {
    public static void main(String [] args) {
        String string1 = "Mohamed";
        String string2 = "El-Bahluan";
        String longer =betterString(string1,string2,(s1,s2)->s1.length()>s2.length());
        String first =betterString(string1,string2,(s1,s2)->true);
        System.out.println(longer);
        System.out.println(first);





    }
    public static String betterString(String s1 , String s2, BiPredicate<String,String>p){

        if (p.test(s1,s2)){
            return s1;
        }
        return s2;





    }
}
