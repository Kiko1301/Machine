
public class Machine {
public void start() {
	System.out.println("Starting...");
	}
	public void dog() {
		System.out.print("Woof Woof");
	}
		public static void main(String[]args) {
			Machine m = new Machine() {
				@Override
				public void start() {
					System.out.println("Woooo");
					
				}
			};
			m.start();
			m.dog();
		}
			}
		

		

	


