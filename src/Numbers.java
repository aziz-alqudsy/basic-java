public class Numbers {
    public static void main(String[] args) {
        // data type
        // byte start from -128 until 127, size = 1 bytes
        byte Byte = 100;
        // short start from -32,768 until 32,767, size = 2 bytes
        short Short = 10000;
        // int start from -2,147,483,648 until 2,147,483,647, size = 4 bytes
        int Int = 1000000000;
        // long start from -9,223,372,036,854,775,808 until 9,223,372,036,854,775,807, size = 8 bytes
        long Long = 1000L;

        /*
        math operation
        including +, -, *, /
        */
        int math_operation = 1 + 3 * 4 / 2 - 2;
        System.out.println(math_operation);

        /*
        float division
        the result is float but rounded
        */
        float float_division = 8 / 3;
        System.out.println(float_division);

        /*
        float division
        the result is float
        */
        float x = 8;
        float y = 3;
        float division = x / y;
        System.out.println(division);

        /*
        integer division
        the result is integer and rounded
        */
        int integer_division = 8 / 3;
        System.out.println(integer_division);

        /*
        modulus
        the result is remainder number
        */
        int modulus = 13 % 5;
        System.out.println(modulus);
    }
}
