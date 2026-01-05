//Executor class for ChildThread
package multithreading.threadclass;

public class ThreadDemo {
	public static void main(String[] args) {
		Threadclass threadOne = new Threadclass(5, "First");
		Threadclass threadTwo = new Threadclass(10, "Second");

		threadOne.start();
		//threadOne.start(); // throws IllegalStateException
		// threadOne.run(); // single threaded application 
		threadTwo.start();

		System.out.println("-----------------------End of Main--------------------------");
	}
}
