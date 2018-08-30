import sun.awt.util.IdentityArrayList;

import java.util.*;

public class Solution57 {

      static  class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
    }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

          int n =intervals.size();


          List<Interval> res = new LinkedList<>();

          int cur=0;

          while(cur<n  && intervals.get(cur).end < newInterval.start) {
              res.add(intervals.get(cur));
              cur++;
          }

          while(cur <n && intervals.get(cur).start <= newInterval.end) {
              newInterval.start=Math.min(intervals.get(cur).start,newInterval.start);
              newInterval.end= Math.max(intervals.get(cur).end,newInterval.end);
              cur++;
          }

          res.add(newInterval);

          while(cur<n) {
              res.add(intervals.get(cur));
              cur++;
          }

          return res;


    }

    public static void main (String[] args) {


//          List<Interval> vals = new ArrayList<>(new Interval[]{})


    }
}
