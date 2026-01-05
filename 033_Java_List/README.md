# 033: [Java List](https://www.hackerrank.com/challenges/java-list/problem "https://www.hackerrank.com/challenges/java-list/problem")
- level: Easy
- language: Java


## Description of the problem
For this problem, we have 2 types of queries you can perform on a List:<br>
1. Insert *y* at index *x*:<br>

> Insert<br>
> *x* *y*

2. Delete the element at index *x*:

> Delete<br>
> *x*

Given a list, *L*, of **N** integers, perform *Q* queries on the list.<br>
Once all queries are completed, print the modified list as a single line of space-separated integers.

### Imput Format
The first line contains an integer, *N* (the initial number of elements in *L*).<br>
The second line contains *N* space-separated integers describing *L*.<br>
The third line contains an integer, *Q* (the number of queries).<br>
The *2Q* subsequent lines describe the queries, and each query is described over two lines:
- If the first line of a query contains the String Insert, then the second line contains two space separated integers *x* and *y*, and the value *y* must be inserted into *L* at index *x*.
- If the first line of a query contains the String Delete, then the second line contains index *x*, whose element must be deleted from *L*.

### Constraints
- 1 ≦ *N* ≦ 4000
- 1 ≦ *Q* ≦ 4000
- 1 Each element in is a 32-bit integer.

### Output Format
Print the updated list *L* as a single line of space-separated integers.

### Sample Input
> 5<br>
> 12 0 1 78 12<br>
> 2<br>
> Insert<br>
> 5 23<br>
> Delete<br>
> 0

### Sample Output
> 0 1 78 12 23

### Explanation
*L* =[12, 0, 1, 78, 12]<br><br>

Q0: Insert 23 at index 5.<br>
L0=[12, 0, 1, 78, 12, 23]<br><br>

Q1: Delete the element at index 0.<br>
L1=[0, 1, 78, 12, 23]<br>
Having performed all *Q* queries, we print *L* as a single line of space-separated integers.<br><br>

*N*=5<br>
*L* =[12, 0, 1, 78, 12]<br>
*Q* = 2<br>
	1. Insert
	*x*=5, *y*=23(Insert 23 at index 5)
	2. Delete
	*x*=0(Delete the element at index 0)