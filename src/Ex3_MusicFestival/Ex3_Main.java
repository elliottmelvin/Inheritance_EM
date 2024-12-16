package Ex3_MusicFestival;

import java.util.ArrayList;

public class Ex3_Main {

    public static void run(){
        ArrayList<Event> allEvents = new ArrayList<>();
        allEvents.add(new MainStageEvent("Walk off the Earth", "Music"));
        allEvents.add(new MainStageEvent("Black Pumas", "Music"));
        allEvents.add(new MainStageEvent("Rex Orange County", "Music"));
        allEvents.add(new MainStageEvent("Drizzy", "Slam Poetry"));
        allEvents.add(new MainStageEvent("Zev.", "Dance"));

        allEvents.add(new SmallStageEvent("Bboy Link", "Dance", 1));
        allEvents.add(new SmallStageEvent("Indigenous Medley", "Music", 4));
        allEvents.add(new SmallStageEvent("Jimmy x Johnny", "Music", 2));
        allEvents.add(new SmallStageEvent("Dunk Contest", "Sport", 10));
        allEvents.add(new SmallStageEvent("Chu's Chuckles", "Comedy", 1));

        allEvents.add(new PublicGame("Hackey Sack", "Physical", "Lot 6", 20));

        ((MainStageEvent)allEvents.get(0)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(0)).addTech("Symphony Orchestra");

        for (int i = 0; i < allEvents.size(); i++) {
            System.out.println(allEvents.get(i).getEventName());

            if (allEvents.get(i) instanceof MainStageEvent) {
                ((MainStageEvent) allEvents.get(i)).printTech();
            }
        }

        while(0==0){
            System.out.println("Press 1 to add new Event\nPress 2 to search for event\nPress 3 to filter by event type\nPress 4 to exit");

            int choice = Library.input.nextInt();
            Library.input.nextLine();

            if(choice == 1){
                System.out.println("What type of event would you like to add");

                String addType = Library.input.nextLine();

//                if(addType.equals())
            }

        }
    }
}
