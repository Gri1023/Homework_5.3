public class Main {
    public static void main(String[] args) {
    int array[] = {4,8,2,1};
    int[] a = {5,-16, 2, 11, 1};
    int[] b = {7,-16,5,3,9};
    int value = 2;
    System.out.println("contains " + contains(array,value));
    System.out.println("any " + any(a,b));
    }
    static boolean contains (int[] array, int value) {
        for (int i=0; i<array.length;i++) {
            if (array[i] == value)
                return (true);
        }
        return (false);
    }

    static boolean any(int[]a, int[]b) {
        for (int i=0; i<=b.length;i++) {
            if (a[i] == b[i])
                return (true);
        }
        return (false);
    }
}