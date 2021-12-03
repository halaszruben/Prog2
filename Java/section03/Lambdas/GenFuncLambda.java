interface SomeFunc<T> {
	T func(T n);
}

class GenFuncLambda {
	public static void main(String[] args) {
		
		SomeFunc<Integer> factorial = (n) -> {
			
			int result = 1;
			
			for (int i = 1; i <= n; i++)
				result = i * result;

			return result;
		};

		System.out.println("The factorial of 3 is " + factorial.func(3));
		System.out.println("The factorial of 5 is " + factorial.func(5));

		SomeFunc<String> reverse = (str) -> {

			String result = "";
			int i;

			for(i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};

		System.out.println("Lambda reversed is " + reverse.func("Lambda"));
		System.out.println("Expression reversed is " + reverse.func("Expression"));
	}
}