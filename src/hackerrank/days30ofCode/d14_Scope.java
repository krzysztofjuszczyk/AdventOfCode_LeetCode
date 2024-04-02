package hackerrank.days30ofCode;

public class d14_Scope {
    class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        Difference(int[] elements) {
            this.elements = elements;
        }

        void computeDifference() {
            // for (int i = 0; i < elements.length; i++) {
            // System.out.println(elements[i]);
            // }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] < min) {
                    min = elements[i];
                }
                if (elements[i] > max) {
                    max = elements[i];
                }
                // System.out.println("" + i+ " " + min + " " + max);


            }

            this.maximumDifference = Math.abs(min - max);
        }
    }
}
