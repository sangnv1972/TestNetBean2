/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class CalculateInterest {

	private final int RANK_A = 10000;
	private final int RANK_B = 5000;
	private final int RANK_C = 1000;
	/**
	 * Neu diem cua khach hang >=10000, thi lai suat vay se = 90% so voi lai suat chuan
	 * Neu diem cua khach hang <10000 va >= 5000, thi lai suat vay se = 100% so voi lai suat chuan
	 * Neu diem cua khach hang <5000 va >= 1000, thi lai suat vay se = 120% so voi lai suat chuan
	 * Neu diem cua khach hang < 1000, thi lai suat vay se = 150% so voi lai suat chuan
	 * 
	 * Neu So tien vay > 500 trieu thi lai suat vay se la lai suat sau khi tinh theo rank cua khach hang
	 * Neu So tien vay >= 200 trieu va < 500 trieu thi lai suat vay se la lai suat sau khi tinh theo rank cua khach hang * 1.1
	 * Neu So tien vay >= 100 trieu va < 200 trieu thi lai suat vay se la lai suat sau khi tinh theo rank cua khach hang * 1.2
	 * Neu So tien vay >= 10 trieu va < 100 trieu thi lai suat vay se la lai suat sau khi tinh theo rank cua khach hang * 1.3
	 * Neu so tien vay < 10 trieu trieu thi lai suat vay se la lai suat sau khi tinh theo rank cua khach hang * 1.4
	 * 
	 * Neu ky han > 6 thang thi lai suat = lai suat sau khi tinh tren so tien vay va rank cua khach hang
	 * Neu ky han =< 6 thang thi lai suat = 1.1 * lai suat sau khi tinh tren so tien vay va rank cua khach hang 
	 * @param term
	 * @param amount
	 * @param customerPoint
	 * @return
	 */
	public double calculate(double loanTerm, double loanAmount, int customerPoint, float standardInterestRate) {
		double interestRate = standardInterestRate;
		if(customerPoint >= RANK_A) {
			interestRate = interestRate * 0.9; 
		} else if(customerPoint >= RANK_B && customerPoint < RANK_A) {
			interestRate = interestRate * 1.0;
		} else if(customerPoint >= RANK_C && customerPoint < RANK_B) {
			interestRate = interestRate * 1.2;
		} else  {
			interestRate = interestRate * 1.5;
		}
		//Loan amount tinh theo don vi trieu dong
		if(loanAmount > 500) {
			interestRate = interestRate * 1.0;
		} else if (loanAmount >=200 && loanAmount < 500) {
			interestRate = interestRate * 1.1;
		} else if (loanAmount >=100 && loanAmount < 200) {
			interestRate = interestRate * 1.2;
		} else if (loanAmount >=10 && loanAmount < 100) {
			interestRate = interestRate * 1.3;
		} else {
			interestRate = interestRate * 1.4;
		}
		//Term in month
		if(loanTerm > 6) {
			interestRate = interestRate * 1.0;
		} else {
			interestRate = interestRate * 1.1;
		}
		return interestRate;
	}
}