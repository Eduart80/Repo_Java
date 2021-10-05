package Interview;

//public class IntervalsLists {
//    public static List<List<Integer>> getMergedIntervals(List<List<Integer>> intervals) {
//
//        if(intervals == null || intervals.size() == 0 ){
//            return null;
//        }
//        intervals.sort((q1, q2)->Integer.compare(q1.start, q2.start));
//
//        List<Integer> result =new LinkedList<>();
//
//        int start = intervals.get(0).start;
//        int end = intervals.get(0).end;
//        for(interval interval : intervals){
//            if(interval.start <= end){
//                end =Math.max(end, interval.end);
//            }else{
//                result.add(new Interval(start,end));
//                start = interval.start;
//                end=interval.end;
//            }
//        }
//        result.add(new Interval(start, end));
//        return result;


//    }

//    public static class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int intervalsRows = Integer.parseInt(bufferedReader.readLine().trim());
//            int intervalsColumns = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<List<Integer>> intervals = new ArrayList<>();
//
//            for (int i = 0; i < intervalsRows; i++) {
//                String[] intervalsRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//                List<Integer> intervalsRowItems = new ArrayList<>();
//
//                for (int j = 0; j < intervalsColumns; j++) {
//                    int intervalsItem = Integer.parseInt(intervalsRowTempItems[j]);
//                    intervalsRowItems.add(intervalsItem);
//                }
//
//                intervals.add(intervalsRowItems);
//            }
//
//            List<List<Integer>> result = Result.getMergedIntervals(intervals);
//
//            for (int i = 0; i < result.size(); i++) {
//                for (int j = 0; j < result.get(i).size(); j++) {
//                    bufferedWriter.write(String.valueOf(result.get(i).get(j)));
//
//                    if (j != result.get(i).size() - 1) {
//                        bufferedWriter.write(" ");
//                    }
//                }
//
//                if (i != result.size() - 1) {
//                    bufferedWriter.write("\n");
//                }
//            }
//
//            bufferedWriter.newLine();
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//    }

//    class Solution {
//        public int[][] merge(int[][] intervals) {
//            if (intervals.length <= 1)
//                return intervals;
//
//            // Sort by ascending starting point
//            Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
//
//            List<int[]> result = new ArrayList<>();
//            int[] newInterval = intervals[0];
//            result.add(newInterval);
//            for (int[] interval : intervals) {
//                if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
//                    newInterval[1] = Math.max(newInterval[1], interval[1]);
//                else {                             // Disjoint intervals, add the new interval to the list
//                    newInterval = interval;
//                    result.add(newInterval);
//                }
//            }
//
//            return result.toArray(new int[result.size()][]);
//        }
//    }



//}
