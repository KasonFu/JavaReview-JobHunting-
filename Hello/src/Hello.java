import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Hello {

	
	
	public static boolean isprime(int n)
	{
			boolean isprime=true;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					isprime = false;
					break;
				}
			}
			return isprime;
	}	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello  World");
//		Scanner in = new Scanner(System.in);
//		System.out.println((int)in.nextDouble());
		
		
//		
		Scanner in = new Scanner(System.in);
//		int x = in.nextInt();
//		int z = in.nextInt();
//		int y = in.nextInt();
//		int max;
//		if(x>=y)
//			max = x;
//		else
//			max = y;
//		if(max<=z)
//			max = z;
//		System.out.println(max);
		
		
		
		
//		Scanner in = new Scanner(System.in);
//		int number = (int)(Math.random()*100 + 1);
//		int count = 0;
//		int user;
//		do
//		{
//			user = in.nextInt();
//			if(user>number)
//				System.out.println("Too large");
//			else if(user<number)
//				System.out.println("Too small");
//			count++;
//		}while(user!=number);
//		System.out.println("Congratulations! Your total guess "+count+" times.");
		
		
		
//		Scanner in = new Scanner(System.in);
//		int number = in.nextInt();
//		int amount = 0;
//		int count = 0;
//		do
//		{
//			amount = amount * 10 + number%10;
//			number = number/10;
//		}while(number>0);
//		System.out.println(amount);
		
		
		
//		int n = in.nextInt();
//		int result = 1;
//		for(;n>0;n--)
//		{
//			result = result * n;
//		}
//		System.out.println(result);
		
		
			

		
		
//		int count = 0;
//		int[] a= new int[50];
//		for(int n=2;count<50;n++)
//		{
//			boolean isprime = true;
//			for(int i=2; i<n; i++)
//			{
//				if(n%i==0)
//				{
//					isprime = false;
//					break;
//				}
//			}
//			if(isprime == true)
//			{
//				a[count] = n;
//				count++;
//			}
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}

		
		
		
//		int n=in.nextInt();
//		Out:
//		for(int one=0; one<n+1; one++)
//		{
//			for(int five=0; five<n/5+1; five++)
//			{
//				for(int ten=0; ten<n/10+1; ten++)
//				{
//					if(one + 5*five + 10*ten == n)
//					{
//						System.out.println("one dollar: "+one+", five dollar: "+five+", ten dollar: "+ten);
//						break Out;
//					}
//				}
//			}
//		}
		
		
//		int n = in.nextInt();
//		System.out.println(isprime(n));
		
		int a[] = {9,8,7,6,5,4,3,2,1,0};
		System.out.println(a.length);
		
	}

}

//Shift+上下键 可以选择多行，
//Alt+/是注释
//final int 定义固定值，无法改变
//int->float sample: 12/5->12/5.0 or a = (int)a
//随机数 Math.random() 指的是[0,1)。 Math.round()四舍五入。Math.pow(2,3)几的几次方。
//给指定for循环名字为Out，那么break Out;就可以跳出指定的名为Out的循环
//System.out.printf("%.2f",sum)保留两位小数
//数组 int[] array = new int[100];个数必须给出，但可以是变量。array.length 或者 int[] score={1,2,3,4,5,6}
//多维数组 int[][] a = new int[3][5]
//\t是行之间对齐，\n换行
//比较字符串， input.equals("ddd");
//函数参数都是值传递


//Class
//Constrctor构造函数，与类名相同，不能有返回值，可以有参数。
//每一个java文件里只能有一个public class，且必须与java名一样
//Import是引用其他Package里的文件或者class
//Static 变量是class本身的，不是某个object的。
//List用法 List list = new ArrayList(); list.add(所有object类)
//ArrayList<String>一种可以无限大小的数组。 Private ArrayList<String> notes = new ArrayList<String>();
//ArrayList的方法： notes.add()/.size()/.get(index)/.remove(index)
//ArrayList与HashSet都是容器，但是HashSet是集合，不能有重复元素且无序。
//public String toString(){return ..}可以直接输出class的object。
//Hash表是用于一对一的那些情况下优雅的搜索方法，详情看HashMap/Coins.java
//Hashmap.getOrDefault(k,v) or .values()得到所有value的数列, or put(k,v)
//Hashmap里有entryset方法，是用来提取每一条entry信息（key+value）
/*
 * Set<Integer,String> entrySet = map.entryset();
 * for(Entry<Integer,String> entry: entrySet)
 * {
 * 		Syste.out..print("key"+entry.getKey());
 * 		System.out.print("Value"+entry.getValue());
 * }
 * 每一条entry的类型为Map.entry<Integer,Integer> entry;就像int a一样
 */
