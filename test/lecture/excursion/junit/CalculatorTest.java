package lecture.excursion.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Class Calculator")
class CalculatorTest {

    static Calculator calculatorUnderTest;

    @BeforeAll
    static void setupAll() {
        System.out.println("setupAll - läuft einmal vor allen Tests");
        calculatorUnderTest = new Calculator();
    }

    @BeforeEach
    void setUp() {
        System.out.println("Setup - läuft vor jedem Test");

    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown - läuft nach jedem Test");
    }

    @AfterAll
    static void teadDownAll(){
        System.out.println("tearDownAll - läuft nach allen Test");
        calculatorUnderTest = null;
    }


    @Nested
    @DisplayName("Tests for Add-Method")
    class addTests {

        @Test
        @DisplayName("Add double numbers - normal case")
        @Tag("localRun")
        @RepeatedTest(10)
        void add() {
            System.out.println("add - Test");
            double result = calculatorUnderTest.add(10.0, 10.0);

            assertEquals(20.0, result);     // -->  Assertions.assertEquals(...);
        }

        @Test
        @DisplayName("Add zeros")
        void addWithNull() {
            System.out.println("add - Test");
            double result = calculatorUnderTest.add(0.0, 0.0);

            assertEquals(0.0, result);
        }

        @Test
        @DisplayName("Add big numbers")
        void addWithBigNumbers() {
            System.out.println("add - Test");
            double result = calculatorUnderTest.add(100000000.0, 100000000.0);

            assertEquals(200000000.0, result);
        }

        // ...
    }


    @Test
    @Tag("remoteRun")
    void multiply() {
        System.out.println("multiply - Test");
        double result = calculatorUnderTest.multiply(10.0, 10.0);

        assertEquals(100.0, result);
    }


    @ParameterizedTest
    @Tag("remoteRun")
    @CsvFileSource(resources = "/multiplyTestCases.csv")
    void multiplyParamterized() {
        System.out.println("multiply - Test");
        double result = calculatorUnderTest.multiply(10.0, 10.0);

        assertEquals(100.0, result);
    }

    @ParameterizedTest(name = "{0} multiplied with {1} should result in {2}")
    @Tag("remoteRun")
    @MethodSource("lecture.excursion.junit.CalculatorTest#provideMultiplyTestCases")
    void multiplyParamterizedWithMethod(double numberA, double numberB, double expectedResult) {
        System.out.println("multiply - Test");
        double result = calculatorUnderTest.multiply(numberA, numberB);

        assertEquals(expectedResult, result);
    }


    @ParameterizedTest(name = "{0} minus {1} should result in {2}")
    @DisplayName("parameterized minus")
    @CsvSource({
            "10.0, 5.0, 5.0",
            "15.0, 8.0, 7.0",
            "18, 20, -2",
            "10000000, -1, 10000001.0"
    })
    void minus(double numberA, double numberB, double expectedResult){
        double actualResult = calculatorUnderTest.minus(numberA, numberB);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divideByZero(){
        double actualResult = calculatorUnderTest.divide(5.0, 0.0);

        assertTrue(Double.isInfinite(actualResult));
    }


    @Test
    void IndexOutOfBounds(){
        int[] numbers = new int[5];

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            numbers[10] = 100;
        });
    }


    static Stream provideMultiplyTestCases(){
        return Stream.of(
                Arguments.of(10.0, 10.0, 100.0),
                Arguments.of(5.0, 4.0, 20.0)
                // ...
        );
    }

}