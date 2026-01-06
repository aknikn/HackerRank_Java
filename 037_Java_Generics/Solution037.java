class Printer{
	<T> void printArray(T[] array) {
		for(T t: array) {
			System.out.println(t);
		}
	}
}

public class Solution037 {
    public static void main(String[] args) {
        /* Enter your code here.
           Print output to STDOUT.
           Your class should be named Solution.
        */
        Printer printer = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"Hello", "World"};
        printer.printArray(intArray);
        printer.printArray(strArray);
    }
}
