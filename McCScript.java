public class McCScript {

	public static void main(String[] args) {
	 	McCScript script = new McCScript();
		script.launch();
	}

	public void launch() {

		//int number = McC.mcCarthy91(50);
		System.out.println("\nARGUMENT:50...");
		System.out.println("RESULT FOR ARGUMENT:50..." + McC.mcCarthy91(50));
		System.out.println("\nARGUMENT:73...");
		System.out.println("RESULT FOR ARGUMENT:73..." + McC.mcCarthy91(73));
		System.out.println("\nARGUMENT:95...");
		System.out.println("RESULT FOR ARGUMENT:95..." + McC.mcCarthy91(95));
	}

	}