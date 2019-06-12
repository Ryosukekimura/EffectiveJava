package chapter4.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * スーパークラス
 * @author k1449
 *
 */
public class MySuperClass {
	private int a = 0;
	private int b = 0;

	private static final MySuperClass[] PRIVATE_VALUES = {new MySuperClass(), new MySuperClass()};

	public static final List<MySuperClass> VALUES
		= Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

	public static final MySuperClass[] values() {
		return PRIVATE_VALUES.clone();
	}




	protected int getA() {
		return a;
	}

	int getB() {
		return b;
	}
}
