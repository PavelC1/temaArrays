import java.util.Arrays;
import java.util.Scanner;

public class tema {
            public static int ArraySum(int[] arr) {
                int sum = 0;
                for (int i : arr) {
                    sum += i;
                }
                return sum;
            }

            public static int[] ReverseArray(int[] arr) {
                int[] revArr = new int[arr.length];
                for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
                    revArr[j] = arr[i];
                }

                return revArr;
            }

            public static int ArrayMax(int[] arr) {
                int max = arr[0];
                for (int i : arr) {
                    if (max < i) {
                        max = i;
                    }
                }
                return max;
            }
            public static int ArrayMin(int[] arr) {
                int min = arr[0];
                for (int i : arr) {
                    if (min > i) {
                        min = i;
                    }
                }
                return min;
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduceti dimensiunea array-ului: ");
                int n = scanner.nextInt();

                int[] array = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.println(i + 1 + ". Introduceti elementul: ");
                    array[i] = scanner.nextInt();
                }

                System.out.println(ArraySum(array));
                System.out.println(Arrays.toString(ReverseArray(array)));
                System.out.println(ArrayMax(array));
                System.out.println(ArrayMin(array));
            }
        }
