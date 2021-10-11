package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHakerTest {
    @Test
    public void shouldRemain() {
        CashBackHaker cashback = new CashBackHaker();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotRemain() {
        CashBackHaker cashback = new CashBackHaker();
        int amount = 900;
        int actual = cashback.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
}
