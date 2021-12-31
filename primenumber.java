package assign2;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		
				int a = 2000;
				int temp = a;
				int reverse = 0;
				while(a > 0) {
					reverse = reverse*10 + a%10;
					a = a/10;
				}
				System.out.println("reversed value = "+reverse);
				if (reverse == temp) {
					System.out.println("palindrome");
				}
				else {
					System.out.println("not palindrome");
				}
				
			}

		 

	}


