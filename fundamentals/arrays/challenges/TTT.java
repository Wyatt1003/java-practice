package challenges;

import java.util.Random;

public class TTT {
    public static void main(String[] args) {
        
        char[][] ttt = new char[3][3];
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    Random r = new Random(2);
                    if (r.nextInt() == 0){
                        ttt[i][j] = 'x';
                    }else{
                        ttt[i][j] = 'o';
                    }
                }
            }

            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    System.out.print(ttt[i][j]);

            if (ttt[0][0] == ttt[0][1] && ttt[0][0] == ttt[0][2]){
                System.out.println(ttt[0][0] + " Wins");
                return;
       } 
            if (ttt[1][0] == ttt[1][1] && ttt[0][0] == ttt[1][2]){
                System.out.println(ttt[1][0] + " Wins");
                return;
       } 
            if (ttt[2][0] == ttt[0][1] && ttt[2][0] == ttt[2][2]){
                System.out.println(ttt[2][0] + " Wins");
                return;
       } 
    }
}
}
}