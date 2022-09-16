package com.example.Tablebank;

import javax.persistence.*;





    @Entity
    @Table
    public class BankAccount {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String acc_name;

        private double balance;

        public BankAccount()
        {

        }

        public BankAccount(int id, String acc_name, double balance) {
            this.id = id;
            this.acc_name = acc_name;
            this.balance = balance;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return acc_name;
        }

        public void setName(String acc_name) {
            this.acc_name = acc_name;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }


    }



