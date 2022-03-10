package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class missingNumberTest {

	@Test
	void test() {
		JunitTestingMissingNo test = new JunitTestingMissingNo();
		int arr[] = {1,2,4,5,6};
		int output = test.missingNum(arr);
		assertEquals(-1, output);
	}

}
