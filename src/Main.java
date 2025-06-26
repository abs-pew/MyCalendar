//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
                "August","September", "October", "November", "December"};
        int[] monthDaysCount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int calendarYear = 2025;
        //int yearTotalDaysCount = 1;
        int newLineCounter = 3;

// boolean isNextMonth = ;
        System.out.println();
        int monthDaysIndex = 0;
        for(String monthName : monthNames)
        {

            System.out.println(monthName);
           // int weekDaysIndex = 0;
            for(String dayName : dayNames)
            {

                System.out.print(dayName.substring(0, 2) + " ");
            //    weekDaysIndex++;
            }
            System.out.println();
            setNewLinePointer(newLineCounter);

            int i = 1;
            while (i  <= monthDaysCount[monthDaysIndex])
            {
                System.out.print(String.format("%1$2s", i) + " ");
                if(newLineCounter % 7 == 0) {
                    System.out.println();
                   //newLineCounter = 0;  // it gets incremented to 1 for next iteration of While-Loop
                }
                // System.out.print(i + " ");

                i++;
                newLineCounter++;
            }
            System.out.println();
            System.out.println();
            monthDaysIndex++;

        }
    }
    public static void setNewLinePointer(int newLineCounter)
    {
        for (int j = 1; j < (newLineCounter % 7); j++)
        {
            System.out.print(String.format("%1$2s", " ") + " ");
        }
    }
}