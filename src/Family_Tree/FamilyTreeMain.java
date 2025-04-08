package Family_Tree;

import java.util.ArrayList;

public class FamilyTreeMain {

    public static void run() {
        //generation 0
        Person person1 = new Person("Bobbie", "Mexico");
        //generation 1
        person1.addChild(new Person("Susan", "Canada"));
        person1.addChild(new Person("Jill", "Canada"));
        person1.addChild(new Person("Bobette", "Belise"));
        //generation 2
        person1.children.get(0).addChild(new Person("Zain", "Belise"));
        person1.children.get(2).addChild(new Person("Bob III", "Belise"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));
        //generation 3
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));

        person1.children.get(1).children.get(0).addChild(new Person("Elliott", "Hungary"));
        person1.children.get(1).children.get(1).addChild(new Person("Lucky", "Nepal"));
        person1.children.get(1).children.get(2).addChild(new Person("Zev", "Turkey"));
        person1.children.get(1).children.get(3).addChild(new Person("Johnin", "Whoville"));
        person1.children.get(1).children.get(4).addChild(new Person("Bilbo", "The Shire"));

        System.out.print("The number of people in " + person1.name + "'s family is:  ");
        System.out.println(countFamily(person1));

    }



    public static int countFamily(Person ptemp){
        //counts the number of people
        int num = 0;

        return num;
    }


    public static void printCanadians(Person ptemp){

    }
}//class
