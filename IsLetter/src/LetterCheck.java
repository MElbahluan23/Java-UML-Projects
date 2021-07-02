import java.util.regex.Pattern;
class Letter{
String s ="smith23";
        if (Pattern.matches("[a-zA-Z]+",s)) {
        // Do something
        System.out.println("Yes, string contains letters only");
        }else{
        System.out.println("Nope, Other characters detected");
        }}
