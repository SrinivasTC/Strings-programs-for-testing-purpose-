package testing;

public class Democlass {
	public static void main(String[] args) {
	
	addition();
	substraction();
	multiplication();
	greaterthan();
	lessthan();
	
	}
	public static void  addition() {
		
		int a=2;
		int b=3;
		int c=a+b;
		System.out.println(c);}

		public static void substraction() {
			int a=2;
			int b=3;
			int d=a-b;
			System.out.println(d);
		}
		public static void multiplication() {
			int a=2;
			int b=3;
			int e=a*b;
			System.out.println("the product of two varaiables="+e);
		}
		public static void divison() {
			int a=2;
			int b=3;
			int f=a/b;
			System.out.println("the divison of two varaiables="+f);
					}
		public static void greaterthan() {
			int a=5;
			int b=2;
			if (a>b) {
			System.out.println(true);
			}}
			
			
			public static void lessthan() {
				int a=5;
				int b=2;
				if (a<b) {
				System.out.println("no");
				}}
			
				public static void equalsto() {
					int a=5;
					int b=2;
					if (a==b) {
					System.out.println(false);
					}}
			
					public static void notequalsto() {
						int a=5;
						int b=2;
						if (a!=b) {
						System.out.println("yes");
						}
						else {
							System.out.println("no");
						
					
		}}
					public static void greathanorequalsto() {
						int a=5;
						int b=2;
						if (a>=b) {
						System.out.println("yes");
						}
						else {
							System.out.println("no");	

		}}
					public static void lesshanorequalsto() {
						int a=5;
						int b=2;
						if (a<=b) {
						System.out.println("no");
						}
						else {
							System.out.println("yes");	
							
							
						}}


}


