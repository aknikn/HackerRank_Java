# 014: [Java Strings Introduction](https://www.hackerrank.com/challenges/java-strings-introduction/problem "https://www.hackerrank.com/challenges/java-strings-introduction/problem")
- level: Easy
- language: Java


## Description of the problem
There are three lines of output:<br>
For the first line, sum the lengths of A and B.<br>
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.<br>
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

### Sample Input
> hello<br>
> java

### Sample Output
> 9<br>
> No<br>
> Hello Java

### Explanation
String A is "hello" and B is "java".<br><br>

A has a length of 5, and B has a length of 4; the sum of their lengths is 9.<br>
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, A is not greater than B and the answer is No.<br>
When you capitalize the first letter of both A and B and then print them separated by a space, you get "Hello Java".