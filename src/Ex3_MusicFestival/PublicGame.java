package Ex3_MusicFestival;

public class PublicGame extends NonMusicEvent{

    public int numPlayers;

    public PublicGame(String n, String t, String l, int np){
        super(n, t, l);
        numPlayers = np;
    }

    public void setRent(){
        this.rent = 0;
    }

//    public void printMe(){
//        System.out.println("Name: " + eventName + "   Type: " + eventType + "   Location: " + location + "   Time: " + time + "   Number of Players: " + numPlayers);
//    }
}
