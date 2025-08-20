
package Assignment4;

import java.util.Scanner;

public class Day_of_the_Week {


    public static String getDayName(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "so khong hop le vui long chon tu 1-7";
                break;
        }
        return dayName;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao 1 so tu 1-7: ");
        int dayNumber = scanner.nextInt();

        System.out.println(getDayName(dayNumber));

    }
}