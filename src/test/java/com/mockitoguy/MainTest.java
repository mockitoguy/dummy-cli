package com.mockitoguy;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void basic_lifecycle() {
        App app = new App();
        DummyCli cli = DummyCli.withInput("1", "2", "3");

        //when
        app.start(cli);

        //then
        assertEquals(asList(App.HELLO, App.ALBUMS, App.HELLO, App.SEARCH, App.HELLO, App.BYE),
                cli.getOutputs());
    }
}
