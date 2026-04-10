package JAVA_Journey.arrays;

public class MultiDimArray {
    public static void main(String[] args) {

        // 2D Array
        int[][] rooms = new int[2][3];

        rooms[0][0] = 1; // 001-> will be stored as 1
        rooms[0][1] = 2;
        rooms[0][2] = 3;
        rooms[1][0] = 101;
        rooms[1][1] = 102;
        rooms[1][2] = 103;

        System.out.println("Displaying a 2-D array using for loop:");

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.printf("%03d ", rooms[i][j]);//d-> integer, 3-> total width 3 of characters, 0-> add 0 if the number is small.
            }
            System.out.println();
        }
    }
}
