/*
标识符命名规范
	硬性规定：
		1. 必须以字母，下划线 "_" 或美元符号 "$" 开头。
		2. 不能以数字或其他字符开头。
		3. 其他部分可以是字母、数字、下划线"_"、美元符号"$"和数字的任意组合。
		4. 大小写敏感，区分大小写。
		5. 长度无限制。
		6. 不能是Java的关键字(关键字也称作保留字，是留给系统使用的表示特殊含义的字符串，如：public、class、int、void....等等)。
	常规建议：
		1. 驼峰标识。
			（1）类名、接口名称在命名的时候首字母大写。
			（2）变量、方法命名的时候首字母小写。
			（3）多个单词拼接表示一个标识符的时候，每个单词的首字符都大写。
		2. 见名知义：通过标识符的名称能知道代表的含义（千万不要写拼音！）。
	其他注意事项：
		1. Java不采用通常语言使用的ASCII字符集。
		2. Java采用unicode这样的标准的国际字符集。因此，这里的字母的含义包含：英文、汉字等等。（不建议大家使用汉字来定义标识符！）
	举例：
		1. 符合规范的标识符：name、Name、user_name、$name、_name、publicName。
		2. 不符合规范的标识符：9username、user name、public
*/

public class IdentifiedDemo{
	public static void main(String[] args){
			int _a = 10;	//标识符必须以字母，下划线 "_" 或美元符号 "$" 开头。
			int $b = 20;	//标识符必须以字母，下划线 "_" 或美元符号 "$" 开头。
			int c = 30;		//标识符必须以字母，下划线 "_" 或美元符号 "$" 开头。
			//int d + e = 40;	//编译错误：错误: 需要';' int d + e = 40;
			int a = 10;
			//int public = 20;	//编译错误： 错误: 需要class, interface或enum}^
			int getValueById = 12;	//驼峰标识，变量、方法命名的时候首字母小写。
	}	
}