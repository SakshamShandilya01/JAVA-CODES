import java.util.Scanner; 
public class CalendarDisplay { 
    static String getMonthName(int month) { 
        String[] months = {"January", "February", "March", "April", "May", "June",  
                           "July", "August", "September", "October", "November", "December"}; 
        return months[month - 1]; 
    } 
    static boolean isLeapYear(int year) { 
    } 
    static int getDaysInMonth(int month, int year) { 
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
            return 29; 
        } 
        return days[month - 1]; 
    } 
    static int getFirstDayOfMonth(int month, int year) { 
        int y = year; 
        int m = month; 
            m = m + 12; 
            y = y - 1; 
        } 
        int k = y  100; 
        int j = y / 100; 
        int day = (1 + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j)  7; 
        return day; 
    } 
    static void displayCalendar(int month, int year) { 
        String monthName = getMonthName(month); 
        int daysInMonth = getDaysInMonth(month, year); 
        int firstDay = getFirstDayOfMonth(month, year); 
        System.out.println("\n     " + monthName + " " + year); 
        System.out.println("Sun Mon Tue Wed Thu Fri Sat"); 
            System.out.print("    "); 
        } 
            System.out.printf("d ", day); 
            if((firstDay + day)  7 == 0) { 
                System.out.println(); 
            } 
        } 
        System.out.println(); 
    } 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter month (1-12): "); 
        int month = scanner.nextInt(); 
        System.out.print("Enter year: "); 
        int year = scanner.nextInt(); 
        displayCalendar(month, year); 
    } 
} 
