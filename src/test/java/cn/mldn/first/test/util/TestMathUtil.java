package cn.mldn.first.test.util;

import org.junit.Test; 

import cn.mldn.first.util.MathUtil;
import junit.framework.TestCase; 

public class TestMathUtil {   
	@Test  
	public void testAdd() {
		TestCase.assertEquals(MathUtil.add(10, 20, 30), 50);
	}  
}
