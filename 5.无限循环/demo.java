class demo{
	public static void main(String[] args) {
		/*while(true){
			System.out.println("while循环中");
		}*/

		int i = 0;
		for (; ; ) {
			i++;
			System.out.println("for循环中");
			if (i > 100000000) {
				break;
			}
		}
	}
}