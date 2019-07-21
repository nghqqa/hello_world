package xuexi;

import java.util.Scanner;
public class testscanner {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入名字：");
		String name=scanner.nextLine();
		System.out.println("请输入你的爱好：");
		String favor=scanner.nextLine();
		System.out.println("请输入你的年龄：");
		int age =scanner.nextInt();
		
		
		System.out.println("#####################");
		System.out.println(name);
		System.out.println(favor);
		System.out.println("来到人间的天数"+age*365);
		System.out.println("离开人间的天数"+(72-age)*365);
	}

}
