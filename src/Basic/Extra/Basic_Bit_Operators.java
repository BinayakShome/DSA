package Basic.Extra;

public class Basic_Bit_Operators {
    public static void main(String[] args)
    {
        System.out.println(9|10); //OR operator
        System.out.println(9&10); //And operator
        System.out.println(9^10);  // Xor operator
        System.out.println(~9);  //Not operator

        System.out.println(9<<1); //Left shift operator  --> Doubles the value
        System.out.println(9<<2);

        System.out.println(9>>1); //Right shift operator  --> Halves the value
        System.out.println(9>>2);
    }
}