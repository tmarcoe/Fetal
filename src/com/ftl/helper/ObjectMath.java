package com.ftl.helper;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

public class ObjectMath {

	public Double round(Double arg) {
		BigDecimal bd = new BigDecimal(arg);
		
		return bd.setScale(0,  RoundingMode.HALF_UP).doubleValue();
	}
	
	public Double roundUp(Double arg) {		
		BigDecimal bd = new BigDecimal(arg);
		
		return bd.setScale(0,  RoundingMode.UP).doubleValue();
	}
	
	public Double roundDown(Double arg) {
		BigDecimal bd = new BigDecimal(arg);
		
		return bd.setScale(0,  RoundingMode.DOWN).doubleValue();
	}
	
	public Double roundTo(Double arg, Long places) {
		BigDecimal bd = new BigDecimal(arg);
		
		return bd.setScale(Integer.valueOf(String.valueOf(places)),  RoundingMode.HALF_UP).doubleValue();
	}
	
	public Long toNumber(Object nmbr) {
		Long result = 0L;
		
		switch (getType(nmbr)) {
		case "String":
			result = Long.valueOf((String) nmbr);
			break;
			
		case "Double":
			result = new Double((Double) nmbr).longValue();
			break;
			
		case "Integer":
			result =  new Long((Integer) nmbr).longValue();
			break;
			
		case "Long":
			result = (Long) nmbr;
			break;
		}
		
		return result;
	}
	
	public Double toDecimal(Object decimal) {
		Double result = 0.0;
		
		switch(getType(decimal)) {
		case "String":
			result = Double.valueOf((String) decimal);
			break;
			
		case "Double":
			result = (Double) decimal;
			break;
			
		case "Integer":
			result = new Integer((Integer) decimal).doubleValue();
			break;
			
		case "Long":
			result = new Long((Long) decimal).doubleValue();
			break;
		}
		
		return result;
	}
	
	public Double absDecimal(Double arg) {
		return (arg < 0.0)? (arg *= -1.0): arg;
	}
	
	public Long absNumeric (Long arg) {
		return (arg < 0)? (arg *= -1): arg;
	}
	public Object exponentObject(Object l, Object r) {
		Object retObj = null;
		if (l == null || r == null) {
			return null;
		}

		retObj = (double) Math.pow(Double.valueOf(String.valueOf(l)), Double.valueOf(String.valueOf(r)));
		
		return retObj;
	}
	public Object addObject(Object l, Object r) {
		if (l == null || r == null) {
			return null;
		}

		String lName = getType(l);
		String rName = getType(r);
		Object retObj = null;
		switch (lName) {
		case "Double":
			retObj = (Double) l + (Double) r;
			break;

		case "Long":
			retObj = (Long) l + (Long) r;
			break;

		case "String":
			switch (rName) {
			case "Double":
				retObj = ((String) l).concat(String.valueOf((Double)r));
				break;
				
			case "Long":
				retObj = ((String) l).concat(String.valueOf((Long)r));
				break;
				
			case "String":
				retObj = ((String) l).concat((String) r);
				break;
				
			case "Date":
				Calendar c = Calendar.getInstance();
				c.setTime((Date) r);
				retObj = ((String) l).concat(String.format("%1$tY-%1$tm-%1$te", c));
				break;
				
			case "Boolean":	
				boolean bVal = (boolean) r;
				if (bVal == true) {
					retObj = ((String) l).concat("true");
				}else if (bVal == false) {
					retObj = ((String) l).concat("false");
				}
				
			}
			break;
			
		case "Date":
			Calendar c = Calendar.getInstance();
			c.setTime((Date) l);
			c.add(Calendar.DATE, (Integer) Integer.valueOf(String.valueOf((Long)r)));
			retObj = (Date) c.getTime();
			break;
		}

		return retObj;
	}

	public Object subObject(Object l, Object r) {
		if (l == null || r == null) {
			return null;
		}

		String lName = getType(l);
		Object retObj = null;

		switch (lName) {
		case "Double":
			retObj = (Double) l - (Double) r;
			break;

		case "Long":
			retObj = (Long) l - (Long) r;
			break;
			
		case "Date":
			Calendar c = Calendar.getInstance();
			c.setTime((Date) l);
			c.add(Calendar.DATE, (Integer) (Integer.valueOf(String.valueOf((Long)r)) * -1));
			retObj = (Date) c.getTime();
		}

		return retObj;
	}
	public Object multObject(Object l, Object r) {
		if (l == null || r == null) {
			return null;
		}

		Object retObj = null;
		String lName = getType(l);

		switch (lName) {
		case "Double":
			retObj = (Double) l * (Double) r;
			break;

		case "Long":
			retObj = (Long) l * (Long) r;
			break;
		}
		
		return retObj;
	}
	
