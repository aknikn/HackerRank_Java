# 036: [Java Hashset](https://www.hackerrank.com/challenges/java-hashset/problem "https://www.hackerrank.com/challenges/java-hashset/problem")
- level: Easy
- language: Java<br>


## Description of the problem
In computer science, a set is an abstract data type that can store certain values, without any particular order, and no repeated values(Wikipedia).<br>
{1, 2, 3} is an example of a set, but {1, 2, 2} is not a set.<br>
Today you will learn how to use sets in java by solving this problem.<br>

You are given *n* pairs of strings.<br>
Two pairs (*a*, *b*) and (*c*, *d*) are identical if *a* = *c* and *b* = *d*.<br>
That also implies (*a*, *b*) is not same as (*b*, *a*).<br>
After taking each pair as input, you need to print number of unique pairs you currently have.<br>

Complete the code in the editor to solve this problem.

### Imput Format
In the first line, there will be an integer *T* denoting number of pairs.<br>
Each of the next *T* lines will contain two strings seperated by a single space.

### Constraints
- 1≦*T*≦100000
- Length of each string is atmost 5 and will consist lower case letters only.

### Output Format
Print *T* lines.<br>
In the *i*th line, print number of unique pairs you have after taking *i*th pair as input.

### Sample Input
> 5<br>
> john tom<br>
> john mary<br>
> john tom<br>
> mary anna<br>
> mary anna

### Sample Output
> 1<br>
> 2<br>
> 2<br>
> 3<br>
> 3

### Explanation
- After taking the first input, you have only one pair: (john,tom)
- After taking the second input, you have two pairs: (john, tom) and (john, mary)
- After taking the third input, you still have two unique pairs.
- After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)
- After taking the fifth input, you still have three unique pairs.