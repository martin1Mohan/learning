package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.model.Coin;
import com.model.Note;
import com.model.Wallet;
import com.service.TotalMoneyInWalletService;

public class WalletApp {
	
	private static final Logger LOGGER = LogManager.getLogger(WalletApp.class);

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name Please....!");

		String walletName = sc.next();

		System.out.println("Enter Id of the Wallet");
		int id= sc.nextInt();
		
		System.err.println("Enter No. of coins you have: ");
		
		System.out.println("Enter One Rupee coins :");
		int oneRupeeCoin= sc.nextInt();
		
		System.out.println("Enter Two Rupee coins :");
		int twoRupeeCoin= sc.nextInt();
		
		System.out.println("Enter Five Rupee coins :");
		int fiveRupeeCoin= sc.nextInt();
		
		System.out.println("Enter Ten Rupee coins :");
		int tenRupeeCoin= sc.nextInt();

		Coin coin1 = new Coin(oneRupeeCoin, twoRupeeCoin, fiveRupeeCoin, tenRupeeCoin);
		LOGGER.info("User input coin data : " + coin1);
		System.out.println("Default coin object is creating....");
		Coin coin2= new Coin(2, 2, 2, 2);

		List<Coin> coins = new ArrayList<Coin>();

		coins.add(coin1);
		coins.add(coin2);
		
		System.err.println("Enter No. of Notes you have: ");

		System.out.println("Enter Ten Rupee Notes :");
		int tenRupeeNote= sc.nextInt();
		
		System.out.println("Enter Twenty Rupee Notes :");
		int twentyRupeeNote= sc.nextInt();
		
		System.out.println("Enter Fifty Rupee Notes :");
		int fiftyRupeeNote= sc.nextInt();
		
		System.out.println("Enter Hundred Rupee Notes :");
		int hundredRupeeNote= sc.nextInt();
		
		System.out.println("Enter Five Hundred Rupee Notes :");
		int fiveHundredRupeeNote= sc.nextInt();
		
		Note note1 = new Note(tenRupeeNote, twentyRupeeNote, fiftyRupeeNote, hundredRupeeNote, fiveHundredRupeeNote);
		LOGGER.info("User input note data : " + note1);
		System.out.println("Default Note object is creating....");
		Note note2 = new Note(2, 2, 2, 2, 2);

		List<Note> notes = new ArrayList<Note>();

		notes.add(note1);
		notes.add(note2);
		
		//long startTime= System.currentTimeMillis(); 

		Wallet wallet1 = new Wallet(walletName, id , coins, notes);

		/*
		 * List<Wallet> wallets = new ArrayList<Wallet>();
		 * 
		 * wallets.add(wallet1);
		 */

		// System.out.println(wallet1.getNotes().size());

		TotalMoneyInWalletService moneyInWalletService = new TotalMoneyInWalletService();

		int sumOfWallet = moneyInWalletService.sumOfMoney(wallet1);
		int totalNoCoins= moneyInWalletService.totalNoCoins(wallet1);
		int totalNoNotes= moneyInWalletService.totalNoNotes(wallet1);
		int totalSumOfCoins = moneyInWalletService.totalSumOfCoins(wallet1);
		int totalSumOfNotes = moneyInWalletService.totalSumOfNotes(wallet1);
		
		System.out.println(walletName+"'s wallet has total "+ totalNoCoins +" Coins!");
		System.out.println(walletName+"'s wallet has total "+ totalNoNotes +" Notes!");
		System.out.println(walletName+"'s wallet has total "+ totalSumOfCoins +" Change/coin worth");
		System.out.println(walletName+"'s wallet has total "+ totalSumOfNotes +" Note worth");
		System.out.println(walletName+ "'s wallet has a total worth of "+ sumOfWallet+ " Rupees");
		
		//System.out.println(System.currentTimeMillis()-startTime);
		
		sc.close();
		
		if(sumOfWallet > 2000) {
			System.err.println("Your are carrying too much of amount in your wallet it is not recommended please carry limited amount with you if not required...!!!");
		}
		
		LOGGER.info("Used by " + walletName);
	}
	
	

}
