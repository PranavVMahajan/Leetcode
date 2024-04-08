class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circleS = 0;
        int squareS = 0;
        for(int choice : students) {
            if(choice == 0) {
                circleS++;
            }
            else {
                squareS++;
            }
        }
        for(int sandwich : sandwiches) {
            if(sandwich ==0 && circleS== 0) {
                return squareS;
            }
            if(sandwich ==1 && squareS== 0) {
                return circleS;
            }
            if(sandwich == 0) {
                circleS--;
            }
            else {
                squareS--;
            }
        }
        return 0;
    }
}