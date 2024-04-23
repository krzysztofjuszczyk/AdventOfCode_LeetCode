package hackerrank.days30ofCode;

public class d21_Generics {
    /**
     *    Method Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    @param A generic array
     **/
    <E> void printArray(E[] array){
        for (E e : array) {
            System.out.println(e);
        }
    }
}
