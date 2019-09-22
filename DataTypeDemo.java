/*
数据类型
一、Java是一种强类型的语言
	强类型表示，变量在定义的时候必须显式的申明类型是什么（强类型的语言如：C、C++、Java）。
	弱类型表示，变量会根据值自己去推断，不需要指定类型是什么（弱类型的语言如：JavaScript、Python、Scala）。
二、Java数据类型
	1. 基本数据类型（4种8类）
		（1）整数类型：byte、short、int、long（不同类型表示不同的长度）
			byte：	使用一个字节存储，因此范围是 -128~127	
			short：	使用两个字节存储，因此范围是 -32768~32767
			int：	使用四个字节存储，因此范围是 正21亿 ~ 负21亿-1
			long：	使用八个字节存储，因此范围是.....long类必须在数字最后加L，否则会被编译为int类型。
			注意：
				1. 在使用整型类型的时候，默认都是int类型。
				2. 如果需要使用long类型的话，必须要在数字的后面添加L，建议使用大写，小写容易被误认为1。
		（2）浮点类型：float、double（浮点类型有两表数方式：1.使用小数点；2.使用科学计数法。）
			float：单精度，精度可以精确到小数点后7位。
			double：双精度，精度是float的双倍。
			备注：
				1. 默认浮点类型是double类型。
				2. 使用float的时候，数字后要添加f / F。
				3. 浮点类型并不能表示一个精确的值，会损失一定的精度。
		（3）字符类型：char（字符串String）
			字符：	占用两字节，使用的时候使用''表示。
			字符串：使用的时候使用""表示。
		（4）布尔类型：boolean
			只有true和false两种值，在存储的时候占1位。
	2. 引用数据类型
		（1）类
		（2）接口
		（3）数组
*/

public class DataTypeDemo{
		
	public static void main(String[] args){
		
		//byte：使用一个字节存储，因此范围是 -128~127
		//byte b = 127;	//错误: 不兼容的类型: 从int转换到byte可能会有损失 byte b = 128;
		
		//short：使用两个字节存储，因此范围是 -32768~32767
		//short s = 44444;	//错误: 不兼容的类型: 从int转换到short可能会有损失 short s = 44444;
		
		//int：使用四个字节存储，因此范围是 正21亿 ~ 负21亿-1
		//int i = 1111111111111;	//错误: 整数太大 int i = 1111111111111;
		
		//long：使用八个字节存储，因此范围是.....long类必须在数字最后加L，否则会被编译为int类型。
		//long l = 1111111111111;	//错误: 整数太大 long l = 1111111111111;
		
		//float f1 = 3.14159;	// 错误: 不兼容的类型: 从double转换到float可能会有损失 float f1 = 3.14159;
		//float f2 = 3.14159;	// 错误: 不兼容的类型: 从double转换到float可能会有损失 float f1 = 3.14159;
		
		float f1 = 3.143245234f;	// 错误: 不兼容的类型: 从double转换到float可能会有损失 float f1 = 3.14159;
		float f2 = 3.14324523443f;	// 错误: 不兼容的类型: 从double转换到float可能会有损失 float f1 = 3.14159;
		System.out.println( f1 == f2 );	//变量f1和f2的值不同，但是打印结果为true。浮点类型并不能表示一个精确的值，会损失一定的精度。
			
		//表示一个字符
		char c = 'A';
		//表示一个字符串，表好似一个字符序列
		String s = "A";
		System.out.println( c == 65 );	//打印：true，因为字符'A'的Unicode编码为65
		
		// 转移字符\n，含义是换行
		char n = '\n';
		System.out.println( "abcd" + n + "efgh" );	// 转移字符\n，含义是换行
	}
}