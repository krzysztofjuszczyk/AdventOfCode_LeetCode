package leetCode.easy;

public class L2011_FinalValueVariableAfterOperations {


    public int finalValueAfterOperations(String[] operations) {
        int val = 0;
        for(int i=0;i<operations.length;i++) {
            if(operations[i].charAt(1)=='+') val++;
            else val--;
        }
        return val;
    }
    public int finalValueAfterOperations2(String[] operations) {
        int x = 0;
        for(String o : operations) x += (44 - o.charAt(1));
        return x;
    }
}
