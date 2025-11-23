import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution021{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code below
/*・[01]?\d{1,2}：
 * 		case 先頭＝なし：
 * 			0～99
 * 		case 先頭＝0：
 * 			00～099
 * 		case 先頭＝1：
 * 			100～199
 *・2[0-4]\d：200～249
 *・25[0-5]：250～255
 * */
class MyRegex{
    String ipRegex = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    public String pattern = ipRegex+"."+ipRegex+"."+ipRegex+"."+ipRegex;
}