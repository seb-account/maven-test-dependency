package com.example.jenkins;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageSourceTest {
    private MessageSource messageSource;
    @Before
    public void setUp(){
        messageSource=new MessageSource();
    }
    @Test
    public void test(){
         assertEquals(new MessageSource().getMessage(),"Hi from the message source.");
    }
}
