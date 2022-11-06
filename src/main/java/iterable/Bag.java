package iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



    public class Bag<T> implements Container<String> {
        List<String> bagFruit = new ArrayList<>();
        private T item;


        @Override
        public boolean isEmpty() {
            return bagFruit.isEmpty();
        }
//the other ones are right? right nice
        @Override
        public int size() {
            return bagFruit.size();
        }

        @Override
        public void add(String item) {
            bagFruit.add(item);
        }


        @Override
        public Iterator<String> iterator() {
            return bagFruit.iterator(); //oh so does this do the while loop in the main program.
            //I thought I had to put the while loop in here thats what I tried to do earlier
        }
    }


