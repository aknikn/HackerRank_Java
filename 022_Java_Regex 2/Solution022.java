import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution022 {

	public static void main(String[] args) {

		// String regex = "/* Write a RegEx matching repeated words here. */";
		// Pattern p = Pattern.compile(regex, /* Insert the correct Pattern flag here.*/);
		
		/*
		 * \b：単語の開始
		 * (\\w+)：キャプチャ1（単語1個をgroup(1)に保存。group(0)はマッチした全文）
		 * 		\w：英数字＋アンダースコア
		 * 		+：1文字以上」
		 * (?: ... )：非キャプチャのグループ。
		 * 		「?:」によって「グループ化はするけど group として保存しない」
		 * \W+：単語以外の文字（空白・句読点など）を1文字以上。＝単語間のスペースや記号
		 * \1：キャプチャした単語（group1）を再び要求
		 * \b：単語の終了
		 * +：(?: ... )内を1回以上繰り返す
		 */
		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // CASE_INSENSITIVE＝大文字小文字を区別しない

		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());
		
		while (numSentences-- > 0) {
			String input = in.nextLine();
			
			Matcher m = p.matcher(input);
			
			// Check for subsequences of input that match the compiled pattern
			while (m.find()) {
				// input = input.replaceAll(/* The regex to replace */, /* The replacement. */);
				
				/*
				 * m.group()：マッチした"重複部分 全体"
				 * m.group(1)：最初の単語だけ
				 */
				input = input.replaceAll(m.group(), m.group(1));
			}
			
			// Prints the modified sentence.
			System.out.println(input);
		}
		
		in.close();
	}
}