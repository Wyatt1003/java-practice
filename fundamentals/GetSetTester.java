import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println(player1.getUsername()); 
        player1.setUsername("pineappleghost333"); 
        System.out.println(player1.getUsername()); 

        System.out.println(player1.getRank()); 
        player1.setRank("LTN"); 
        System.out.println(player1.getRank()); 

        System.out.println(player2.getUsername()); 
        player2.setUsername("ironmouse6741"); 
        System.out.println(player2.getUsername()); 
        
        System.out.println(player2.getID()); 
        player2.setID(161); 
        System.out.println(player2.getID()); 

        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ");
        String userInput = input.nextLine();

        player3.setUsername(userInput);

        GetSet player4 = new GetSet();
        System.out.print("Enter a Username: ");
        String userInput2 = input.nextLine();

        player4.setUsername(userInput2);

        System.out.print("Enter an ID: ");
        Integer userInput3 = input.nextInt();

        player4.setID(userInput3);

        System.out.print("Enter a Rank: ");
        String userInput4 = input.nextLine();

        player4.setRank(userInput4);

        System.out.println(player4.getUsername()); 
        System.out.println(player4.getID()); 
        System.out.println(player4.getRank()); 

        System.out.println(player3.getUsername()); 
        
    }
}

class GetSet{
    private String username = "No user name";
    private Integer ID = 0;
    private String rank = "no rank";

    public Integer getID(){
        return ID;
    }

    public String getRank(){
        return rank;
    }

    public String getUsername(){
        return username;
    }
    
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public void setID(Integer newID){
        this.ID = newID;
    }

    public void setRank(String newRank){
        this.rank = newRank;
    }{
    
    for (int i = 0; i<4; i++){
    if(rank.equals("LTN") ){
        System.out.println("You are a feeble LTN");
        }
    if(rank.equals("MTN") ){
        System.out.println("You are a weak MTN");
        }
    if(rank.equals("HTN") ){
        System.out.println("You are a respectable HTN");
        }
    if(rank.equals("CL") ){
        System.out.println("You are a strong CL");
        }
    if(rank.equals("TA") ){
        System.out.println("You are a powerful TA");
        }
    }
}
}