public class q4 {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        int step = length / 2;

        while (step > 0) {
            for (int i = step; i < length; i++) {
                int tempr = array[i];
                int j = i;

                while (j >= step && array[j - step] > tempr) {
                    array[j] = array[j - step];
                    j -= step;
                }

                array[j] = tempr;
            }

            step /= 2;
        }


        // Виведення відсортованого масиву
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
