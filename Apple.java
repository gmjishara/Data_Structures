import java.util.Stack;

public class Apple {
    public static void main(String[] args) {

        //Create a stack object
        Stack<String> myFirstStack=new Stack<>();

        //add data to stack
        myFirstStack.push("orange");
        myFirstStack.push("mango");
        myFirstStack.push("apple");
        myFirstStack.push("banana");
        myFirstStack.push("lemon");

        //check whether stack has data
        System.out.println(myFirstStack.empty());

        //view the stack
        System.out.println(myFirstStack);

        //remove a data and assign the removed data to a variable
        String st=myFirstStack.pop();

        //view the stack
        System.out.println(myFirstStack);

        //view the removed data
        System.out.println(st);

        //view the top data in the stack
        System.out.println(myFirstStack.peek());
    }
}
