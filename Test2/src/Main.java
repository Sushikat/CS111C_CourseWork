/**
 * Created by Iris on 11/8/2014.
 */
import java.lang.Math;
import java.util.IdentityHashMap;
import java.util.Objects;

public class Main {
/*
// Number 16
    public int countInRange(SortedListInterface<Integer> sList, int low, int high){
        int lowIndex, highIndex;
        boolean go = true;
        if(sList.contains(low) && sList.contains(high)) {
            lowIndex = sList.getPosition(low);
            highIndex = sList.getPosition(high);

        }else if(sList.contains(low)) {
            lowIndex = sList.getPosition(low);
            int i;
            for (i = sList.length(); go && i >= lowIndex; i--) {
                if (sList.getEntry(i) < high)
                    go = false;
            }
            highIndex = i + 1;
        } else if(sList.contains(high)){
                highIndex = sList.getPosition(high);
            int i;
            for(i = highIndex; go && i >= 0; i--){
                if(sList.getEntry(i) < low)
                    go = false;
            }
            lowIndex = i;
        } else {
            int i;
            for (i = sList.length(); go && i >= 0; i--) {
                if (sList.getEntry(i) < high)
                    go = false;
            }
            highIndex = i + 1;

            int j;
            for(j = highIndex; go && j >= 0; j--){
                if(sList.getEntry(j) < low)
                    go = false;
            }
            lowIndex = j;
        }
        return highIndex - lowIndex - 1;
    }
*/
// Question 35
//    public static Integer maxQ (QueueInterface<Integer> q) {
//        QueueInterface<Integer> dontKill = new LinkedQueue<Integer>();
//        int current = 0;
//        int max = q.getFront();
//        while (!q.isEmpty()){
//            current = q.dequeue();
//            dontKill.enqueue(current);
//            if (current > max)
//                max = current;
//        }
//        return max;
//    }
//
// Question 36
//    public static int howManyMultiples (StackInterface<Integer> s, Integer multiple) {
//        if(s.isEmpty()){return 0;}
//        if(multiple == 0){
//            System.out.println("Cannot divide by 0");
//            return -1;
//        }
//        StackInterface<Integer> dontKill = new ArrayStack<Integer>();
//        int count = 0;
//        int current = 0;
//        while(!s.isEmpty()){
//            current = s.pop();
//            dontKill.push(current);
//            if((current % multiple) == 0)
//                count += 1;
//        }
//        while(!dontKill.isEmpty())
//            s.push(dontKill.pop());
//        return count;
//    }
// Question 37
//    public static void printBotTop(StackInterface<String> s){
//        StackInterface<String> dontKill = new ArrayStack<String>();
//        String current = "";
//        while(!s.isEmpty()){
//            dontKill.push(s.pop());
//        }
//        while(!dontKill.isEmpty()){
//            current = dontKill.pop();
//            System.out.println(current);
//            s.push(current);
//        }
//    }
    public static void main(String[] args){
        StackInterface<Object> mys = new ArrayStack<Object>();
        QueueInterface<Object> myq = new LinkedQueue<Object>();
        QueueInterface<Object> newq;
        Integer addInt = 0;
        for(int i = 0; i < 10; i++){
            addInt = i;
            mys.push(addInt);
            myq.enqueue(addInt);
            System.out.println(addInt.toString());
        }
        System.out.println();
        newq = newQ(mys, myq);
        while(!newq.isEmpty())
            System.out.println(newq.dequeue().toString());
    }

    public static QueueInterface<Object> newQ(StackInterface<Object> s, QueueInterface<Object> q){
        StackInterface<Object> s2 = new ArrayStack<Object>();
        StackInterface<Object> s3 = new ArrayStack<Object>();
        QueueInterface<Object> newq = new LinkedQueue<Object>();
        Object current;
        while(!s.isEmpty() || !q.isEmpty()) {
            s2.push(s.pop());
            s3.push(q.dequeue());
        }
        while(!s2.isEmpty()){
            current = s2.pop();
            s.push(current);
            newq.enqueue(current);
        }
        while(!s3.isEmpty()){
            current = s3.pop();
            q.enqueue(current);
            newq.enqueue(current);
        }
        return newq;
    }

}