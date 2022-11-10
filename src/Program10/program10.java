package Program10;

public class program10 {
	class SuperClass {
		void methodOfSuperClass() throws ArrayIndexOutOfBoundsException {
			System.out.println("Super class method is throwing Unchecked exception");
		}
	}

	class SubClass extends SuperClass {
		@Override
		void methodOfSuperClass() throws ArrayIndexOutOfBoundsException {
			System.out.println("Can be Overrided with same unchecked exception");
		}
	}

	class SubClassOne extends SuperClass {
		@Override
		void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException {
			System.out.println("Can be overrided with any other Unchecked Exceptions");
		}
	}

}
