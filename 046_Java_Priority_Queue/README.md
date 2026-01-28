# 042: [Java Priority Queue](https://www.hackerrank.com/challenges/java-priority-queue/problem "https://www.hackerrank.com/challenges/java-priority-queue/problem")
- level: Medium
- language: Java
<br>

## Description of the problem
In computer science, a priority queue is an abstract data type which is like a regular queue, but where additionally each element has a "priority" associated with it.<br>
In a priority queue, an element with high priority is served before an element with low priority. - [Wikipedia](https://en.wikipedia.org/wiki/Priority_queue "https://en.wikipedia.org/wiki/Priority_queue")<br><br>

In this problem we will test your knowledge on [Java Priority Queue](https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html "https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html").<br><br>

There are a number of students in a school who wait to be served.<br>
Two types of events, ENTER and SERVED, can take place which are described below.

- ENTER: A student with some priority enters the queue to be served.
- SERVED: The student with the highest priority is served (removed) from the queue.

A unique id is assigned to each student entering the queue.<br>
The queue serves the students based on the following criteria (priority criteria):

1. The student having the highest Cumulative Grade Point Average (CGPA) is served first.
2. Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
3. Any students having the same CGPA and name will be served in ascending order of the id.

Create the following two classes:
- The Student class should implement:
    - The constructor Student(int id, String name, double cgpa).<br>
    - The method int getID() to return the id of the student.<br>
    - The method String getName() to return the name of the student.<br>
    - The method double getCGPA() to return the CGPA of the student.
- The Priorities class should implement the method List<Student> getStudents(List<String> events) to process all the given events and return all the students yet to be served in the priority order.

### Imput Format
The first line contains an integer, *n*, describing the total number of events.<br>
Each of the  subsequent lines will be of the following two forms:

- ENTER name CGPA id: The student to be inserted into the priority queue.
- SERVED: The highest priority student in the queue was served.

The locked stub code in the editor reads the input and tests the correctness of the Student and Priorities classes implementation.

### Constraints
- 2≦*n*≦1000
- 0≦*CGPA*≦4.00
- 1≦*id*≦10^5
- 2≦*|name|*≦30

### Output Format
The locked stub code prints the names of the students yet to be served in the priority order.<br>
If there are no such student, then the code prints EMPTY.

### Sample Input
> 12<br>
> ENTER John 3.75 50<br>
> ENTER Mark 3.8 24<br>
> ENTER Shafaet 3.7 35<br>
> SERVED<br>
> SERVED<br>
> ENTER Samiha 3.85 36<br>
> SERVED<br>
> ENTER Ashley 3.9 42<br>
> ENTER Maria 3.6 46<br>
> ENTER Anik 3.95 49<br>
> ENTER Dan 3.95 50<br>
> SERVED

### Sample Output
> Dan<br>
> Ashley<br>
> Shafaet<br>
> Maria

### Explanation
In this case, the number of events is 12. Let the name of the queue be Q.

- John is added to Q.<br>
  So, it contains (John, 3.75, 50).
- Mark is added to Q.<br>
  So, it contains (John, 3.75, 50) and (Mark, 3.8, 24).
- Shafaet is added to Q.<br>
  So, it contains (John, 3.75, 50), (Mark, 3.8, 24), and (Shafaet, 3.7, 35).
- Mark is served as he has the highest CGPA.<br>
  So, Q contains (John, 3.75, 50) and (Shafaet, 3.7, 35).
- John is served next as he has the highest CGPA.<br>
  So, Q contains (Shafaet, 3.7, 35).
- Samiha is added to Q.<br>
  So, it contains (Shafaet, 3.7, 35) and (Samiha, 3.85, 36).
- Samiha is served as she has the highest CGPA.<br>
  So, Q contains (Shafaet, 3.7, 35).
- Now, four more students are added to Q.<br>
  So, it contains (Shafaet, 3.7, 35), (Ashley, 3.9, 42), (Maria, 3.6, 46), (Anik, 3.95, 49), and (Dan, 3.95, 50).
- Anik is served because though both Anil and Dan have the highest CGPA but Anik comes first when sorted in alphabetic order.<br>
  So, Q contains (Dan, 3.95, 50), (Ashley, 3.9, 42), (Shafaet, 3.7, 35), and (Maria, 3.6, 46).

As all events are completed, the name of each of the remaining students is printed on a new line.