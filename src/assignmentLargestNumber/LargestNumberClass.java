package assignmentLargestNumber;

public class LargestNumberClass {
int num1;
int num2;
int num3;

void process() {

if (num1>=num2 && num1>= num3) {
	System.out.println(num1+ "is the largest number");
}
	else if (num2>=num1 && num2 >= num3) {
		System.out.println(num2 +"is the largest number");
	}
else {
		System.out.println(num3 +"is the largest number");
   }

	}
}
	