//Hashset与数组一样，但是可以查找是否contain某个key
//Constructor可以在ToolBar的Source里帮助创造。
//Protected关键字 可以保证子类能使用父类的属性， 其他类不可见。
//不管用不用Super();子类初始化的时候都先找父类的constructor
//Cast造型，只能向上造型，只能将子类赋给父类，例如Car c = new Car(); Vechile v = c;
//override指的是子类与父类间相同名字和形参的方法


/*StringBuffer sb = new StringBuffer();
	if(...)
	sb.append("...")
	if(...)
	sb.append("...")	
	if(...)
	sb.append("...")
	return sb.toString();
*/

//抽象类不能产生对象，只能让子类产生对象，例如Shape，public abstract class Shape{}抽象方法没有括号，但子类必须override抽象函数。


//String->int  String.valueOf(int) String.subString(startindex,endindex)
//char[] -> String: char[] c = {}; String s = String.valueOf(c);
//Character.toUpperCase()将字符变为大写。
//关于Array的clone方法 int[] a = b.clone();

//左移一位n <<= 1;相当于乘2，右移相当于除以2.
//链表LinkedList,例如1->4->5->9，里面的每一个对象成为节点Node，第一个节点为链表头
//链表的遍历， Monkey node = m1;while(node!=null){node=node.next;}

//Stack栈 LIFO一般用于DFS， Queue队列 FIFO一般用于BFS
//初始化队列Queue<TreeNode> q = new LinkedList<>();
//q.poll()拿出最旧的值，q.offer(TreeNode a)添加值
//完全二叉树就是将节点按顺序拍下去，不跳着排
//二叉堆(heap)就是每一个根节点都要比他的子节点大。
//泛型表示方法
/*
 * class BinaryHeap<T>{
	ArrayList<T> list = new ArrayList<T>();}
*/	

//PriorityQueue<类型> q = new PriorityQueue<类型>();默认为head为最小
//PriorityQueue优先级队列，堆的主要实现方式，priorityqueue is a sorted queue.
//设定Comparator 是用来定义两个陌生类型的比较方法，例如

/*
	new Comparator<ListNode>(){
			public int compare(ListNode a, ListNode b) {
				return a.val-b.val;
			}
*/

//q.poll()拿出最小值并重新排序,q.size(),q.add()添加并排序


//图的定义是每两个点之间都可以有单向路
//邻接矩阵就是将图中每个节点与其他节点有无路线，用0和1标记在一张n*n的表上，适合路多的图
//邻接表是将每个节点化为ListNode存放在数组里，然后每一个Node记录自己可以通往的其他节点，适合节点多路少的图




