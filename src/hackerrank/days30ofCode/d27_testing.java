package hackerrank.days30ofCode;

public class d27_testing {

    static class TestDataEmptyArray{
        static int[] get_array(){
            return new int[0];
        }
    }

    static class TestDataUniqueValues{
        static int[] get_array(){
            return new int[] {3,5};
        }
        static int get_expected_result(){return 0;}
    }

    static class TestDataExactlyTwoDifferentMinimums{
        static int[] get_array(){
            return new int[] {3,3,2,2};
        }
        static int get_expected_result(){return 2;}

    }
}
