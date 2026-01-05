# 031: [Java Arraylist](https://www.hackerrank.com/challenges/java-arraylist/problem "https://www.hackerrank.com/challenges/java-arraylist/problem")
- level: Easy
- language: Java


## Description of the problem
Sometimes it's better to use dynamic size arrays.<br>
Java's Arraylist can provide you this feature.<br>
Try to solve this problem using Arraylist.<br><br>

You are given *n* lines.<br>
In each line there are zero or more integers.<br>
You need to answer a few queries where you need to tell the number located in *y*th position of *x*th line.<br><br>

Take your input from System.in.

### Imput Format
The first line has an integer *n*.<br>
In each of the next *n* lines there will be an integer *d* denoting number of integers on that line and then there will be *d* space-separated integers.<br>
In the next line there will be an integer *q* denoting number of queries.<br>
Each query will consist of two integers *x* and *y*.

### Constraints
- 1 ≦ n ≦ 20000
- 0 ≦ d ≦ 50000
- 1 ≦ q ≦ 1000
- 1 ≦ x ≦ n

Each number will fit in signed integer.<br>
Total number of integers in *n* lines will not cross 10^5.

### Output Format
In each line, output the number located in *y*th position of *x*th line.<br>
If there is no such position, just print "ERROR!"

### Sample Input
> 5<br>
> 5 41 77 74 22 44<br>
> 1 12<br>
> 4 37 34 36 52<br>
> 0<br>
> 3 20 22 33<br>
> 5<br>
> 1 3<br>
> 3 4<br>
> 3 1<br>
> 4 3<br>
> 5 5

### Sample Output
> 74<br>
> 52<br>
> 37<br>
> ERROR!<br>
> ERROR!

### Explanation
The diagram below explains the queries:

5<br>
line1: 5items=[41, 77, 74, 22, 44]<br>
line2: 1item =[12]<br>
line3: 4items=[37, 34, 36, 52]<br>
line4: 0items=[]<br>
line5: 3items=[20, 22, 33]<br><br>

        1  2  3  4  5<br>
       ―― ―― ―― ―― ――<br>
line1 │41│77│74│22│44|<br>
       ―― ―― ―― ―― ――<br>
line2 │12│<br>
       ―― ―― ―― ――<br>
line3 │37│34│36│52|<br>
       ―― ―― ―― ――<br>
line4 <br>
       ―― ―― ――<br>
line5 │20│22│33|<br>
       ―― ―― ――<br><br>

5<br>
> (line1, 3) = 74<br>
> (line3, 4) = 52<br>
> (line3, 1) = 37<br>
> (line4, 3) = nothing ⇒ ERROR!<br>
> (line5, 5) = nothing ⇒ ERROR!