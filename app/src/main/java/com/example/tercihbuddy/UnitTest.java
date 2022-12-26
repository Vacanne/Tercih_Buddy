package com.example.tercihbuddy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {
    User nu=new User();
    @Test
    public void mail_isCorrect() {
        //Basic Mail check
        nu.setEmail("must1@gmail.com");
        assertEquals(nu.getEmail(),"must1@gmail.com");
    }

    @Test
    public void getIsActive_tb() {
        //Basic Username check
        nu.setUsername("MUSTAFA");
        assertEquals(nu.getUsername(),"Mustafa");
    }

    @Test
    public void pid_isCorrect() {
        //Basic Pid check
        nu.setPid("654321");
        assertEquals(nu.getPid(),"654321");
    }
}