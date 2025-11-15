# 019: [Java String Tokens](https://www.hackerrank.com/challenges/java-string-tokens/problem "https://www.hackerrank.com/challenges/java-string-tokens/problem")
- level: Easy
- language: Java


## Description of the problem
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.<br>
We define a token to be one or more consecutive English alphabetic letters.<br>
Then, print the number of tokens, followed by each token on a new line.<br><br>

Note: You may find the String.split method helpful in completing this challenge.

### Imput Format
A single string, s.

### Constraints
* 1 ≦ length of s ≦ 4*10^5<br>
* s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).

### Output Format
On the first line, print an integer, n, denoting the number of tokens in string  s(they do not need to be unique).<br>
Next, print each of the n tokens on a new line in the same order as they appear in input string s.

### Sample Input
> He is a very very good boy, isn't he?

### Sample Output
> 10<br>
> He<br>
> is<br>
> a<br>
> very<br>
> very<br>
> good<br>
> boy<br>
> isn<br>
> t<br>
> he<br>

### Explanation
We consider a token to be a contiguous segment of alphabetic characters.<br>
There are a total of 10 such tokens in string s, and each token is printed in the same order in which it appears in string s.