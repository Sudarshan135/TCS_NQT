// 08 September 2024
//Check if given year is a leap year or not"
//year which is divisible by 4
// but  if it is century year check divisiblk by 400

package numbers.sept08;
public class Numbers_14 {
    public static void main(String[] args) {
//         int year=Num.enterNumber();

        for (int i = 1900; i <= 2024; i++) {
            new Numbers_14().checkLeapYear2(i);
        }
    }

    void checkLeapYear(int year) {

        if (year % 400 == 0) {
            System.out.println(year + "  Leap year ");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "  Leap year ");
        } else {
            System.out.println(year);
        }

    }

    void checkLeapYear2(int year) {

        if (year % 4 == 0) {

            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "  Leap year ");
                }else {
                    System.out.println("Not Leap Year "+year);
                }
            }else {
                System.out.println(year + "  Leap year ");
            }

        }

    }
}