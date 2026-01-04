# 029: [Java 2D Array](https://www.hackerrank.com/challenges/java-2d-array "https://www.hackerrank.com/challenges/java-2d-array")
- level: Easy
- language: Java


## Description of the problem
You are given a 6*6 2D array.<br>
An hourglass in an array is a portion shaped like this:<br>
> a b c<br>
>   d<br>
> e f g<br><br>

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:<br>
> 1 1 1 0 0 0<br>
> 0 1 0 0 0 0<br>
> 1 1 1 0 0 0<br>
> 0 0 0 0 0 0<br>
> 0 0 0 0 0 0<br>
> 0 0 0 0 0 0<br><br>

Actually, there are many hourglasses in the array above.<br>
The three leftmost hourglasses are the following:<br>
> 1 1 1  |   1 1 0  |   1 0 0<br>
>   1    |     0    |     0<br>
> 1 1 1  |   1 1 0  |   1 0 0<br><br>

The sum of an hourglass is the sum of all the numbers within it.<br>
The sum for the hourglasses above are 7, 4, and 2, respectively.<br>
In this problem you have to print the largest sum among all the hourglasses in the array.

### Imput Format
There will be exactly 6 lines, each containing 6 integers seperated by spaces.<br>
Each integer will be between -9 and 9 inclusive.

### Output Format
Print the answer to this problem on a single line.

### Sample Input
> 1 1 1 0 0 0<br>
> 0 1 0 0 0 0<br>
> 1 1 1 0 0 0<br>
> 0 0 2 4 4 0<br>
> 0 0 0 2 0 0<br>
> 0 0 1 2 4 0

### Sample Output
> 19

### Explanation
The hourglass which has the largest sum is:<br>
> 2 4 4<br>
>   2<br>
> 1 2 4