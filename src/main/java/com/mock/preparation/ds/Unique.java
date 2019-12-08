package mock.preparation.ds;

public class Unique {

    /*
    Find the unique element in an array
     */

    public static void unique(int[] a) {

        for (int i = 0; i < a.length; i++) {
            boolean isunique = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isunique = true;
                    break;
                }
            }
            if (!isunique) {
                System.out.println(" " + a[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 6, 7, 2, 3, 1, 4, 45, 21, 3, 4};
        // Arrays.sort(arr);
        unique(arr);
    }
}



