###20.01_IO流(IO流概述及其分类)
* 1.概念
	* IO流用来处理设备之间的数据传输
	* Java对数据的操作是通过流的方式
	* Java用于操作流的类都在IO包中
	* 流按流向分为两种：输入流，输出流。
	* 流按操作类型分为两种：
		* 字节流 : 字节流可以操作任何数据,因为在计算机中任何数据都是以字节的形式存储的
		* 字符流 : 字符流只能操作纯字符数据，比较方便。
* 2.IO流常用父类
	* 字节流的抽象父类：
		* InputStream （只要是Stream就是字节流）
		* OutputStream
	* 字符流的抽象父类：
		* Reader 字符输入流（Reader和writer是字符流）
		* Writer 字符输出流
* 3.IO程序书写
	* 使用前，导入IO包中的类
	* 使用时，进行IO异常处理
	* 使用后，释放资源

###20.02_IO流(FileInputStream)
* read()一次读取一个字节,每read一次相当于指针向后面移了一位。如果出现-1了那么说明文件读完了。-1是文件的结束标记,也就是一个文件的结束条件
* 
		FileInputStream fis = new FileInputStream("aaa.txt");	//创建一个文件输入流对象,并关联aaa.txt
		int b;													//定义变量,记录每次读到的字节
		while((b = fis.read()) != -1) {							//将每次读到的字节赋值给b并判断是否是-1
			System.out.println(b);								//打印每一个字节
		}
		
		fis.close();											//关闭流释放资源
###20.03_IO流(read()方法返回值为什么是int)
* read()方法读取的是一个字节,为什么返回是int,而不是byte
* 
		因为字节输入流可以操作任意类型的文件,比如图片音频等,这些文件底层都是以二进制形式的存储的,如果每次读取都返回byte,有可能在读到中间的时候遇到111111111
		那么这11111111是byte类型的-1,我们的程序是遇到-1就会停止不读了,后面的数据就读不到了,所以在读取的时候用int类型接收,如果11111111会在其前面补上
		24个0凑足4个字节（00000000 00000000 00000000 11111111）,那么byte类型的-1就变成int类型的255了这样可以保证整个数据读完,而结束标记的-1就是int类型（就不用补24个0了)。
		当write的时候他会保证数据的原样性,会把多余的0砍掉也就是11111111
		* 为什么read返回一个字节用int而不用byte？
		 * 1:会报错,因为int赋值给byte会损失精度
		 * 2:因为FileInputStream是字节流读取,可以读取任何文件.音频视频但是必须要有结束标记-1
		 * 如果返回的是byte每次读取都是一个8位   00001111 00000000 11111111当到11111111时会错误
		 * 11111111就是一个byte类型的-1
		 * 10000001是byte类型-1的原码,运算时以补码运算
		 * 11111110 -1的反码
		 * 11111111 是-1的补码那样子的话11111111就是-1那么会默认读完了没办法继续
###20.04_IO流(FileOutputStream)
* write()一次写出一个字节
* 
		FileOutputStream fos = new FileOutputStream("bbb.txt");	//如果没有bbb.txt,会创建出一个
		//fos.write(97);						//虽然写出的是一个int数,但是在写出的时候会将前面的24个0去掉,所以写出的一个byte
		fos.write(98);
		fos.write(99);
		fos.close();
###20.05_IO流(FileOutputStream追加)
* A:案例演示
	* FileOutputStream的构造方法写出数据如何实现数据的追加写入
		FileOutputStream fos = new FileOutputStream("bbb.txt",true);	//如果没有bbb.txt,会创建出一个FileOutputStream(File file, boolean append)
		//fos.write(97);						//虽然写出的是一个int数,但是在写出的时候会将前面的24个0去掉,所以写出的一个byte
		fos.write(98);
		fos.write(99);
		fos.close();

