# 002: [Java Stdin and Stdout I](https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem "https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem")
- level: Easy
- language: Java


## Description of the problem
Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).<br>
One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in.<br>

### For example:
> Scanner scanner = new Scanner(System.in);<br>
> String myString = scanner.next();<br>
> int myInt = scanner.nextInt();<br>
> scanner.close();<br>
> <br>
> System.out.println("myString is: " + myString);<br>
> System.out.println("myInt is: " + myInt);

The code above creates a Scanner object named  and uses it to read a String and an int.<br>
It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String).<br>
So, if our input is:<br>
> Hi 5

Our code will print:<br>
> myString is: Hi<br>
> myInt is: 5

Alternatively, you can use the BufferedReader class.

### Task
In this challenge, you must read  integers from stdin and then print them to stdout.<br>
Each integer must be printed on a new line.<br>
To make the problem a little easier, a portion of the code is provided for you in the editor below.

### Imput Format
There are 3 lines of input, and each line contains a single integer.

### Sample Input
> 42<br>
> 100<br>
> 125

### Sample Output
> 42<br>
> 100<br>
> 125