	public Object divObject(Object l, Object r) {
		String lName = getType(l);
		Object retObj = null;

		if (l == null || r == null) {
			return null;
		}

		switch (lName) {
		case "Double":
			retObj = (Double) l / (Double) r;
			break;

		case "Long":
			retObj = (Long) l / (Long) r;
			break;

		}

		return retObj;
	}
	
	public Object modObject(Object l, Object r) {
		String lName = getType(l);
		Object retObj = null;
		
		switch (lName) {
		case "Long":
			retObj =  (Long)l % (Long)r;
			break;
		}
		
		
		return retObj;
	}
	
	public Object getExpression(Object l, String op, Object r) {
		String lName = getType(l);
		if (r == null) return null;
		String rName = getType(r);
		if (lName.equals(rName) == false && "String".compareTo(lName) != 0 && "Date".compareTo(lName) != 0) {
			return null;
		}
		Object retObj = null;
		switch (op) {
		case "+":
			retObj = addObject(l, r);
			break;
		
		case "-":
			retObj = subObject(l, r);
			break;
			
		case "*":
			retObj = multObject(l, r);
			break;
			
		case "/":
			retObj = divObject(l, r);
			break;
			
		case "%":
			retObj = modObject(l, r);
			break;
			
		case "^":
			retObj = exponentObject(l,r);
			break;
		}
		
		return retObj;
	}
	
	public boolean evaluateLogic(boolean lh, String op, boolean rh) {
		boolean retVal = false;
		switch (op) {
		case "&&":
			if (lh == true && rh == true) {
				retVal = true;
			}
			break;
			
		case "||":
			if (lh == true || rh == true) {
				retVal = true;
			}
			break;
			
		case "^^":
			if (lh == true || rh == true) {
				retVal = true;
			}
			if (lh == true && rh == true) {
				retVal = false;
			}
		}
		
		return retVal;
	}
	
	public boolean evaluateExpression(Object lh, String op, Object rh) {
		boolean retVal = false;
		
		switch (op) {
		case "==":
			retVal = equalsObject(lh, rh);
			break;
			
		case "!=":
			retVal = notEqualsObject(lh, rh);
			break;
			
		case "<=":
			retVal = lessThanOrEqualsObject(lh, rh);
			break;
			
		case ">=":
			retVal = greaterThanOrEqualsObject(lh, rh);
			break;
			
		case "<":
			retVal = lessThanObject(lh, rh);
			break;
			
		case ">":
			retVal = greaterThanObject(lh, rh);
			break;
		}
		
		return retVal;
	}
	
	public boolean equalsObject(Object l, Object r) {
		boolean retVal = false;
		String lName = getType(l);
		switch (lName) {
		case "Double":
			double dLeft = (double) l;
			double dRight = (double) r;
			if (dLeft == dRight ) {
				retVal = true;
			}
			break;
			
		case "Long":
			long lLeft = (long) l;
			long rRight = (long) r;
			if (lLeft == rRight ) {
				retVal = true;
			}
			break;
			
		case "Date":
			Date dtLeft = (Date) l;
			Date dtRight = (Date) r;
			
			if (dtLeft.compareTo(dtRight) == 0) {
				retVal = true;
			}
			break;
			
		case "String":
			String sLeft = (String) l;
			String sRight = (String) r;
			
			if (sLeft.compareTo(sRight) == 0) {
				retVal = true;
			}
			break;
			
		case "Boolean":
			boolean bLeft = (boolean) l;
			boolean bRight = (boolean) r;
			if (bLeft == bRight) {
				retVal = true;
			}
			break;
		}
		
		return retVal;
	}

