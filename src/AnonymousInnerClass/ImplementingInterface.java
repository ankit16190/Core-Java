/**
 * 
 */
package AnonymousInnerClass;

/**
 * @author Ankit Singhal
 *
 */

interface Programmer {

	public void read();

}

public class ImplementingInterface {
	public static void main(String args[]) {
		Programmer p = new Programmer() {
			public void read() {
				System.out
						.println("interface ProgrammerInterview anonymous class implementer");
			}
		};
		p.read();
	}
}
