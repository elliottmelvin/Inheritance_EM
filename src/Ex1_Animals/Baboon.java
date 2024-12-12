package Ex1_Animals;

public class Baboon extends Animal {

    int numBerries;

    public Baboon(String na, int n, String c){

        super(na);
        numBerries = n;
        name = c;

    }

    public String toString(){
        return super.name + " eats " + numBerries + " per day";
    }

}