	public boolean notEqualsObject(Object l, Object r) {
		boolean retVal = false;
		String lName = getType(l);
		switch (lName) {
		case "Double":
			double dLeft = (double) l;
			double dRight = (double) r;
			if (dLeft != dRight ) {
				retVal = true;
			}
			break;
			
		case "Long":
			long lLeft = (long) l;
			long lRight = (long) r;
			if (lLeft != lRight ) {
				retVal = true;
			}
			break;
			
		case "Date":
			Date dtLeft = (Date) l;
			Date dtRight = (Date) r;
			if (dtLeft.compareTo(dtRight) !=0) {
				retVal = true;
			}
		case "String":
			String sLeft = (String) l;
			String sRight = (String) r;
			
			if (sLeft.compareTo(sRight) != 0) {
				retVal = true;
			}
			break;
			
		case "Boolean":
			boolean bLeft = (boolean) l;
			boolean bRight = (boolean) r;
			if (bLeft != bRight) {
				retVal = true;
			}
			break;
		}
		
		return retVal;
	}

	public boolean lessThanOrEqualsObject(Object l, Object r) {
		boolean retVal = false;
		String lName = getType(l);
		switch (lName) {
		case "Double":
			double dLeft = (double) l;
			double dRight = (double) r;
			if (dLeft <= dRight ) {
				retVal = true;
			}
			break;
			
		case "Long":
			long lLeft = (long) l;
			long lRight = (long) r;
			if (lLeft <= lRight) {
				retVal = true;
			}
			break;
			
		case "Date":
			Date dtLeft = (Date) l;
			Date dtRight = (Date) r;
			if (dtLeft.compareTo(dtRight) <= 0) {
				retVal = true;
			}
			
		case "String":
			String sLeft = (String) l;
			String sRight = (String) r;
			
			if (sLeft.compareTo(sRight) <= 0) {
				retVal = true;
			}
		}
		
		return retVal;
	}

	public boolean greaterThanOrEqualsObject(Object l, Object r) {
		boolean retVal = false;
		String lName = getType(l);
		switch (lName) {
		case "Double":
			double dLeft = (double) l;
			double dRight = (double) r;
			if (dLeft >= dRight) {
				retVal = true;
			}
			break;
			
		case "Long":
			long lLeft = (long) l;
			long lRight = (long) r;
			if (lLeft >= lRight ) {
				retVal = true;
			}
			break;
			
		case "Date":
			Date dtLeft = (Date) l;
			Date dtRight = (Date) r;
			if (dtLeft.compareTo(dtRight) >= 0) {
				retVal = true;
			}
			
		case "String":
			String sLeft = (String) l;
			String sRight = (String) r;
			
			if (sLeft.compareTo(sRight) >= 0) {
				retVal = true;
			}
}
		
		return retVal;
	}

	public boolean lessThanObject(Object l, Object r) {
		boolean retVal = false;
		String lName = getType(l);
		switch (lName) {
		case "Double":
			double dLeft = (double) l;
			double dRight = (double) r;
			if (dLeft < dRight ) {
				retVal = true;
			}
			break;
			
		case "Long":
			long lLeft = (long) l;
			long lRight = (long) r;
			if (lLeft < lRight ) {
				retVal = true;
			}
			break;
			
		case "Date":
			Date dtLeft = (Date) l;
			Date dtRight = (Date) r;
			if (dtLeft.compareTo(dtRight) < 0) {
				retVal = true;
			}
			
		case "String":
			String sLeft = (String) l;
			String sRight = (String) r;
			
			if (sLeft.compareTo(sRight) < 0) {
				retVal = true;
			}
		}
		
		return retVal;
	}

	public boolean greaterThanObject(Object l, Object r) {
		boolean retVal = false;
		String lName = getType(l);
		switch (lName) {
		case "Double":
			double dLeft = (double) l;
			double dRight = (double) r;
			if (dLeft > dRight ) {
				retVal = true;
			}
			break;
			
		case "Long":
			long lLeft = (long) l;
			long lRight = (long) r;
			if (lLeft > lRight ) {
				retVal = true;
			}
			break;
					
		case "Date":
			Date dtLeft = (Date) l;
			Date dtRight = (Date) r;
			if (dtLeft.compareTo(dtRight) > 0) {
				retVal = true;
			}
			
		case "String":
			String sLeft = (String) l;
			String sRight = (String) r;
			
			if (sLeft.compareTo(sRight) > 0) {
				retVal = true;
			}
		}
		
		return retVal;
	}
	
	public String getType(Object obj) {
		
		return obj.getClass().getSimpleName();
	}

}