###20.06_IO流(拷贝图片)
* FileInputStream读取
* FileOutputStream写出

		FileInputStream fis = new FileInputStream("致青春.mp3");	//创建输入流对象,关联致青春.mp3
		FileOutputStream fos = new FileOutputStream("copy.mp3");//创建输出流对象,关联copy.mp3
		
		int b;
		while((b = fis.read()) != -1) {
			fos.write(b);
		}
		
		fis.close();
		fos.close();
		

###20.07_IO流(拷贝音频文件画原理图)
* A:案例演示
	* 字节流一次读写一个字节复制音频
* 弊端:效率太低

###20.08_IO流(字节数组拷贝之available()方法)
available()方法可以获取读取那个文件的所有字节个数
* A:案例演示
	* int read(byte[] b):一次读取一个字节数组
	* write(byte[] b):一次写出一个字节数组
	* available()获取读的文件所有的字节个数
* 弊端:有可能会内存溢出 
	
		FileInputStream fis = new FileInputStream("致青春.mp3");
		FileOutputStream fos = new FileOutputStream("copy.mp3");
		byte[] arr = new byte[fis.available()];					//根据文件大小做一个字节数组
		fis.read(arr);											//将文件上的所有字节读取到数组中
		fos.write(arr);											//将数组中的所有字节一次写到了文件上
		fis.close();
		fos.close();
		
###20.09_IO流(定义小数组)
* write(byte[] b)
* write(byte[] b, int off, int len)写出有效的字节个数

		
###20.10_IO流(定义小数组的标准格式)小数组要是1024的整数倍
* A:案例演示
	* 字节流一次读写一个字节数组复制图片和视频
		FileInputStream fis = new FileInputStream("致青春.mp3");
		FileOutputStream fos = new FileOutputStream("copy.mp3");
		int len;
		byte[] arr = new byte[1024 * 8];					//自定义字节数组
		
		while((len = fis.read(arr)) != -1) {
			//fos.write(arr);
			fos.write(arr, 0, len);							//写出字节数组写出有效个字节个数
		}
		
		fis.close();
		fos.close();
###20.11_IO流(BufferedInputStream和BufferOutputStream拷贝)
* A:缓冲思想
	* 字节流一次读写一个数组的速度明显比一次读写一个字节的速度快很多，
	* 这是加入了数组这样的缓冲区效果，java本身在设计的时候，
	* 也考虑到了这样的设计思想(装饰设计模式后面讲解)，所以提供了字节缓冲区流
* B.BufferedInputStream
	* BufferedInputStream内置了一个缓冲区(数组)
	* 从BufferedInputStream中读取一个字节时
	* BufferedInputStream会一次性从文件中读取8192个, 存在缓冲区中, 返回给程序一个（也就是放满了8192个然后read在把这8192个放到了buffer中放满了在放到输出流）
	这8192期间是在内存中数据比一个一个从硬盘上拿快很多
	* 程序再次读取时, 就不用找文件了, 直接从缓冲区中获取
	* 直到缓冲区中所有的都被使用过, 才重新从文件中读取8192个
	**************************************************************************************************************
	这样子就能够减少到硬盘读的次数,通过输入流一次性读8192个字节到BufferedInputStream内置了的缓冲区中,写的时候也是通过输出流一次性写给硬盘。
	只要降低要硬盘的读写次数就能够提高效率
	**************************************************************************************************************
* C.BufferedOutputStream
	* BufferedOutputStream也内置了一个缓冲区(数组)
	* 程序向流中写出字节时, 不会直接写到文件, 先写到缓冲区中
	* 直到缓冲区写满, BufferedOutputStream才会把缓冲区中的数据一次性写到文件里
