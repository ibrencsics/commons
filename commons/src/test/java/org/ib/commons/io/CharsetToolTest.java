package org.ib.commons.io;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2012.10.09.
 * Time: 16:34
 * To change this template use File | Settings | File Templates.
 */
public class CharsetToolTest {

    @Test
    public void testDecodeEncode() throws IOException {
        CharBuffer decoded = CharsetTool.decode(IOUtils.getInputStreamFromResources("io/utf8.test.1.txt"), "UTF-8");
        System.out.println(decoded.toString());

        ByteBuffer encoded = CharsetTool.encode(decoded, "UTF-16");

        FileOutputStream outFile = new FileOutputStream("c:/Temp/test/encoded.txt");
        FileChannel out = outFile.getChannel( );
        out.write(encoded);
        out.close( );

    }
}
