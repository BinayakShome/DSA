package pattern;

public class pattern14 {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = n - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}