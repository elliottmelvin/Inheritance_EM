package Ex3_MusicFestival;

import java.util.ArrayList;

class SmallStageEvent extends Event{

  public int numGroups;

  public SmallStageEvent(String n, String t, int ng){
   super(n, t);
   numGroups = ng;

   super.setLocation("Small Stage");
  }

  public void giveCheer(){
    int numCheers = 0;

    if(this.getEventType().equals("Music")){
        numCheers += 50;
    }

    if(numGroups > 1){

      }
  }
}
