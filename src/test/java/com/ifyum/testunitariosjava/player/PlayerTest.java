package com.ifyum.testunitariosjava.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {


    @Test
    public void loses_when_dice_number_is_too_low() {
//      Dice dice = new Dice(6);
        //ya que la respuesta es aleatoria usaremos mockito para simular una respuesta esperada porque de lo contrario
        // el test aveces sera correcto y otras veces no
        Dice dice =   Mockito.mock(Dice.class);
        //esta linea esta simulando el dado y cuando alguien llame al roll de la clase dice devuelva un 2
       Mockito.when(dice.roll()).thenReturn(2);

       Player player = new Player(dice,3);
       assertFalse(player.play());
    }


    @Test
    public void loses_when_dice_number_is_big() {
        Dice dice =   Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice,3);
        assertTrue(player.play());
    }


}
