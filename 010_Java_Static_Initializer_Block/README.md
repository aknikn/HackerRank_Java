# 010: [Java Static Initializer Block](https://www.hackerrank.com/challenges/java-static-initializer-block/problem "https://www.hackerrank.com/challenges/java-static-initializer-block/problem")
- level: Easy
- language: Java


## Description of the problem
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.<br>
It's time to test your knowledge of Static initialization blocks.<br>
You can read about it here.<br>
You are given a class Solution with a main method.<br>
Complete the given code so that it outputs the area of a parallelogram with breadth B and height H.<br>
You should read the variables from the standard input.<br>
If B ≦ 0 or H ≦ 0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.<br>

### Imput Format
There are two lines of input.<br>
The first line contains B: the breadth of the parallelogram.<br>
The next line contains H: the height of the parallelogram.

### Constraints
- -100 ≦ B ≦ 100<br>
- -100 ≦ H ≦ 100<br>

### Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram.<br>
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

### Sample Input1
> 1<br>
> 3

### Sample Output1
> 3

### Sample Input2
> -1<br>
> 2

### Sample Output2
> java.lang.Exception: Breadth and height must be positive