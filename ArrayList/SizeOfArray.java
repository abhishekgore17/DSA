package ArrayList;
import java.util.ArrayList;

public class SizeOfArray {
        public static void main(String[] args){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            System.out.print("Size of the array list is :"+ list.size());

            //print the arraylist
            for(int i =0; i<list.size(); i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println();

        }
    }
