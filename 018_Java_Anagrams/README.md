# 018: [Java Anagrams](https://www.hackerrank.com/challenges/java-datatypes/problem "https://www.hackerrank.com/challenges/java-datatypes/problem")
- level: Easy
- language: Java


## Description of the problem
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.<br>
For this challenge, the test is not case-sensitive.<br>
For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

### Function Description
Complete the isAnagram function in the editor.<br>
isAnagram has the following parameters:<br>
- string a: the first string<br>
- string b: the second string

### Returns
boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.

### Imput Format
The first line contains a string a.<br>
The second line contains a string b.

### Constraints
- 1 ≦ length(a), length(b) ≦ 50<br>
- Strings a and b consist of English alphabetic characters.<br>
- The comparison should NOT be case sensitive.

### Sample Input0
> anagram<br>
> margana

### Sample Output0
> Anagrams

### Explanation0
> Character	  anagram	margana<br>
> A or a            3	      3<br>
> G or g            1	      1<br>
> N or n            1	      1<br>
> M or m            1	      1<br>
> R or r            1	      1

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

### Sample Input1
> anagram<br>
> margana

### Sample Output1
> Not Anagrams

### Explanation1
> Character	  anagramm	marganaa<br>
> A or a             3	       4<br>
> G or g             1	       1<br>
> N or n             1	       1<br>
> M or m             2	       1<br>
> R or r             1	       1

The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

### Sample Input2
> Hello<br>
> hello

### Sample Output2
> Anagrams

### Explanation2
> Character	  Hello	hello
> E or e          1	    1<br>
> H or h          1	    1<br>
> L or l          2	    2<br>
> O or o          1	    1

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".