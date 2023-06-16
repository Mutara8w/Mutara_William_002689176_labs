/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author mydel
 */
public class AccountDirectory {

    private ArrayList<Account> accountList;

    public AccountDirectory() {
        this.accountList = new ArrayList<>();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

    public Account addAccount() {
        Account acc = new Account();
        accountList.add(acc);
        return acc;
    }

    public void deleteAccount(Account acc) {
        accountList.remove(acc);
    }

    public Account searchForAccount(String accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
