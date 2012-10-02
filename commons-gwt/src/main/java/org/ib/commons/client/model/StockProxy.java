/**
 * Sencha GXT 3.0.0 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package org.ib.commons.client.model;

import java.util.Date;

public interface StockProxy {

  public double getChange();

  public Date getDate();

  public String getName();

  public String getSymbol();

  public void setChange(double change);

  public void setDate(Date date);

  public void setName(String name);

  public void setSymbol(String symbol);

}
