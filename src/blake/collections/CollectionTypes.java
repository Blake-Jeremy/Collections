package blake.collections;

import java.util.*;

public class CollectionTypes {
    public static void main(String[] args) {

/*******************************************************************
 *  List Collection
 *  Types of Flowers
 *  Features: Duplicates, FIFO
 *******************************************************************/

        System.out.println("-- List Collection --");
        List list = new ArrayList();
        list.add("Daisy");
        list.add("Rose");
        list.add("Iris");
        list.add("Narcissus");
        list.add("Orchid");
        list.add("Tulip");
        list.add("Sunflower");
        list.add("Cyclamen");
        list.add("Carnation");
        list.add("Poppy");
        list.add("Daisy");

        for (Object str : list) {
            System.out.println((String)str);
        }

/*******************************************************************
 *  Set Collection
 *  Types of Flowers
 *  Features: No duplicates, Sorted
 *******************************************************************/

        System.out.println("-- Set Collection --");
        Set set = new TreeSet();
        set.add("Daisy");
        set.add("Rose");
        set.add("Iris");
        set.add("Narcissus");
        set.add("Orchid");
        set.add("Tulip");
        set.add("Sunflower");
        set.add("Cyclamen");
        set.add("Carnation");
        set.add("Poppy");
        set.add("Daisy");

        for (Object str : set) {
            System.out.println((String)str);
        }

/*******************************************************************
 *  Queue Collection
 *  Types of Flowers
 *  Features: Duplicates, Sorted
 *******************************************************************/

        System.out.println("-- Queue --");
        Queue queue = new PriorityQueue();
        queue.add("Daisy");
        queue.add("Rose");
        queue.add("Iris");
        queue.add("Narcissus");
        queue.add("Orchid");
        queue.add("Tulip");
        queue.add("Tulip");
        queue.add("Sunflower");
        queue.add("Cyclamen");
        queue.add("Carnation");
        queue.add("Poppy");
        queue.add("Daisy");

        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(queue.poll());
        }

/*******************************************************************
 *  Map Collection
 *  Types of Flowers
 *  Features: Indexed, able to set and retrieve based on index
 *  number
 *******************************************************************/

        System.out.println("-- Map --");
        Map map = new HashMap();
        map.put(1,"Daisy");
        map.put(2,"Rose");
        map.put(3,"Iris");
        map.put(4,"Narcissus");
        map.put(5,"Orchid");
        map.put(6,"Tulip");
        map.put(7,"Sunflower");
        map.put(8,"Cyclamen");
        map.put(9,"Carnation");
        map.put(10,"Poppy");
        map.put(11,"Daisy");
        map.put(3,"Garbage");

        for (int i = 1; i <= 11; i++) {
            String result = (String)map.get(i);
            System.out.println(result);
        }

/*******************************************************************
 *  Generic Collection
 *  I settled on a small list of favorite books
 *  Features: Types, compiler checked type safety, reusable code
 *  blocks based on type, simpler to use than creating individual
 *  objects
 *******************************************************************/

        System.out.println("-- List using Generics --");
        List<GenericData> myList = new LinkedList<GenericData>();
        myList.add(new GenericData("Mistborn - The Final Empire", "Brandon Sanderson", "2006"));
        myList.add(new GenericData("Mistborn - The Well of Ascension", "Brandon Sanderson", "2007"));
        myList.add(new GenericData("Mistborn - The Hero of Ages", "Brandon Sanderson", "2008"));
        myList.add(new GenericData("The Chronicles of Prydain - The Book of Three", "Lloyd Alexander", "1964"));
        myList.add(new GenericData("The Chronicles of Prydain - The Black Cauldron", "Lloyd Alexander", "1965"));
        myList.add(new GenericData("The Chronicles of Prydain - The Castle of Llyr", "Lloyd Alexander", "1966"));
        myList.add(new GenericData("Serafina and the Black Cloak", "Robert Beatty", "2015"));

        for (GenericData book : myList) {
            System.out.println(book);
        }

    }
}
