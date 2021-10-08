package Javapractice;

public class NewAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int $registrationAmount = 200;
		int $firstInstallment = 624;
		int $2ndInstallment = 623;
		int $courseFee = 2300;
		double $discountAmount=$courseFee-($courseFee*10/100);
		double $dueAmount=$discountAmount-$registrationAmount-$firstInstallment-$2ndInstallment;
		
		int A = 3;
		A +=4;
		System.out.println(A);
		System.out.println("My Course Fee was $"+$courseFee+", and I have got 10% discount.");
		System.out.println("So after 10% discount my amount to be paid is $"+$discountAmount+".");
		System.out.println("I have already paid $"+$registrationAmount+" as registration fee, "+$firstInstallment+" as first installment and $"+$2ndInstallment+" as 2nd installment.");
		System.out.print("Now I have to pay $"+$dueAmount+". ");
		System.out.print("I've saved $"+($courseFee*10/100)+" for 10% discount.");
	}
}