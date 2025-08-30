package Platform.LeetCode.Medium;

public class MultiplyString {
    static String multiply(String num1, String num2)
    {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();
        int[] product = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int sum = digit1 * digit2 + product[i + j + 1];

                product[i + j + 1] = sum % 10;
                product[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        // Skip leading zeros
        while (i < product.length && product[i] == 0) {
            i++;
        }

        while (i < product.length) {
            sb.append(product[i]);
            i++;
        }

        return sb.toString();
    }
    public static void main(String []args)
    {
        String num1 = "123456789";
        String num2 = "987654321";
        System.out.println(multiply(num1, num2));
    }
}
