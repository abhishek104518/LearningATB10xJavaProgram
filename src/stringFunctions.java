public class stringFunctions {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Length of the string: " + str.length());

        String str1 = "Hello";
        String str2 = " World!";
        String result = str1.concat(str2);
        System.out.println("Concatenated string: " + result);

        String str10 = "hello";
        System.out.println("Uppercase: " + str10.toUpperCase());

        String str11 = "HELLO";
        System.out.println("Lowercase: " + str11.toLowerCase());

        String str12 = "Hello, World!";
        System.out.println("Substring: " + str12.substring(7));
        System.out.println("Substring with range: " + str12.substring(0, 5));

        String str13 = "Java Programming";
        System.out.println("Replace: " + str13.replace('a', 'o'));

        String str14 = "   Hello, World!   ";
        System.out.println("Trimmed: '" + str14.trim() + "'");

        String str15 = "Java Programming";
        System.out.println("Contains Java : "+str15.contains("Java"));
        System.out.println("Contains Hello : "+str15.contains("Hello"));

        String str16 = "Hello";
        String str17 = "Hello";
        String str18 = "hello";
        System.out.println("Equals (case-sensitive): " + str16.equals(str17));
        System.out.println("Equals (case-sensitive): " + str16.equals(str18));

        String str19 = "Hello";
        String str20 = "hello";
        System.out.println("Equals ignore case: " + str19.equalsIgnoreCase(str20));

        String str21 = "apple,banana,orange";
        String[] fruits = str21.split(",");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        String str22 = "Hello";
        System.out.println("Character at index 1: " + str22.charAt(1));

        String str23 = "Hello, World!";
        System.out.println("Index of 'o': " + str23.indexOf('o'));  //
        System.out.println("Index of 'World': " + str23.indexOf("World"));

        String str24 = "Hello, World!";
        System.out.println("Starts with 'Hello': " + str24.startsWith("Hello"));
        System.out.println("Starts with 'World': " + str24.startsWith("World"));

        String str25 = "Hello, World!";
        System.out.println("Ends with '!': " + str25.endsWith("!"));
        System.out.println("Ends with 'World': " + str25.endsWith("World"));
    }
}
