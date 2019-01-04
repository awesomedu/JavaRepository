class demo{
	public static void main(String[] args) {
		for (int i= 0; i< 100; i ++ ) {
			System.out.println(i);
		}

		for (int i = 1; i<=9;i++ ) {
			for (int j= 1; j<= i; j++) {
				System.out.printf("%d * %d = %d",i,j,i * j);
				if (i == j) {
					System.out.println('\n');
					continue;
				}
			}
		}
	}
}