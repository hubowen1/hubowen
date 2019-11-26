1 iaiport java.util .Scanner;
2
3 public class PalindromelgnoreNonAlphanumeric {
4 /** Main method V
5 public static void main(String[] args){
6 // Create a Scanner
7 Scanner input * new Scanner(System.in);
8
9 // Prompt the user to enter a string
10 System,out.print("Enter a string:
••
);
11 String s ■ input.nextLineQ;
12
// Display result
面向对象思考 337
14 System.out.println("Ignoring nonalphanumeric characters, \nis ••
15 + s + " a palindrome? " + isPalindrome(s));
16 }
17
18 /** Return true if a string is a palindrome */
19 public static boolean •
isPalindrome(String s) {
20 // Create a new string by eliminating nonalphanumeric chars
21 String si
*
filter(s);
22
23 // Create a new string that is the reversal of si
24 String s2 = reverse(sl);
25
26 // Check if the reversal is the same as the original string
27 return s2.equals(sl);
28 }
29

31 public static String filter(String s) {
32 // Create a string builder
33 StringBuilder stringBuilder
-
new StringBuilderf);

 // Examine each char in the string to skip alphanumeric char
 for (int i = 0; i < s.lengthO; i-M-) {
 if (Character.isLetterOrDigit(s.charAt(i))) {
 stringBuilder.append(s.charAt(i));
 }
 >

 // Return a new filtered string
 return stringBuilder.toStringO;
 }


 public static String reverseCString s) {
 StringBuilder stringBuilder = new StringBuilder(s);
 stringBuilder.reverseO; // Invoke reverse in StringBuilder
 return stringBuilder.toStringO;
}
