package com.edifixio.amine.testBean;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FacetsBean{

public static void main (String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
	Class<?> c=Class.forName("java.util.HashMap");
	Object o=c.newInstance();
	Method m=c.getMethod("put", Object.class,Object.class);
	m.invoke(o,(Object) "toto",(Object) "toto");
	System.out.println(o);
	
}
}
