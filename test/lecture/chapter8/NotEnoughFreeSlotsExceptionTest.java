package lecture.chapter8;

import lecture.chapter7.Hotel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class NotEnoughFreeSlotsExceptionTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void HotelThrowsException(){

        Hotel myHotel = new Hotel(100);

        NotEnoughFreeSlotsException myException = Assertions.assertThrows(NotEnoughFreeSlotsException.class, () -> {
            myHotel.book(110);
        });

        Assertions.assertEquals(myHotel.freeSlots(),myException.getCurrentFreeSlots());
    }

    @Test
    void HotelThrowsNoException(){

        Hotel myHotel = new Hotel(100);

        Assertions.assertDoesNotThrow(() -> {myHotel.book(99);});
    }

    @Test
    void HotelThrowsNoExceptionInnerClass(){

        Hotel myHotel = new Hotel(100);

        Assertions.assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                myHotel.book(90);
            }
        });
    }
}