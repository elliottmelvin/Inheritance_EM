package Ex3_MusicFestival;

import com.sun.tools.javac.Main;

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

        allEvents.add(new PublicGame("Hackey Sack", "Physical", "Lot 1", 20));
        allEvents.add(new PublicGame("Poker", "Card Game", "Lot 53", 10));
        allEvents.add(new PublicGame("Water Balloon Fight", "Physical", "Lot 22", 33));
        allEvents.add(new PublicGame("Go Fish", "Card Game", "Lot 36", 4));
        allEvents.add(new PublicGame("Trivia Quiz", "Brain Game", "Lot 10", 8));





        ((MainStageEvent)allEvents.get(0)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(0)).addTech("Symphony Orchestra");

        for (int i = 0; i < allEvents.size(); i++) {
            System.out.println(allEvents.get(i).getEventName());

            if (allEvents.get(i) instanceof MainStageEvent) {
                ((MainStageEvent) allEvents.get(i)).printTech();
            }
        }

        while(0==0){
            System.out.println("Press 1 to add new Event\nPress 2 to search for event\nPress 3 to filter by event type\nPress 4 to exit\nPress 5 to see all events\nPress 6 to add a main stage event tech");

            int choice = Library.input.nextInt();
            Library.input.nextLine();

            if(choice == 1){
                System.out.println("What is the class of the event you would you like to add?");
                String addClass = Library.input.nextLine();

                System.out.println("What is the name of event would you like to add?");
                String addName = Library.input.nextLine();

                System.out.println("What is the type of event would you like to add?");
                String addType = Library.input.nextLine();

                if(addClass.equalsIgnoreCase("small stage event")){
                    System.out.println("How many events are performing?");
                    int addNumGroups = Library.input.nextInt();
                    Library.input.nextLine();

                    allEvents.add(new SmallStageEvent(addName, addType, addNumGroups));
                }

                else if(addClass.equalsIgnoreCase("main stage event")){
                    allEvents.add(new MainStageEvent(addName, addType));
                }

                else if(addClass.equalsIgnoreCase("non music event")){
                    System.out.println("What is the location of the event?");
                    String addLocation = Library.input.nextLine();

                    allEvents.add(new NonMusicEvent(addName, addType, addLocation));
                }

                else if(addClass.equalsIgnoreCase("public game")){
                    System.out.println("What is the location of the event?");
                    String addLocation = Library.input.nextLine();

                    System.out.println("How many players are participating");
                    int addPlayers = Library.input.nextInt();
                    Library.input.nextLine();

                    allEvents.add(new PublicGame(addName, addType, addLocation, addPlayers));
                }
                else{
                    System.out.println("Invalid class type");
                }
            }//choice 1

            if(choice == 2){
                System.out.println("What is the name of the event you would like to search for?");
                String searchName = Library.input.nextLine();

                int foundIndex = searchEvent(searchName, allEvents);

                if(foundIndex > -1){
                    allEvents.get(foundIndex).printMe();
                }
            }//choice 2

            if(choice == 3){
                System.out.println("What type of event would you like to filter for?");
                String searchFilter = Library.input.nextLine();



                for(Event event : allEvents){
                    if(event.getEventType().equalsIgnoreCase(searchFilter) ){
                        event.printMe();
                    }
                }
            }//choice 3

            if(choice == 4){
                break;
            }

            if (choice == 5) {

                System.out.println("Non Music Events: ");
                for(Event event : allEvents){
                    if(event instanceof NonMusicEvent){
                        event.printMe();
                    }
                }
                System.out.println();

                System.out.println("Public Games: ");
                for(Event event : allEvents){
                    if(event instanceof PublicGame){
                        event.printMe();
                    }
                }
                System.out.println();

                System.out.println("Main Stage Events: ");
                for(Event event : allEvents){
                    if(event instanceof MainStageEvent){
                        event.printMe();
                    }
                }
                System.out.println();

                System.out.println("Small Stage Events: ");
                for(Event event : allEvents){
                    if(event instanceof SmallStageEvent){
                        event.printMe();
                    }
                }
                System.out.println();
            }

            if(choice == 6){
                System.out.println("What is the name of the event you would like to add techs to");
                String searchEvent = Library.input.nextLine();
                int foundIndex = searchMainStageEvent(searchEvent, allEvents);

                if(foundIndex > -1){
                    System.out.println("What is the requirements for the tech?");
                    String techRec = Library.input.nextLine();

                   addMainStageTech(allEvents.get(foundIndex), techRec);
                }
            }
        }
    }

    public static int searchEvent(String n, ArrayList<Event> list){
        if(list.size() == 0) {return -1;} // escaping return

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getEventName().equalsIgnoreCase(n)){
                return i;
            }
        }
        System.out.println();
        System.out.println("Could not find this event");
        System.out.println();

        return -1;
    }

    public static int searchMainStageEvent(String n, ArrayList<Event> list){
        if(list.size() == 0) {return -1;} // escaping return

        for (int i = 0; i < list.size(); i++) {
            if((list.get(i).getEventName().equalsIgnoreCase(n) && (list.get(i) instanceof MainStageEvent))){
                return i;
            }
        }
        System.out.println();
        System.out.println("Could not find this event");
        System.out.println();

        return -1;
    }

    public static void addMainStageTech(Event searchedEvent, String techInput){
        ((MainStageEvent) searchedEvent).addTech(techInput);

        ((MainStageEvent) searchedEvent).printTech();
    }


}
