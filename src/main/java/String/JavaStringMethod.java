package String;

public class JavaStringMethod {
    public static void main(String[] args) {
        String str = "Welcome to the ";
        String str1 = "Java ";
        String str3 = "Programing Language";
        String str4 = "Java";

        /*
        charAT():Helps us to find the characters at the given index of the string
        */
        char ch = str.charAt(5);
        System.out.println(ch);

        /*
        ComareTo() is used to compare two stringd
         */
        System.out.println(str.compareTo(str3));
        System.out.println(str1.compareTo(str));

        /*
        ContentEquals() compare the string and give the boolean values
         */
        System.out.println(str3.contentEquals(str));
        System.out.println(str1.contentEquals(str4));

        /*
        String Capacity() returns the current capacity of the string
         */
        StringBuffer str6 = new StringBuffer();
        str6.append("Hellop Java");
        System.out.println(str6.capacity());

        /*
        Lowercase and Uppercase
         */
        System.out.println(str1.toLowerCase());
        System.out.println((str1.toUpperCase()));

        /*
        replace
         */
        StringBuffer sb = new StringBuffer("Welcome to the world of Java");
        sb.reverse();
        System.out.println(sb);

        /*
        EqualsIgnoreCase
         */
        String str5 = "java";
        System.out.println(str5.equalsIgnoreCase(str1));
        System.out.println(str5.equalsIgnoreCase(str4));


    }
}
