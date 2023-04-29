import java.util.LinkedList;
import java.util.Queue;

public class Country {
    public static void main(String[] args) {
        //create a queue object
        Queue<String> country=new LinkedList<>();
        //check whether the queue has data
        System.out.println(country.isEmpty());
        //add data to queue
        country.offer("Australia");
        country.offer("New Zealand");
        country.offer("India");
        country.offer("Pakistan");
        country.offer("Bangladesh");
        //view the queue
        System.out.println(country);
        //check the size of the queue
        System.out.println(country.size());
        //check a data is in the queue
        System.out.println(country.contains("nepal"));
        //view the top data in queue
        System.out.println(country.peek());
        //remove a data from the queue and assign it to a variable
        String info=country.poll();
        //view removed data
        System.out.println(info);
        //view the queue
        System.out.println(country);
    }
}
