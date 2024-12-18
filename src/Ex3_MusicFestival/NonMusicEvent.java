package Ex3_MusicFestival;

class NonMusicEvent extends Event {
    public int rent;


    public NonMusicEvent(String name, String type, String loc ){
        super(name, type);
        super.setLocation(loc);
        this.rent = -1; // arbitrary default integer 

    }


    public void setRent(int r){
        this.rent = r;
    }

//    public void printMe(){
//        System.out.println("Name: " + eventName + "   Type: " + eventType + "   Location: " + location + "   Time: " + time + "   Number of Players: " + "   Rent: " + rent);
//    }




}