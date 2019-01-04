class demo{
	public static void main(String[] args) {
		int x = 3;
		int y = 3;
		// & 和 && 的区别是 && 具有短路效果，左边如果是false,右边则不执行
		System.out.println((++x == 3) && (++y == 4));
		System.out.println("x= " +x);
		System.out.println("y= " +y);
	}
}