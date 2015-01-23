/** Class that determines whether or not a year is a leap year.
 *  @author YOUR NAME HERE
 */
public class LeapYear {

    /** @param  year to be analyzed
     *  @return true if year is a leap year
     *          false if year is not a leap year
     */
    /** Must be provided an integer as a command line argument ARGS. */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try {
                int year = Integer.parseInt(args[i]);
                if (year % 400 == 0|| ((year % 4 == 0) && !(year % 100 == 0))){
                    System.out.println(year + " is a leap year.");}
                else {
                    System.out.println(year + " is not a leap year.");}
            } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", args[i]);
            }
        }
    }

}

