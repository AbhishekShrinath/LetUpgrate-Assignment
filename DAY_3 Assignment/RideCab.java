package DAY_3;

import java.util.Scanner;

class Cab {
	int fare;
	int Distance;

	Cab() {
		fare = 30;
	}

	Cab(int Amt) {
		fare = Amt;
	}
}

public class RideCab {

	public static void main(String[] args) {

		int cd;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the cab distance from user in km : ");
		cd = sc.nextInt();

		if (cd > 5) {
			Cab obj1 = new Cab(30 + (cd - 5) * 10);
			System.out.print("Enter the distance travelled: ");
			obj1.Distance = sc.nextInt();

			obj1.fare += 10 * obj1.Distance;
			System.out.println("Total fare is "+obj1.fare+" Rs");

		} 
		else {

			Cab obj = new Cab();

			System.out.print("Enter the Distance Travel in km : ");
			obj.Distance = sc.nextInt();

			obj.fare = obj.fare + 10 * obj.Distance;
			System.out.println("Total Fare is " + obj.fare + " Rs");
		}
	}
}
