package cn.mldn.first.util;

/**
 * 数学计算类
 * @author mldn
 *
 */
public class MathUtil {
	private MathUtil() {}
	/**
	 * 加法操作
	 * @param args 计算参数
	 * @return 累加结果
	 */
	public static int add(int ... args) {
		int sum = 0 ;
		for (int temp : args) {
			sum += temp ;
		}
		return sum ;
	}
} 
