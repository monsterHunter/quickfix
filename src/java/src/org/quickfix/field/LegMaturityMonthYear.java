package org.quickfix.field; 
import org.quickfix.StringField; 
import java.util.Date; 

public class LegMaturityMonthYear extends StringField 
{ 

  public LegMaturityMonthYear() 
  { 
    super(610);
  } 
  public LegMaturityMonthYear(String data) 
  { 
    super(610, data);
  } 
} 
