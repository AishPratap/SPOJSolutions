import java.util.*;

/**
 * Created by aishpratap on 3/29/17.
 */
public class NthLargest {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int testCases = s.nextInt();

    for(int i = 0; i < testCases ; i ++){

      int tstCaseNo = s.nextInt();

      PriorityQueue<Integer> pqueue = new PriorityQueue<>(3);

      for (int j = 0; j < 10 ; j ++){

        pqueue.offer(s.nextInt());
        if (pqueue.size() > 3){
          pqueue.poll();
        }
      }

      System.out.println(i+1 + " " + pqueue.peek());
    }
  }
}
