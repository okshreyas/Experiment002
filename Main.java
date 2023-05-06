Class Main{
	public static void main(String args[]){
	System.out.println("Hello world");
		int apple;
		Scanner sc=new Scanner();
		
		apple=sc.nextInt();
		System.out.println(apple);
		Runtime runtime = Runtime.getRuntime();
        
        long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        long maxMemory = runtime.maxMemory();
        double usedPercentage = (double) usedMemory / maxMemory * 100;
        
        System.out.println("Used memory: " + usedMemory + " bytes");
        System.out.println("Max memory: " + maxMemory + " bytes");
        System.out.println("Memory used percentage: " + usedPercentage + "%");
	}

}
