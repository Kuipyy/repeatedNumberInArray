//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] originalArray = {0, 1, 1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9};
        int[] duplicate = new int[originalArray.length];
        int index = 0;
        int countity=0;

        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray.length; j++) {
                if (i != j && originalArray[i] == originalArray[j]) {
                    if (!isFind(duplicate, originalArray[i])) {
                        duplicate[index++] = originalArray[i];
                        countity++;
                    }
                    break;
                }
            }
        }

        for (int i = 0; i < countity; i++) {
            System.out.print(duplicate[i] + " ");
        }
    }
}