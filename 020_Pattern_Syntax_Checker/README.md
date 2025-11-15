## 020: [Pattern Syntax Checker](https://www.hackerrank.com/challenges/pattern-syntax-checker/problem "https://www.hackerrank.com/challenges/pattern-syntax-checker/problem")
- level: Easy
- language: Java


## Description of the problem
Using Regex, we can easily match or search for patterns in a text.<br>
Before searching for a pattern, we have to specify one using some well-defined syntax.<br><br>

In this problem, you are given a pattern.<br>
You have to check whether the syntax of the given pattern is valid.<br><br>

Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

### Input Format
The first line of input contains an integer N, denoting the number of test cases.<br>
The next N lines contain a string of any printable characters representing the pattern of a regex.

### Output Format
For each test case, print Valid if the syntax of the given pattern is correct.<br>
Otherwise, print Invalid.<br>
Do not print the quotes.

### Sample Input
> 3<br>
> ([A-Z])(.+)<br>
> [AZ[a-z](a-z)<br>
> batcatpat(nat

### Sample Output
> Valid<br>
> Invalid<br>
> Invalid