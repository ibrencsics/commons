package org.ib.commons.crypto;

/**
* Created by IntelliJ IDEA.
* User: ibrencsics
* Date: 5/20/12
* Time: 12:31 AM
* To change this template use File | Settings | File Templates.
*/
public class ResponseWrapper {
    public byte[] data;
    public int length;

    public ResponseWrapper(byte[] data, int length) {
        this.data = data;
        this.length = length;
    }
}
