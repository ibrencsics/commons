package org.ib.commons.io.stream;

import java.io.*;

public class ShortFilter extends DataFilter {

  public ShortFilter(DataInputStream din) {
    super(din);
  }

  protected void fill() throws IOException {
    int number = din.readShort();
    String s = Integer.toString(number) 
     + System.getProperty("line.separator", "\r\n");
    byte[] b = s.getBytes("8859_1");
    buf = new int[b.length];
    for (int i = 0; i < b.length; i++) {
      buf[i] = b[i];
    }
  }
}
