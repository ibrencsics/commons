package org.ib.commons.io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.*;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2012.10.09.
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
public class CharsetTool {

    public static ByteBuffer encode(CharBuffer input, String encoding) {

        ByteBuffer output = ByteBuffer.allocate(input.capacity() * 3);

        try {
            Charset inputEncoding = Charset.forName(encoding);
            CharsetEncoder encoder = inputEncoding.newEncoder();
            encoder.onUnmappableCharacter(CodingErrorAction.REPLACE);

            while (input.hasRemaining( )) {
                CoderResult result = encoder.encode(input, output, false);
                if (result.isError( )) throw new IOException("Could not encode");
            }
            encoder.encode(input, output, true);
            encoder.flush(output);
            output.flip( );

        } catch (UnsupportedCharsetException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return output;
    }

    public static CharBuffer decode(InputStream inStream, String encoding) {

        CharBuffer outputBuffer = CharBuffer.allocate(4096);

        try {
            Charset inputEncoding = Charset.forName(encoding);
            CharsetDecoder decoder = inputEncoding.newDecoder();

            ReadableByteChannel in = Channels.newChannel(inStream);

            ByteBuffer inputBuffer = ByteBuffer.allocate(4096);

            while (in.read(inputBuffer) != -1);

            inputBuffer.flip();

            while (inputBuffer.hasRemaining( )) {
                CoderResult result = decoder.decode(inputBuffer, outputBuffer, false);
                if (result.isError()) throw new IOException( );
            }

            decoder.decode(inputBuffer, outputBuffer, true);
            decoder.flush(outputBuffer);
            outputBuffer.flip( );

        } catch (UnsupportedCharsetException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return outputBuffer;
    }
}
