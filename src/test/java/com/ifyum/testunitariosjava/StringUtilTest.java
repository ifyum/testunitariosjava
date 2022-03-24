package com.ifyum.testunitariosjava;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
//lo que esperamos recibir va primero el assert equals nos ayuda a eso
    @Test
    public  void testRepeat_string_one() {
        Assert.assertEquals("hola" ,StringUtil.repeat("hola",1));
    }

    @Test
    public  void testRepeat_string_two_times() {
        Assert.assertEquals("hola hola" ,StringUtil.repeat("hola",2));
    }

    @Test
    public  void testRepeat_string_three_times() {
        Assert.assertEquals("hola hola hola" ,StringUtil.repeat("hola",3));
    }

    @Test
    public  void testRepeat_string_zero_times() {
        Assert.assertEquals("" ,StringUtil.repeat("hola",0));
    }


    // este espera una respuesta de la clase exepcion de argumento ilegal
    @Test(expected = IllegalArgumentException.class)
    public  void testRepeat_string_negative_times() {
        Assert.assertEquals("" ,StringUtil.repeat("hola",-1));
    }


//    @Test
//    public  void testRepeat_string_multiple_times() {
//        Assert.assertEquals("hola" ,StringUtil.repeat("hola",9));
//    }


    @Test
    public void word_is_not_empty(){
        assertFalse(StringUtil.isEmpty("Palabra"));
    }

    @Test
    public void quotationMarks_is_Empty(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void space_is_Empty(){
        String str = new String(" ");
        assertTrue(StringUtil.isEmpty(str));
    }

    @Test
    public void null_is_empty(){
        assertTrue(StringUtil.isEmpty(null));
    }
}
