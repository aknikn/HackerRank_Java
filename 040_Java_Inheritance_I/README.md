# 040: [Java Inheritance I](https://www.hackerrank.com/challenges/java-inheritance-1/problem "https://www.hackerrank.com/challenges/java-inheritance-1/problem")
- level: Easy
- language: Java
<br>

## Description of the problem
Using inheritance, one class can acquire the properties of others.<br>
Consider the following Animal class:<br>

> class Animal{<br>
> 　　void walk(){<br>
> 　　　System.out.println("I am walking");<br>
> 　　}<br>
> }

This class has only one method, walk.<br>
Next, we want to create a Bird class that also has a fly method.<br>
We do this using extends keyword:

> class Bird extends Animal {<br>
> 　　void fly() {<br>
> 　　　　System.out.println("I am flying");<br>
> 　　}<br>
> }

Finally, we can create a Bird object that can both fly and walk.<br>

> public class Solution{<br>
> 　　public static void main(String[] args){<br>
> 　　　　Bird bird = new Bird();<br>
> 　　　　bird.walk();<br>
> 　　　　bird.fly();<br>
> 　　}<br>
> }<br>

The above code will print:

> I am walking<br>
> I am flying

This means that a Bird object has all the properties that an Animal object has, as well as some additional unique properties.

The code above is provided for you in your editor.
<br>You must add a sing method to the Bird class, then modify the main method accordingly so that the code prints the following lines:

> I am walking<br>
> I am flying<br>
> I am singing