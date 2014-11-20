/* ========================================================================
   * Copyright 2014 ejemplo
   *
   * Licensed under the MIT, The MIT License (MIT)
   * Copyright (c) 2014 ejemplo
  
  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files (the "Software"), to deal
  in the Software without restriction, including without limitation the rights
  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  copies of the Software, and to permit persons to whom the Software is
  furnished to do so, subject to the following conditions:
  
  The above copyright notice and this permission notice shall be included in
  all copies or substantial portions of the Software.
  
  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
  THE SOFTWARE.
   * ========================================================================
  
  
  Source generated by CrudMaker version 1.0.0.201410152247*/

package co.edu.uniandes.csw.ejemplo.util;

import java.util.Date;
import java.util.Random;

public class _TestUtil {

    public static <T> T generateRandom(Class<T> objectClass) {
        Random r = new Random();
        if (objectClass.equals(String.class)) {
            String s = "";
            for (int i = 0; i < 10; i++) {
                char c = (char) (Math.abs(r.nextInt()) % ('Z' - 'A') + 'A');
                s = s + c;
            }
            return objectClass.cast(s);
        } else if (objectClass.equals(Integer.class)) {
            Integer s = r.nextInt();
            return objectClass.cast(s);
        } else if (objectClass.equals(Long.class)) {
            Long s = r.nextLong();
            return objectClass.cast(s);
        } else if (objectClass.equals(java.util.Date.class)) {
            java.util.Calendar c = java.util.Calendar.getInstance();
            c.set(java.util.Calendar.MONTH, Math.abs(r.nextInt()) % 12);
            c.set(java.util.Calendar.DAY_OF_MONTH, Math.abs(r.nextInt()) % 30);
            return objectClass.cast(c.getTime());
        }
        return null;
    }

    private final static java.text.SimpleDateFormat DATE_FORMAT = new java.text.SimpleDateFormat("dd/MM/yyyy");

    public static String generateRandomDate() {
        Random r = new Random();
        java.util.Calendar c = java.util.Calendar.getInstance();
        c.set(java.util.Calendar.MONTH, Math.abs(r.nextInt()) % 12);
        c.set(java.util.Calendar.DAY_OF_MONTH, Math.abs(r.nextInt()) % 30);
        c.setLenient(true);
        return DATE_FORMAT.format(c.getTime());
    }

    public static Date parseDate(String date) {
        try {
            return DATE_FORMAT.parse(date);
        } catch (Exception e) {
            return null;
        }

    }
}
