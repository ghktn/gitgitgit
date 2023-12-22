package com.example.gitgitgit;

public class DhController {

    public static class Account {
        private String accountNumber;
        private double balance;

        public Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // 입금 기능 추가
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(amount + "원 입금되었습니다.");
            } else {
                System.out.println("입금액은 0보다 커야 합니다.");
            }
        }

        // 출금 기능 추가
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println(amount + "원 출금되었습니다.");
            } else {
                System.out.println("출금액이 잔액보다 크거나 0보다 작습니다.");
            }
        }

        // 잔액 확인 기능 추가
        public void displayBalance() {
            System.out.println("계좌번호: " + accountNumber + ", 잔액: " + balance);
        }
    }

    public static class BankSystem {
        public static void main(String[] args) {
            Account myAccount = new Account("12345", 1000);

            // 입금
            myAccount.deposit(300);

            // 출금
            myAccount.withdraw(200);

            // 잔액 확인
            myAccount.displayBalance();
        }
    }
}
