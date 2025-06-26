//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
                "August","September", "October", "November", "December"};
        int[] monthDaysCount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println();
        int monthDaysIndex = 0;
        for(String monthName : monthNames)
        {

            System.out.println(monthName);
            int weekDaysIndex = 0;
            for(String dayName : dayNames)
            {

                System.out.print(dayName.substring(0, 2) + " ");
                weekDaysIndex++;
            }

            System.out.println();

            int i = 1;
            while (i  <= monthDaysCount[monthDaysIndex])
            {
                System.out.print(String.format("%1$2s", i) + " ");
                if(i % 7 == 0) {
                    System.out.println();
                }
                // System.out.print(i + " ");

                i++;
            }
            System.out.println();
            System.out.println();
            monthDaysIndex++;
        }
    }
}