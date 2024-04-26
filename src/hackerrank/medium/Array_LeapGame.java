package hackerrank.medium;

public class Array_LeapGame {
    public static boolean canWin(int leap, int[] game) {
        return isWinnable(leap, game, 0);
    }

    public static boolean isWinnable(int leap, int[] game, int index){
        // Return true if you can win the game; otherwise, return false.


        // can jump directly
        if (index >= game.length){return true;}
        if (index <0 || game[index] == 1) {return false;}

        //mark as visited
        game[index] = 1;

        return isWinnable(leap, game, index+leap) ||
                isWinnable(leap, game, index+1) ||
                isWinnable(leap, game, index-1);
    }

}
