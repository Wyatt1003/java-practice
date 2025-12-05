class ScoreBoard{

    int playerXP = 0;
    int playerLevel = 0;
    static String gameName = "EsDeeKid Simulator";

    void gainXP(int amount) {
        playerXP = playerXP + amount;
    }

    void heal() {
        playerXP += 50;
    }

    void damage() {
        playerXP -= 10;
    }

    void levelUp() {
        playerLevel++;
    }
    
    void levelDown() {
        playerLevel--;
    }

    static void name() {
        System.out.println(gameName);
    }

}

public class Math2 {
    public static void main(String[] args) {
            
        ScoreBoard player1 = new ScoreBoard();

        player1.gainXP(500);
        player1.gainXP(400);
        player1.heal();
        player1.damage();
        player1.levelUp();
        player1.levelUp();
        player1.levelDown();

        ScoreBoard player2 = new ScoreBoard();

        player2.gainXP(100);
        player2.gainXP(200);
        player2.heal();
        player2.damage();
        player2.levelUp();
        player2.levelUp();
        player2.levelDown();


        System.out.println("Player XP: " + player1.playerXP);
        System.out.println("Player 1 level: " + player1.playerLevel);

        System.out.println("Player XP: " + player2.playerXP);
        System.out.println("Player 2 level: " + player2.playerLevel);

        ScoreBoard.name();

     }
}
