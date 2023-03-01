package at.ac.fhcampuswien;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCheckerTest {

    // these tests ar parameterized, meaning that the same test is executed multiple times with different parameters
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 89, 2113})   // given
    void a_year_not_divisible_by_4_is_not_a_leap_year(int year){
        boolean result = new LeapYearChecker().isLeapYear(year); // when
        assertFalse(result);    // then
    }

    @ParameterizedTest
    @ValueSource(ints = {16, 2172, 492})
    void a_year_divisible_by_4_but_not_by_100_is_a_leap_year(int year) {
        assertTrue(new LeapYearChecker().isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100, 2200, 2300})
    void a_year_divisible_by_100_but_not_by_400_is_not_a_leap_year(int year) {
        assertFalse(new LeapYearChecker().isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {400, 2000, 2400})
    void a_year_divisible_by_400_is_a_leap_year(int year) {
        assertTrue(new LeapYearChecker().isLeapYear(year));
    }
}