* D.拷贝的代码 

		FileInputStream fis = new FileInputStream("致青春.mp3");			//创建文件输入流对象,关联致青春.mp3
		BufferedInputStream bis = new BufferedInputStream(fis);			//创建缓冲区对fis装饰
		FileOutputStream fos = new FileOutputStream("copy.mp3");		//创建输出流对象,关联copy.mp3
		BufferedOutputStream bos = new BufferedOutputStream(fos);		//创建缓冲区对fos装饰
		
		int b;
		while((b = bis.read()) != -1) {		
			bos.write(b);
		}
		
		bis.close();						//只关装饰后的对象即可（包装后的),不用相当于一个人他化妆了你把化妆时候的他干掉了是不是就是把他干掉了，不用考虑没化妆的了
		bos.close();
	 
* E.小数组的读写和带Buffered的读取哪个更快?
	* 定义小数组如果是8192个字节大小和Buffered比较的话
	* 定义小数组会略胜一筹,因为读和写操作的是同一个数组,小数组是读的时候把8192个字节读到数组中,写的时候是将这个数组写给硬盘
	* 而Buffered操作的是两个数组，一个输入的一个输出的
	* 开发中这两种都行

###20.12_IO流(flush和close方法的区别)
* flush()方法
	* 用来刷新缓冲区的,刷新后可以再次写出 
* close()方法
	* 用来关闭流释放资源的的,如果是带缓冲区（Buffere）的流对象的close()方法,不但会关闭流,
	还会再关闭流之前刷新缓冲区,将缓冲区的字节全部都刷新到文件上（要是没有close缓冲区的自己可能不会放到问件上可能发生丢失）,关闭后不能再写出 
 ****************************************************************
 1：正常情况下有close就不需要flush()方法了,因为从最后close也会刷新缓冲区,但是想要实时更新就得用flush（）
 2：flush方法的作用:能够实时刷新的目的可以用到,比如QQ聊天,聊天的内容肯定先写到缓冲区中,边辽边能看到,并不是非得到8192个字节才传
 ****************************************************************
###20.13_IO流(字节流读写中文) 
* 字节流读取中文的问题
	* 字节流在读中文的时候有可能会读到半个中文,造成乱码 
* 字节流写出中文的问题
	* 字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组 
	* 写出回车换行 write("\r\n".getBytes());

###20.14_IO流(流的标准处理异常代码1.6版本及其以前)
* try finally嵌套

		FileInputStrea m fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("aaa.txt");
			fos = new FileOutputStream("bbb.txt");
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		} finally {
			try {
				if(fis != null)
					fis.close();
			}finally {
				if(fos != null)
					fos.close();
			}
		}

###20.15_IO流(流的标准处理异常代码1.7版本)
* try close

		try(
			FileInputStream fis = new FileInputStream("aaa.txt");
			FileOutputStream fos = new FileOutputStream("bbb.txt");
			MyClose mc = new MyClose();
		){
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}
* 原理
	* 在try()中创建的流对象必须实现了AutoCloseable这个接口,如果实现了,在try后面的{}(读写代码)执行后就会自动调用,流对象的close方法将流关掉 
	只要实现了这个接口,就会自动调用close()方法。
###20.16_IO流(图片加密)
* 给图片加密,一个数被另外一个数异或两次就是本身

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.jpg"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b ^ 123);
		}
		
		bis.close();
		bos.close();

###20.17_IO流(拷贝文件)
* 在控制台录入文件的路径,将文件拷贝到当前项目下

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件路径");
		String line = sc.nextLine();				//将键盘录入的文件路径存储在line中
		File file = new File(line);					//封装成File对象
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file.getName());
		
		int len;
		byte[] arr = new byte[8192];				//定义缓冲区
		while((len = fis.read(arr)) != -1) {
			fos.write(arr,0,len);
		}
		
		fis.close();
		fos.close();

###20.18_IO流(录入数据拷贝到文件)
* 将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到quit时就退出

		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("text.txt");
		System.out.println("请输入:");
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line))
				break;
			fos.write(line.getBytes());
			fos.write("\r\n".getBytes());
		}
		
		fos.close();
###20.19_day20总结
* 把今天的知识点总结一遍。