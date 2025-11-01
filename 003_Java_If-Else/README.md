# 003: [Java If-Else](https://www.hackerrank.com/challenges/java-if-else/problem "https://www.hackerrank.com/challenges/java-if-else/problem")
- level: Easy
- language: Java


## Description of the problem
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes.<br>
An if-else statement has the following logical flow:

### Task
Given an integer, n, perform the following conditional actions:<br>
> If n is odd, print Weird<br>
> If n is even and in the inclusive range of 2 to 5, print Not Weird<br>
> If n is even and in the inclusive range of 6 to 20, print Weird<br>
> If n is even and greater than 20, print Not Weird

Complete the stub code provided in your editor to print whether or not n is weird.

### Imput Format
A single line containing a positive integer, n.

### Constraints
> 1 ≦ n ≦ 100

### Output Format
Print Weird if the number is weird; otherwise, print Not Weird.

### Sample Input0
> 3

### Sample Output0
> Weird

### Sample Input1
> 24

### Sample Output1
> Not Weird

### Explanation
Sample Case 0:<br>
n is odd and odd numbers are weird, so we print Weird.

Sample Case 1:<br>
20 < n and n is even, so it isn't weird. Thus, we print Not Weird.