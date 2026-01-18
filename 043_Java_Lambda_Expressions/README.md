# 043: [Java Lambda Expressions](https://www.hackerrank.com/challenges/java-lambda-expressions/problem "https://www.hackerrank.com/challenges/java-lambda-expressions/problem")
- level: Medium
- language: Java

## Description of the problem
This Java 8 challenge tests your knowledge of [Lambda expressions](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html "https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html")!<br>
Write the following methods that return a lambda expression performing a specified action:<br>

1. PerformOperation isOdd(): The lambda expression must return *true* if a number is odd or *false* if it is even.
2. PerformOperation isPrime(): The lambda expression must return *true* if a number is prime or *false* if it is composite.
3. PerformOperation isPalindrome(): The lambda expression must return *true* if a number is a palindrome or *false* if it is not.

### Imput Format
Input is handled for you by the locked stub code in your editor.

### Output Format
The locked stub code in your editor will print *T* lines of output.

### Sample Input
The first line contains an integer, *T* (the number of test cases).<br><br>

The *T* subsequent lines each describe a test case in the form of 2 space-separated integers:<br>
The first integer specifies the condition to check for (1 for Odd/Even, 2 for Prime, or 3 for Palindrome).<br>
The second integer denotes the number to be checked.

> 5<br>
> 1 4<br>
> 2 5<br>
> 3 898<br>
> 1 3<br>
> 2 12

### Sample Output
> EVEN<br>
> PRIME<br>
> PALINDROME<br>
> ODD<br>
> COMPOSITE
