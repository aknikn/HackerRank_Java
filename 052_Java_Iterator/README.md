# 052: [Java Iterator](https://www.hackerrank.com/challenges/java-iterator/problem "https://www.hackerrank.com/challenges/java-iterator/problem")
- level: Easy
- language: Java


## Description of the problem
Java Iterator class can help you to iterate through every element in a collection.<br>
Here is a simple example:

> import java.util.*;<br>
> public class Example{<br>
> <br>
> 　　public static void main(String []args){<br>
> 　　　　ArrayList mylist = new ArrayList();<br>
> 　　　　mylist.add("Hello");<br>
> 　　　　mylist.add("Java");<br>
> 　　　　mylist.add("4");<br>
> 　　　　Iterator it = mylist.iterator();<br>
> 　　　　while(it.hasNext()){<br>
> 　　　　　　Object element = it.next();<br>
> 　　　　　　System.out.println((String)element);<br>
> 　　　　}<br>
> 　　}<br>
> }

In this problem you need to complete a method func.<br>
The method takes an ArrayList as input.<br>
In that ArrayList there is one or more integer numbers, then there is a special string "###", after that there are one or more other strings.<br>
A sample ArrayList may look like this:

> element[0]=>42<br>
> element[1]=>10<br>
> element[2]=>"###"<br>
> element[3]=>"Hello"<br>
> element[4]=>"Java"

You have to modify the func method by editing at most 2 lines so that the code only prints the elements after the special string "###".<br>
For the sample above the output will be:

> Hello<br>
> Java

Note: The stdin doesn't contain the string "###", it is added in the main method.<br>
To restore the original code in the editor, click the top left icon on the editor and create a new buffer.