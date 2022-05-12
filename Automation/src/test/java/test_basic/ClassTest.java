package test_basic;

public class ClassTest {
	int no;
	protected int prno;
	public ClassTest(int n) {
		no = n;
		prno = n;
	}

}
class ClasTest extends ClassTest{
	public ClasTest(int n) {
		super(n);
	}
	
}
