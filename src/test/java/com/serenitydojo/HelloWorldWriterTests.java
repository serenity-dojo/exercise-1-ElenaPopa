package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTests {

    @Test
    public void shouldWriteHelloWorldToTheConsole(){
        HelloWorldWriter helloWorldWriter = new HelloWorldWriter();
        helloWorldWriter.writeHelloWorld();
    }
}