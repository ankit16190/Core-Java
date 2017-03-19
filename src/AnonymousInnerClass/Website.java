package AnonymousInnerClass;

class ProgrammerInterview  {
	public void read() {
		System.out.println("Programmer Interview!");
	}
}

class Website {
	/*  This creates an anonymous inner class: */
	public static void main(String args[]) throws Exception {
		ProgrammerInterview pInstance = new    ProgrammerInterview() {
			public void read() {
				System.out.println("anonymous ProgrammerInterview");
			}
		};
		pInstance.read();
	}
}
