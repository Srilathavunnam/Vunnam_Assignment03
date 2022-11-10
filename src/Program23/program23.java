/**
 * 
 */
package Program23;

/**
 * @author S545534
 *
 */
public class program23 {
	class ImmutableValue {

		private final int value = 0;

		public ImmutableValue(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public class ImmutableValueUser {
		private ImmutableValue currentValue = null;
													

		public ImmutableValue getValue() {
			return currentValue;
		}

		public void setValue(ImmutableValue newValue) {
			this.currentValue = newValue;
		}

	}
}
