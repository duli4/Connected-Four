public class PvEGame extends GameLogic{
    String user;
    String type;
    int winCounter;

    public PvEGame () {
        user = "User";
        type = "one";
        winCounter = 0;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public String getType() {
        return type;
    }

    public int getWinCounter() {
        return winCounter;
    }

}
