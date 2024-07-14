public class test {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        Iterative_Version iterativeVersion = new Iterative_Version();
        System.out.println(STR."Binary Search of 80 using Iterative version : \{iterativeVersion.binarySearch(array, 80)}");

        Recursive_Version recursiveVersion = new Recursive_Version();
        System.out.println(STR."Binary Search of 80 using  Recursive version : \{recursiveVersion.binarySearch(array, 80)}");
    }
}
