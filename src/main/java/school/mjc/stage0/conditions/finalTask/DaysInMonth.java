package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean valid;
        boolean leap;
        valid = month <= 12 && month >=1 && year > 0 && year <= 2023;
        leap = year%4 == 0 && month == 2 && year!=1900 || year%400 == 0 && month == 2 && year!=1900;

        if (!valid) {
            System.out.println("invalid date");
        }else if(leap){
            System.out.println("29");

        }else{
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
                case 2:
                    System.out.println("28");
                    break;

            }
        }









    }
}
