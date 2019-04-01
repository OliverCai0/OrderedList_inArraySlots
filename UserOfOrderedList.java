public class UserOfOrderedList{
    
    public static void main(String[] commandLine){
        /**
         * Creates a list from least to greatest
         */
        OrderedList_inArraySlots list = new OrderedList_inArraySlots();

        for(int element = 5; element > 0; element --){
            list.add(element);
            System.out.println("added a new element");
        }
        System.out.println("Added " + list.size() + " elements to the list");
        System.out.println("List Results" + list);
        System.out.println("Expecting [1,2,3,4,5,]");

        System.out.println("\n\n" + "Testing add method on big int");
        list.add(100);
        System.out.println("List Results" + list);
        System.out.println("Expecting [1,2,3,4,5,100,]");

        System.out.println("\n\n" + "Testing add method on small int");
        list.add(-1);
        System.out.println("List Results " + list);
        System.out.println("Expecting [-1,1,2,3,4,5,100,]");

        System.out.println("\n\n" + "Testing add method on medium int");
        list.add(30);
        System.out.println("List Results " + list);
        System.out.println("Expecting [-1,1,2,3,4,5,30,100,]");   
    }

}