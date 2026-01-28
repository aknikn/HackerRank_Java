# 047: [Java Abstract Class](https://www.hackerrank.com/challenges/java-abstract-class/problem "https://www.hackerrank.com/challenges/java-abstract-class/problem")
- level: Easy
- language: Java
<br>

## Description of the problem
A Java abstract class is a class that can't be instantiated.<br>
That means you cannot create new instances of an abstract class.<br>
It works as a base for subclasses.<br>
You should learn about Java Inheritance before attempting this challenge.<br><br>

Following is an example of abstract class:

> abstract class Book{<br>
> 　　String title;<br>
> 　　abstract void setTitle(String s);<br>
> 　　String getTitle(){<br>
> 　　　　return title;<br>
> 　　}<br>
> }<br>

If you try to create an instance of this class like the following line you will get an error:

> Book new_novel=new Book(); 

You have to create another class that extends the abstract class.<br>
Then you can create an instance of the new class.<br><br>

Notice that setTitle method is abstract too and has no body.<br>
That means you must implement the body of that method in the child class.<br><br>

In the editor, we have provided the abstract Book class and a Main class.<br>
In the Main class, we created an instance of a class called MyBook.<br>
Your task is to write just the MyBook class.<br><br>

Your class mustn't be public.


### Sample Input
> A tale of two cities

### Sample Output
> The title is: A tale of two cities