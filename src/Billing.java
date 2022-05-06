import Util.CardReader;
import Util.PriceCalculation;
import Util.ValidateQuantity;

import java.util.*;

public class Billing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the input file for testing:");
		String filepath = sc.nextLine();
		sc.close();
		// System.out.println("filepath: "+filepath);
		CardReader carddata = new CardReader();
		carddata.readCarddata("/Users/admin/Desktop/CMPE202/individual-project-preethibilla/src/resources/Cards.csv");
		ValidateQuantity qtycheck = new ValidateQuantity();
		PriceCalculation pricecalculation = new PriceCalculation();
		// CheckCap checkcap = new CheckCap();
		qtycheck.setHandler(pricecalculation);
		qtycheck.check(filepath);
		// System.out.println("Hello world");
		System.out.println("Cards present and added are:");
		CardReader.cards.forEach((element) -> {
			System.out.println(element);
		});

	}

}
