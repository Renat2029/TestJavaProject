package GenericHomeTask1;

import java.util.Arrays;

public class MainGeneric {

    public static void main(String[] args) {

        GenericStack genericStack = new GenericStack(4);


        String[] movies = {"Amour", "Argo"};
        String[] dest = new String[2];

        try {

            genericStack.push("Renat");
            genericStack.pushAll(Arrays.asList(movies));

            genericStack.push("Renat1");
            // genericStack.push("Renat2"); //тут возникает эксепшн при добавлении

            System.out.println(" all push ends");
           // genericStack.pop();
            genericStack.popAll(Arrays.asList(dest));
            genericStack.pop();
            // genericStack.pop(); // тут возникает эксепшн при удалении
        } catch (StackExeption stackExeption) {
            stackExeption.printStackTrace();
        }
    }
}
