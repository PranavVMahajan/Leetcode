class MyCalendarTwo {
    public List<int[]> doubleOverlapped;
    public List<int[]> overallBookings;
    public MyCalendarTwo() {
        doubleOverlapped = new ArrayList<>();
        overallBookings = new ArrayList<>();
    }
    public boolean checkOverlap(int start1, int end1, int start2, int end2) {
        return Math.max(start1, start2) < Math.min(end1, end2);
    }
    public int[] findOverlappedRegion(int start1, int end1, int start2, int end2) {
        return new int[]{Math.max(start1, start2), Math.min(end1, end2)};
    }

    public boolean book(int start, int end) {
        for (int[] region : doubleOverlapped) {
            if (checkOverlap(region[0], region[1], start, end)) {
                return false; 
            }
        }
        for (int[] booking : overallBookings) {
            if (checkOverlap(booking[0], booking[1], start, end)) {
                doubleOverlapped.add(findOverlappedRegion(booking[0], booking[1], start, end));
            }
        }
        overallBookings.add(new int[]{start, end});
        return true;
    }
}
/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */