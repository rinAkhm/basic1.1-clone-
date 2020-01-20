package ru_netology.unitDz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturnZeroIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount =  1000;

        int actual = service.remain(amount);
        int expected = 0;
        //выдаст ошибку так, как при amount = 1000 не должен выдовать сообщение о покупке на 1000 руб.
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturn900IfAmountLowerThan1000(){
        CashbackHackService service = new CashbackHackService();
        int amount =  100;

        int actual = service.remain(amount);
        int expected = 900;
        //должен выдать 900 руб.
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturn500IfAmountIs1500(){
        CashbackHackService service = new CashbackHackService();
        int amount =  1500;

        int actual = service.remain(amount);
        int expected = 500;
        //должен выдать 500 руб.
        assertEquals(expected,actual);
    }
}