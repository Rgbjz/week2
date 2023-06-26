public class q5 {
    public static void main(String[] args) {
        int dat[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 10;
        int i=0;
        int right = dat.length - 1;
        int left=0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dat[mid] == numberToFind) {
                System.out.println(mid);
                i++;
            }
            if (dat[mid] < numberToFind) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        if(i==0)
            System.out.println(-1);
    }
}
