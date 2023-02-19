package practice;

public class GroupExerciseOne {

    public static void main(String[] args) {

        int month = 13;
        int year = 1988;

        GroupExerciseOne obj = new GroupExerciseOne();
        System.out.println(obj.getDaysInMonth(month, year));
    }

    public int getDaysInMonth(int month, int year) {
        int days = -1;
        if ((month < 1) || (month > 12)) {
            return days;
        }
        if ((year < 1) || (year > 9999)) {
            return days;
        }

            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        days = 29;
                    }
                    else {
                        days = 28;
                    }

            }

        return days;
    }

    private boolean isLeapYear(int year) {
        boolean isLeapYear = false;

        if ((year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)) {
            isLeapYear = true;
        }

        return isLeapYear;

    }

}
