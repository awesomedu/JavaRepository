class demo{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 100;

		int temp = (a>b)?a:b;
		int max = (c>temp)?c:temp;
		System.out.println("max = "+max);
	}
}