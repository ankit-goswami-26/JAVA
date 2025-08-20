public class SwitchS {
    public static void main(String[] args) {

        String day = "Thursday";
        String result = "";

        result  = switch (day) {

            // INSTEAD OF SYSTEM.OUT.PRINTLN OR MULTIPLE ASSIGNING VALUE WE CAN DIRECTLY ASSIGN RESULT BEFORE SWITCH STATEMENT

            // ITS AN NEW METHOD FOR SWITCH STATEMENT


            case "Saturday", "Sunday" -> "6am"; // NEW METHOD REPLACES BREAKS WITH A RIGHT ARROW

            case "Monday" -> "7am";

            default -> "8am";//IF YOU DON'T WANT TO USE ARROW, THEN YOU CAN USE COLON BUT YOU NEED TO MENTION YIELD

        }; // Since it's an expression you need to put semicolon in the end

        System.out.println(result);
    }
}








//        switch(day) // ITS AN OLD METHOD OF SWITCH STATEMENT
//        {
//            case "Saturday", "Sunday" :
//                System.out.println("6am");
//                break;
//
//
//            case "Monday" :
//                System.out.println("7am");
//                break;
//
//
//            default:
//                System.out.println("8am");
//
//        }
//    }
//   }//