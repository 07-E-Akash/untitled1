import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rege89 {
    public static void main(String[] args){
        String target= "jdbc regular expression jdbc is important";
        Pattern p = Pattern.compile("jdbc");
        Matcher m = p.matcher(target);
        int ctr= 0;
        while(m.find())
        {
            ctr++;
        }
        System.out.println(ctr);
    }
}
