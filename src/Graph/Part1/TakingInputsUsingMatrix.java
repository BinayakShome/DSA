package Graph.Part1;

public class TakingInputsUsingMatrix {
    public static void main(String []args) {
        int n = 3, m = 3;
        int[][] matrix = new int[n + 1][n + 1];

        //edge 1<--->2
        matrix[1][2] = 1;
        matrix[2][1] = 1;

        //edge 1<--->3
        matrix[1][3] = 1;
        matrix[3][1] = 1;
    }
}
