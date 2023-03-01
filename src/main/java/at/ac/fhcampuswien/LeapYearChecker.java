package at.ac.fhcampuswien;

public class LeapYearChecker {

    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else return year % 100 != 0;
    }

    public static void main(String[] args) {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        System.out.println("2020 " + leapYearChecker.isLeapYear(2020));
        System.out.println("1943 " + leapYearChecker.isLeapYear(1943));
        System.out.println("100 " + leapYearChecker.isLeapYear(100));
        System.out.println("2000 " + leapYearChecker.isLeapYear(2000));
    }
}
