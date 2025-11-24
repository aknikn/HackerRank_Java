import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution024{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		while(0<testCases){
			String line = sc.nextLine();
			//Write your code below
			Matcher tagMatcher = RegEx.tagPattern.matcher(line);
			if(tagMatcher.find()){
				do{
					System.out.println(tagMatcher.group(2));
				}while(tagMatcher.find());
			}else{
				System.out.println("None");
			}            
			//Write your code above
			testCases--;
		}
		sc.close();
	}
}

//Write your code below
/* <(.+)>：開始タグ
 * 		<：タグの括弧<
 *		(.+)：.（改行以外のあらゆる1文字）を+（1回以上繰り返し）、()で囲った部分を記録してgroupに保存
 * 		>：タグの括弧>
 * 
 * ([^<]+)：タグで囲まれた部分
 * 		[^<]：^（先頭）に<（タグの括弧<）を含まない[]（文字クラス）を+（1回以上繰り返す）
 * 		()：()で囲った部分を記録してgroupに保存
 * 
 * </\\1>：終了タグ
 * 		<：タグの括弧<
 *		\1：group(1)に保存した内容
 * 		>：タグの括弧>
 * */
class RegEx{
	private static String tagRegEx = "<(.+)>([^<]+)</\\1>";
	public static Pattern tagPattern = Pattern.compile(tagRegEx);
}