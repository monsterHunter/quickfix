package org.quickfix.field; 
import org.quickfix.StringField; 
import java.util.Date; 

public class LegSecurityIDSource extends StringField 
{ 

  public LegSecurityIDSource() 
  { 
    super(603);
  } 
  public LegSecurityIDSource(String data) 
  { 
    super(603, data);
  } 
} 