/*	Spring框架
	Spring是一个容器框架，可以配置各种bean，并维护bean与bean之间的关系，getbean()就可以获取对象
	IOC (inverse of control)控制反转:把创建对象(bean)，和维护对象的权利从程序转移到spring的容器(applicationContext.xml),
	程序不再需要创建维护对象，全由spring创建且维护
	DI (Dependecy Injection)依赖注入，bean之间存在互相依赖的关系，更准确表示spring的核心技术
	
	借套用其他bean的方法<property name="b" ref="byeService"/>  	
	<list>
		<ref bean="employee1"/>
		<ref bean="employee2"/>
	</list>
	<bean id="" scope="">这里scope可以写singleton或者prototype，默认singleton
	singleton指的是不管你实例化多少次，你都只创建了一个对象，对象地址不变
	prototype指你每次创建对象，都是新的对象，你可以创建无数个此类的对象
	
	bean的生命周期 
	1.实例化beans.xml开始，前提是scope=singleton,将bean实例化到内存中
	2.class implements BeanNameAware,可以得到父方法setBeanName(arg0)，得到每一个正在被创建的beanid
	3.创建一个类继承BeanPostProcessor接口，然后配置这个类的bean，作用为：在每一个bean被创建时可以操作每一个bean。
	这就是AOP(Aspects Oriented Programming)编程，面向切片编程，可以在一个对象里控制所有的对象。就像一个门一样，所有bean被创建时都会过这个门，然后执行门的方法
	beforeProcessor
	4.bean里面还可以有一个属性为<bean init-method="myinit名字">，此方法放在对象的class定义里面
	5.afterProcessor
	6.自定义销毁容器方法<bean destroy-method="mydestroy名字">，用来释放资源，关闭容器，这是最后一个被调用的函数
	
	
	在bean中注入数组的方式
	<property name="EmpNameArray">
		<list>
			<value>Kason</value>
			<value>Allen</value>
		</list>
	</property>
	
	注入Emplist
	<property name="Emplist">
	<list>
		<ref bean="employee1"/>
		<ref bean="employee2"/>
	</list>
	</property>
	
	注入Empmap
	<property name="Empmap">
	<map>
		<entry key="1" value-ref="employee1" />
		<entry key="2" value-ref="employee2" />
	</map>
</property>
</bean>



	如果要创建一个bean继承其他bean，就在bean里写一个parent，例如：
	<bean id="graduate" parent="student" class="com.inherit.Graduate">
	<property name="degree" value="bachelor"></property>
	</bean>
	
	空注值
	<property name="name">
	<null/>
	</property>
	
	通过类的构造函数constructor来注入bean,在java1.8上不可用
	
	自动装配autowire
	<bean id="dog" class="com.autowire.Dog">
	<property name="name" value="Allen" />
	<property name="age" value="25" />
	</bean>
	<bean id="owner" class="com.autowire.Owner" autowire="byName">
		<property name="name" value="Kason" />
	</bean>
	
	因为Owner类中有个属性类为Dog名字为dog，且autowire是byname，所以自动装配将beans中id=dog的bean配给Owner的dog属性
	除了byname外，还有byType，constructor。
	如果是byType的话，找到多个此type的属性，则会抛异常
	
	
	Spring的特殊bean：完成分散配置，就是将一些经常用的属性值写在一个db.properties里面，例如：
	username=Kason
	url=www.sina.com
	password=123457
	age=25
	然后在beans.xml里面写一个bean
	<context:property-placeholder location="classpath:com/dispatch/db.properties"/>
	如有多个，就可以加逗号再加，然后赋值方式如下($符号加括号引用)：
	<bean id="dbutil" class="com.dispatch.DBUtil">
	<property name="username" value="${username}"/>
	<property name="url" value="${url}"/>
	<property name="password" value="${password}"/>
	<property name="age" value="${age}"/>
	</bean>
	
	
	
	AOP(Aspects Oriented Programming)编程，面向切片编程，是对所有对象或者一类对象编程。
	核心是在不增加代码的基础上，还增加新功能。
	汇编--面向机器
	c语言--面向过程（操作系统，杀毒软件，数据库）
	java--面向对象
	spring框架--aop编程，面向切面，对一批对象编程,主要是解决每一个对象都要进行的事务，安全，日志功能。
	AOP步骤：
		1.定义接口
		2.编写对象（被代理对象/目标对象）
		3编写通知（就是你需要批量赋给其他method的代码）
			通知类型：前置，后置，方法内部前后置（环绕），异常通知,引入通知（只希望特定的几个方法执行这些通知,了解一下，不同深究）
			分别有自己的接口MethodBeforeAdvice，AfterReturningAdvice,MethodInterceptor,ThrowsAdvice
		4配置beans
			4.1配置被代理对象
			4.2配置通知
			4.3配置核心代理对象
				4.3.1类为ProxyF actoryBean
				4.3.2property1代理接口集
				4.3.3织入通知
				4.3.4配置被代理对象，哪些bean需要被以这种方式代理
		重点是这里必须要有接口，包括主程序中将代理对象实例化为一个接口，不太理解，我理解为一种格式。详情看com.AOP
	
	
	
	SSH(struts+spring+hibernate)整合：三大框架配合使用来开发项目，java.ee最流行的开发方式
	实例：雇员薪资管理系统（CRUD）,Web项目
	1.spring
		1.1引入所有相关Jar包	
		1.2编写beans.xml文件 ,放入src目录
		1.3写测试包测试spring是否能够运行
	2.加入hibernate
		2.1加入hibernate开发包
*/
