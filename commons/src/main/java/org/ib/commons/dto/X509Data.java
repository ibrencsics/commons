package org.ib.commons.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
* Created by IntelliJ IDEA.
* User: ibrencsics
* Date: 5/27/12
* Time: 11:39 PM
* To change this template use File | Settings | File Templates.
*/
public class X509Data implements Serializable {
    
    public BigInteger serialNumber;
    public String issuerDN;
    public Date notBefore;
    public Date notAfter;
    public String subjectDN;

    public String signatureAlgorithm;
}
