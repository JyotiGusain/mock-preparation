package mock.preparation.ds;

public class CheckUniqueInArray {
    public static void main(String[] args) {
        int a[] = {1, 4, 5, 6, 7, 6, 8, 2, 7, 5, 3, 1};

        boolean isUnique = true;
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    isUnique = false;
                    break;
                }
                isUnique = true;
            }
            if (isUnique) {
                index = i;
                break;
            }
        }
        if (isUnique) {
            System.out.println("Unique number in array : " + a[index]);
        } else {
            System.out.println("There is no element unique in array.");
        }
    }
}

