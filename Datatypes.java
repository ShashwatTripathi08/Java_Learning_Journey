public class Datatypes {
    public static void main(String[] args) {
        // Integers --> byte, short, int, long
        // Binary (2), Octal (8), Hexadecimal (16) Number System

        /*
        These are applicable for all data types:

        if we write 0b before any number it will convert the binary code to the actual number it means. 
        ex. byte b = 0b101; it will give the output as 5. 

        A leading ⁠0⁠ treats the integer as an octal (base-8) number. 
        Digits allowed are ⁠0–7⁠. For example, ⁠012⁠ evaluates to decimal ⁠10⁠.

        A leading ⁠0x⁠ or ⁠0X⁠ treats the integer as hexadecimal (base-16). 
        Valid digits are ⁠0–9⁠ and ⁠A–F⁠ (where ⁠A=10⁠ to ⁠F=15⁠). For example, ⁠0xF⁠ evaluates to ⁠15⁠.

         */

        byte b = 10; // Normal decimal number
        short s = 1000;
        int i = 10000;
        long l = 100000;

        // Real Numbers --> float, double
        float f = 10.54f; // single precission
        double d = 6.78910; // double precission (large number of decimal places can be stored) --> Standard way
        // double d = 6.023e23 to print 6.023 * 10^23 --> Scientific way

        // Character 
        char c = 'a';

        // Boolean --> true, false
        boolean bool = false;

        System.out.println("Integer values are "+ b + "," + s + "," + i + "," + l);
        System.out.println("Real numbers are "+ f + "," + d);
        System.out.println("Character is "+ c);
        System.out.println("Boolean is "+ bool);

    }
}

// in the above syntaxes we are declaring and defining the values at the same time, this is known as hard coded values.