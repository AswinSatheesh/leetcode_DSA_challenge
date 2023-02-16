public class Sqrt {
    public static int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            } else if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1; // This line should never be reached
    }
    public static void main(String[] args) {
        int x = 8;
        System.out.println("Square root of " + x + " is " + mySqrt(x));
    }
}



// ------------------------------------- Another solution

// public class Sqrt {
//     public static int mySqrt(int x) {
//         return (int) Math.sqrt(x);
//     }

//     public static void main(String[] args) {
//         int x = 8;
//         System.out.println("Square root of " + x + " is " + mySqrt(x));
//     }
// }
