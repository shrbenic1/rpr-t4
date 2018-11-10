package ba.unsa.etf.rpr.tutorijal04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {
    @Test
    void studentTest() {
        Predmet predmet = new Predmet("RPR", 5, true);
        assertAll(
                () -> assertEquals("RPR", predmet.getIme()),
                () -> assertEquals((Integer)5, predmet.getEcts()),
                () -> assertEquals(true, predmet.isIzborni())
        );
    }
}