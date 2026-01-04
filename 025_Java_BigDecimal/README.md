# 025: [Java BigDecimal](https://www.hackerrank.com/challenges/java-bigdecimal/problem "https://www.hackerrank.com/challenges/java-bigdecimal/problem")
- level: Medium
- language: Java


## Description of the problem
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers.<br>
Let's test your knowledge of them!

Given an array, *s*, of *n* real number strings, sort them in descending order — but wait, there's more!<br>
Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1.<br>
If two numbers represent numerically equivalent values (e.g., .1≡0.1), then they must be listed in the same order as they were received as input.<br><br>

Complete the code in the unlocked section of the editor below.<br>
You must rearrange array *s*'s elements according to the instructions above.

### Imput Format
The first line consists of a single integer, *n*, denoting the number of integer strings.<br>
Each line *i* of the *n* subsequent lines contains a real number denoting the value of *s*i.

### Constraints
- 0 ≦ *n* ≦ 200<br>
- Each *s* has at most 300 digits.

### Output Format
Locked stub code in the editor will print the contents of array *s* to stdout.<br>
You are only responsible for reordering the array's elements.

### Sample Input
> 9<br>
> -100<br>
> 50<br>
> 0<br>
> 56.6<br>
> 90<br>
> 0.12<br>
> .12<br>
> 02.34<br>
> 000.000

### Sample Output
> 90<br>
> 56.6<br>
> 50<br>
> 02.34<br>
> 0.12<br>
> .12<br>
> 0<br>
> 000.000<br>
> -100