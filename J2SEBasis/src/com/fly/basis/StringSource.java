package com.fly.basis;

import java.nio.charset.Charset;

public class StringSource {
	public static void main(String[] args) throws Exception {
		/**
		 * 初始化一个新创建的字符串对象代表一个空的字符序列，使用这个构造器是不必要的因为字符是不变的
		 */
		String s1 = new String();

		/**
		 * 初始化一个新创建的字符串对象代表一个和参数相同的字符串序列；换句话说，这个新创建的字符串对象是参数字符串的拷贝
		 * 除非明确需要对原型进行拷贝，使用这个构造器是不必要的因为字符是不变的
		 */
		String s2 = new String("123");

		/**
		 * 分配一个新的字符串，以便它代表当前包含在字符数组参数的字符序列。 
		 * 这个字符数组的内容被拷贝； 后来对字符数组进行的修正不会影响到新创建的字符串
		 */
		char[] c = new char[] { '1', '2', '3', '4' };
		String s3 = new String(c);

		/**
		 * 分配一个新的字符串，以便它代表当前包含在子字符数组参数的字符序列。 
		 * 第二个参数表示子字符数组的第一个字节，第三个参数表示子字节数组的长度。
		 * 这个字符数组的内容被拷贝； 后来对字符数组进行的修正不会影响到新创建的字符串
		 */
		String s4 = new String(c, 0, c.length);

		/**
		 * 分配一个新的字符串，以便它代表当前包含在子整形数组参数的字节序列。 
		 * 第二个参数表示子整形数组的第一个字节，第三个参数表示子整形数组的长度。
		 * 这个整形数组的内容被拷贝； 后来对整形数组进行的修正不会影响到新创建的字符串
		 */
		int[] i = new int[] { 1, 2, 3, 4 };
		String s5 = new String(i, 0, i.length);

		/**
		 * 用于字符串的转码，通过使用指定的字符集解码指定的子字节数组构建一个新的字符串。
		 * 新的字符串长度是字符集的函数，可能和原来的字节数组长度不相等。
		 * 当给定字节在给定的字符集中无效时，该构造函数的行为是未指定的。
		 * 当需要对解码过程进行更多控制时，使用java.nio.charset.CharsetDecoder类
		 */
		byte[] b = new byte[] { (byte) 00010110, (byte) 123456 };
		String s6 = new String(b, 0, b.length, "utf-8");

		/**
		 * 通过使用指定的字符集解码指定的字节数组构造一个字符串。 
		 * 新的字符串长度是字符集的函数，可能和原来的字节数组长度不相等。
		 * 这个函数经常用来替换畸形的输入和不可用图表示的字符序列，使用默认的字符集替换字符串。
		 * 当需要对解码过程进行更多控制时，使用java.nio.charset.CharsetDecoder类
		 */
		String s7 = new String(b, 0, b.length, Charset.defaultCharset());

		/**
		 * 用于字符串的转码，通过使用指定的字符集解码指定的子字节数组构建一个新的字符串。 
		 * 新的字符串长度是字符集的函数，可能和原来的字节数组长度不相等。
		 * 当给定字节在给定的字符集中无效时，该构造函数的行为是未指定的。
		 * 当需要对解码过程进行更多控制时，使用java.nio.charset.CharsetDecoder类
		 */
		String s8 = new String(b, "utf-8");
		
		/**
		 * 通过使用指定的字符集解码指定的字节数组构造一个字符串。 
		 * 新的字符串长度是字符集的函数，可能和原来的字节数组长度不相等。
		 * 这个函数经常用来替换畸形的输入和不可用图表示的字符序列，使用默认的字符集替换字符串。
		 * 当需要对解码过程进行更多控制时，使用java.nio.charset.CharsetDecoder类
		 */
		String s9 = new String(b, Charset.defaultCharset());
		
		/**
		 * 分配一个新的字符串包含当前字符串缓冲参数中包含的字符序列。
		 * 是对字符串缓冲的拷贝；之后对字符串缓冲的任何修改都不会影响到新构建的字符串
		 */
		StringBuffer sb = new StringBuffer("123456");
		String s10 = new String(sb);
		
		/**
		 * 分配一个新的字符串包含当前字符串构建参数中包含的字符序列。
		 * 是对字符串构建的拷贝；之后对字符串构建的任何修改都不会影响到新构建的字符串。
		 * 
		 * 这个构造函数提供了一个对StringBuilder的简化迁移，从StringBuilder的渠道toString()方法，
		 * 可能更快，通常更优先
		 */
		StringBuilder sBuilder = new StringBuilder("123456");
		String s11 = new String(sBuilder);
		
		/**
		 * 返回在指定索引的字符值，索引的范围从0到长度-1，第一个字符序列是索引为0的值，以此类推。
		 * 如果在指定索引是一个代替，返回代替的值
		 */
		char ch = s11.charAt(0);
		
		/**
		 * 返回在指定索引的字符（Unicode值），索引表示字符值（Unicode代码单元）和范围。
		 * 其中高代理和低代理的知识之后再补上
		 */
		s11.codePointAt(0);
		/**
		 * 返回在指定的前一个索引的字符（Unicode值），范围从1到长度-1索引表示字符值（Unicode代码单元）和范围。
		 * 其中高代理和低代理的知识之后再补上
		 */
		s11.codePointBefore(1);
		
		/**
		 * 将字符串拷贝到字符数组中
		 */
		char[] cha = new char[10];
		s11.getChars(0, 3, cha, 0);
		/**
		 * 使用命名的字符集编码字符串到一个字节数组序列，储存一个结果在新的字节数组中
		 */
		byte[] bt = s11.getBytes("utf-8");
		
		/**
		 * 比较字符串和指定的StringBuffer，结果为true仅仅表示它和指定的StringBuffer有相同的字符序列，
		 * 这个方法在StringBuffer中是同步的
		 */
		s11.contentEquals(sb);
		
		/**
		 * 比较两个字符串忽略大小写
		 */
		s11.equalsIgnoreCase(s10);
		
		/**
		 * 比较两个字符串的字母顺序。比较是基于字符串中的每一个字符的Unicode值，字母顺序领先则值小。
		 * 当前字符串代表的字符序列和参数代表的字符序列的字符顺序进行比较，如果字符串的字母顺序领先参数的字母顺序结果是负整数，
		 * 如果字符串的字母顺序落后于参数的字母顺序结果是整数，如果字母顺序相等则结果为0。
		 * 当两个字符串通过equals方法比较相等时结果确定为0
		 */
		s11.compareTo("2");
		
		/**
		 * 比较两个字符串忽略大小写
		 */
		s11.compareToIgnoreCase("AS");
		/**
		 * 比较两个字符串在指定的区域相等
		 */
		s11.regionMatches(2, "3456", 0, 4);
		/**
		 * 忽略大小写比较两个字符串在指定的区域相等
		 */
		s11.regionMatches(true,2, "3456", 0, 4);
		/**
		 * 测试字符串在指定的索引位置处以指定的字符串开始
		 */
		s11.startsWith("23", 1);
		/**
		 * 测试字符串是否以指定的字符串开始
		 */
		s11.startsWith("2");
		/**
		 * 测试字符串以指定的字符串结束
		 */
		s11.endsWith("6");
		
	}
}
