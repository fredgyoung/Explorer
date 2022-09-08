public class StringExplorer {

    public static void main(String [] args) {

        // The charAt() method returns the character at the specified index in a string.
        {
            String myStr = "Hello";
            char result = myStr.charAt(0);
            System.out.println(result);
        }

        // The codePointAt() method returns the Unicode value of the character
        // at the specified index in a string.
        {
            String myStr = "Hello";
            int result = myStr.codePointAt(0);
            System.out.println(result);
        }

        // The codePointBefore() method returns the Unicode value of the character
        // before the specified index in a string.
        {
            String myStr = "Hello";
            int result = myStr.codePointBefore(1);
            System.out.println(result);
        }

        // The codePointCount() method returns the number of Unicode values found in a string.
        {
            String myStr = "Hello";
            int result = myStr.codePointCount(0, 5);
            System.out.println(result);
        }

        // The compareTo() method compares two strings lexicographically.
        // The comparison is based on the Unicode value of each character in the strings.
        // The method returns 0 if the string is equal to the other string.
        // A value less than 0 is returned if the string is less than the other string (less characters)
        // and a value greater than 0 if the string is greater than the other string (more characters).
        {
            String myStr1 = "Hello";
            String myStr2 = "Hello";
            System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
        }

        //
        {
        }

        //
        {
        }

        //
        {
        }

        //
        {
        }

        //
        {
        }

    }

}
