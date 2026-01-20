# 044: [Java Dequeue](https://www.hackerrank.com/challenges/java-dequeue/problem "https://www.hackerrank.com/challenges/java-dequeue/problem")
- level: Medium
- language: Java
<br>

## Description of the problem
In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).<br>
Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes.<br>
 For example, deque can be declared as:

> Deque deque = new LinkedList<>();<br>
> or<br>
> Deque deque = new ArrayDeque<>();

You can find more details about Deque [here](https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html "https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html").<br>

In this problem, you are given *N* integers.<br>
You need to find the maximum number of unique integers among all the possible contiguous subarrays of size *M*.<br>

Note: Time limit is 3 second for this problem.

### Imput Format
The first line of input contains two integers *N* and *M*: representing the total number of integers and the size of the subarray, respectively.<br>
The next line contains *N* space separated integers.

### Constraints
1≦*N*≦100,000<br>
1≦*M*≦100,000<br>
*M*≦*N*<br>
The numbers in the array will range between [0, 1,000,000].

### Output Format
Print the maximum number of unique integers among all possible contiguous subarrays of size *M*.

### Sample Input
> 6 3
> 5 3 5 2 3 2

### Sample Output
> 3

### Explanation
In the sample testcase, there are 4 subarrays of contiguous numbers.<br>

*s1* = (5, 3, 5) - Has 2 unique numbers.<br>
*s2* = (3, 5, 2) - Has 3 unique numbers.<br>
*s3* = (5, 2, 3) - Has 3 unique numbers.<br>
*s4* = (2, 3, 2) - Has 2 unique numbers.<br>

In these subarrays, there are 2, 3, 3, 2 unique numbers, respectively.<br>
The maximum amount of unique numbers among all possible contiguous subarrays is 3.