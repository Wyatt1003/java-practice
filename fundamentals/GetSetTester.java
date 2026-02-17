public class GetSetTester {
    public static void main(String[] args) {

        GetSet name = new GetSet();

        System.out.println(name.getUsername());
        name.setUsername("pineappleghost333");

        System.out.println(name.getUsername());

    }
}

class GetSet{
    private String username;

    public String getUsername(){
        return username;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }

}