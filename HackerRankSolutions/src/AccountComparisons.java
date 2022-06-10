import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AccountComparisons {

	interface OnlineAccount {
		int basePrice = 120;
		int regularMoviePrice = 45;
		int exclusiveMoviePrice = 80;
	}

	private static final class Account implements OnlineAccount, Comparable<Account> {

		int noRegularMovies, noPremiumMovies;
		String ownername;
		double monthlyCost;

		public Account(String ownername, int noPremiumSerial, int noRegularSerial) {
			super();
			this.noRegularMovies = noRegularSerial;
			this.noPremiumMovies = noPremiumSerial;
			this.ownername = ownername;
		}

		public double monthlyCost() {
			double cost = OnlineAccount.basePrice + (noRegularMovies * OnlineAccount.regularMoviePrice)
					+ (noPremiumMovies * OnlineAccount.exclusiveMoviePrice);// 1M

			return cost;

		}// (a.2)

		public double getMonthlyCost() {
			return monthlyCost;
		}

		public void setMonthlyCost() {
			this.monthlyCost = monthlyCost();
		}

		@Override
		public String toString() {
			return "Account [noRegularMovies=" + noRegularMovies + ", noPremiumMovies=" + noPremiumMovies
					+ ", ownername=" + ownername + ", monthlyCost=" + monthlyCost + "]";
		}

		@Override
		public int compareTo(Account o) {
			if (monthlyCost == o.getMonthlyCost())
				return 0;
			else if (monthlyCost > o.getMonthlyCost())
				return 1;
			else
				return -1;
		}

	}

	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sub = sc.nextLine();

		int t = Integer.parseInt(sub);
		ArrayList<Account> list = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			String[] input = sc.nextLine().split(" ");
			Account account = new Account(input[0], Integer.parseInt(input[2]), Integer.parseInt(input[1]));
			account.setMonthlyCost();
			list.add(account);
			System.out.println(account);

		}

		Collections.sort(list);
		System.out.println("Most valuable account details:");
		System.out.println(list.get(list.size() - 1));
		sc.close();
	}
}
