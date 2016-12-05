package frompythontojava.exercise1;

/**
 * Created by berloc on 2016.12.05..
 */
public class GenerateID {

    public static int generateID(){
        return ((int) (Math.random() * (1000 - 100)) + 100);
    }
}