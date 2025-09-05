package concepts.strings;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Ankit");
//        System.out.println(sb.length());              // GET NUMBER OF CHAR IN STRING BUILDER
        sb.append(" go swami");                         // APPEND TEXT
        sb.insert(6, "Manoj ");               // INSERT AN ELEMENT
//        sb.deleteCharAt(2);                           // DELETE RANGE
//        sb.setLength(30);                             // IS USED TO RESET/ EMPTY THE STRING BUILDER
//        sb.ensureCapacity(100);                       // MINIMUM CAPACITY
        sb.replace(0,5,"Ronny");          // REPLACE
//        sb.substring(1,4);                            // GET SUBSTRING
//        sb.charAt(0);                                 // GET CHARACTER OF AN INDEX VALUE
//        String str = sb.toString();                   // CONVERT STRING BUILDER TO STRING

        System.out.println(sb);

    }
}