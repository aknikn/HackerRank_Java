# 009: [Java End-of-file](https://www.hackerrank.com/challenges/java-end-of-file/problem "https://www.hackerrank.com/challenges/java-end-of-file/problem")
- level: Easy
- language: Java


## Description of the problem
> "In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)<br>
The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.<br><br>

Hint: Java's Scanner.hasNext() method is helpful for this problem.

### Imput Format
Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

### Output Format
For each line, print the line number, followed by a single space, and then the line content received as input.

### Sample Input
> Hello world<br>
> I am a file<br>
> Read me until end-of-file.

### Sample Output
> 1 Hello world<br>
> 2 I am a file<br>
> 3 Read me until end-of-file.