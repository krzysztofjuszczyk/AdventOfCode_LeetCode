package hackerrank.days30ofCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class d20_Sorting {


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            // Write your code here
            int[] arr = new int[a.size()];
            for (int i = 0; i < a.size(); i++)
            {arr[i] = a.get(i);}

            int totalSwaps = 0;
            for (int i = 0; i < n; i++) {
                // Track number of elements swapped during a single array traversal
                int numberOfSwaps = 0;

                for (int j = 0; j < n - 1; j++) {
                    // Swap adjacent elements if they are in decreasing order
                    if (arr[j] > arr[j+1]) {
                        swap(arr, j, j+1);
                        numberOfSwaps++;
                    }
                }

                // If no elements were swapped during a traversal, array is sorted
                if (numberOfSwaps == 0) {
                    break;
                }
                totalSwaps += numberOfSwaps;
            }

            System.out.println("Array is sorted in " + totalSwaps + " swaps.");
            System.out.println("First Element: " + arr[0]);
            System.out.println("Last Element: "+ arr[arr.length-1]);

            bufferedReader.close();
        }
        static void swap (int[] array, int j, int j1){
            int tmp = array[j];
            array[j] = array[j1];
            array[j1] = tmp;
        }

    }
