# 048: [Java Interface](https://www.hackerrank.com/challenges/java-interface/problem "https://www.hackerrank.com/challenges/java-interface/problem")
- level: Easy
- language: Java

## Description of the problem
A Java interface can only contain method signatures and fields.<br>
The interface can be used to achieve polymorphism.<br>
In this problem, you will practice your knowledge on interfaces.<br><br>

You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n).<br>
You need to write a class called MyCalculator which implements the interface.<br><br>

divisorSum function just takes an integer as input and return the sum of all its divisors.<br>
For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12.<br>
The value of n will be at most 1000.<br><br>

Read the partially completed code in the editor and complete it.<br>
You just need to write the MyCalculator class only.<br>
Your class shouldn't be public.

### Sample Input
> 6

### Sample Output
> I implemented: AdvancedArithmetic<br>
> 12


### Explanation
Divisors of 6 are 1,2,3 and 6.<br>
1+2+3+6=12.