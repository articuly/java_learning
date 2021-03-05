package my;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* AfConsole 控制台输入工具类 
 * 
 * 仅用于入门学习，会用即可
 * 真正的项目不会使用控制台界面输入的，后面将引入GUI图形界面
 * 
 * 注：初学者请勿研究本类的代码实现 ！好奇害死猫 ！
 * 
 * 注： Java自带的Scanner类存在缺陷， 想了解的话可以参考本节课网盘下的说明文档。《Scanner用法简介》
 * 
 */
public class AfConsole
{	
	BufferedReader reader; 

	public AfConsole()
	{		
		InputStreamReader m = new InputStreamReader(System.in);
		reader = new BufferedReader(m);
	}
	
	// 输出显示一个字符串
	public void print(String s)
	{
		System.out.print(s);
	}
	// 输出显示一个字符串（并换行)
	public void println(String s)
	{
		System.out.println(s);
	}
	
	// 从控制台读取用户输入：读取一个字符串
	//     如果用户直接按了回车，则返回默认值。
	public String readString(String defValue)
	{
		try {
			String s = reader.readLine();
			if(s.trim().length() == 0)
			{
				return defValue;
			}
			return s;
		}catch(Exception e)
		{
			return defValue;
		}
		
	}
	
	// 从控制台读取用户输入：读取一个整数
	//     如果用户直接按了回车，则返回默认值。
	public int readInt(int defValue)
	{
		try {
			String s = readString(null);
			return Integer.valueOf( s );
		}catch(Exception e)
		{
			return defValue;
		}
	}
	
}
