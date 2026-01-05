package FunctionsConcept;

public class CallByRefConcept {

	public void pop() {
		System.out.println("Pop Method");
		// NS --> S
		// CallByRefConcept.top();
	}

	public static void top(CallByRefConcept obj1) { // Object is added
		System.out.println("Top method");
		// S --> NS
//		CallByRefConcept obj1 = new CallByRefConcept();
//		obj1.rest();

		obj1.rest();
		obj1.pop();

	}

	public void rest() {
		System.out.println("Rest Method");
	}

	public static void main(String[] args) {
		// S --> NS
		CallByRefConcept obj = new CallByRefConcept();
		obj.pop();

		// S --> S
		CallByRefConcept.top(obj); // Call by Reference : Calling method by passing reference

	}

}
