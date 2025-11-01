# 004: [Java Stdin and Stdout II](https://www.hackerrank.com/challenges/java-stdin-stdout/problem "https://www.hackerrank.com/challenges/java-stdin-stdout/problem")
- level: Easy
- language: Java


## Description of the problem
In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below.<br>
To make the problem a little easier, a portion of the code is provided for you in the editor.<br>

Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.

### Imput Format
There are three lines of input:
1. The first line contains an integer.
2. The second line contains a double.
3. The third line contains a String.

### Output Format
There are three lines of output:
1. On the first line, print String: followed by the unaltered String read from stdin.
2. On the second line, print Double: followed by the unaltered double read from stdin.
3. On the third line, print Int: followed by the unaltered integer read from stdin.

To make the problem easier, a portion of the code is already provided in the editor.<br>

Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens.<br>
Because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

### Sample Input
> 42<br>
> 3.1415<br>
> Welcome to HackerRank's Java tutorials!

### Sample Output
> String: Welcome to HackerRank's Java tutorials!<br>
> Double: 3.1415<br>
> Int: 42