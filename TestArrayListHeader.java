package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.ArrayList;
import java.io.*;

public class TestArrayListHeader {

   @Test
   public void testArrayList()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Main.main(null);

     // assertion
      ArrayList<Integer> a = new ArrayList<Integer>();
      ArrayList<Integer> b = Main.test();
      assertTrue(a.equals(b));

     // undo the binding in System
     System.setOut(originalOut);
   }
}
