public class DoggyMethodScript {

	public static void main(String[] args) {
	 	DoggyMethodScript script = new DoggyMethodScript();
		script.launch();
	}

	public void launch() {

		for (int i=0;i<12;i++) {
			System.out.println(MethodDog.doggyMethod(i));
		}	
	}
}