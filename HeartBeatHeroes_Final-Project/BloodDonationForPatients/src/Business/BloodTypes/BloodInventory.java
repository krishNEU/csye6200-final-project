/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.BloodTypes;

import Business.BloodTypes.BloodTransaction.TransactionType;
import Business.BloodTypes.PersonBloodTypes.BloodType;
import Business.EcoSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author siddh
 */
public class BloodInventory {

    EcoSystem system; // Reference to the overarching ecosystem.
    ArrayList<BloodTransaction> ledger; // Keeps track of all blood transactions.
    HashMap<BloodType, Integer> balance; // Maintains the inventory balance for each blood type.

    // Constructor initializes the system, ledger, and balance map with all blood types.
    public BloodInventory(EcoSystem system) {
        this.system = system;
        ledger = new ArrayList<BloodTransaction>();
        balance = new HashMap<BloodType, Integer>();
        for (BloodType bt: Arrays.asList(PersonBloodTypes.BloodType.values())) {
            balance.put(bt, 0);
        }
    }

    // Adds a transaction to the ledger and updates the balance.
    public void addTransaction(BloodType bloodType, int units, TransactionType inOut, Object reference) {
        if (doesReferenceExist(reference)) return; // Avoid duplicate transactions.
        BloodTransaction newTransaction = new BloodTransaction(bloodType, units, inOut, reference);
        ledger.add(newTransaction);
        
        int currentBalance = balance.getOrDefault(bloodType, 0);
        int newBalance = currentBalance + ((inOut == TransactionType.In) ? units : (-1) * units);
        balance.put(bloodType, newBalance);
    }

    // Checks if a transaction with the given reference already exists.
    public boolean doesReferenceExist(Object reference) {
        for (BloodTransaction bt: ledger) {
            if (bt.getReference().equals(reference)) return true;
        }
        return false;
    }

    // Returns the current balance for a specific blood type.
    public Integer getBloodTypeBalance(BloodType bloodType) {
        return balance.getOrDefault(bloodType, 0);
    }

    // Retrieves the complete blood inventory balance.
    public HashMap<BloodType, Integer> getInventoryBalance() {
        return balance;
    }

    // Finds and returns the most recent transaction for a specific blood type.
    public BloodTransaction findLastTransactions(BloodType bloodType) {
        BloodTransaction lastOne = null;
        for (BloodTransaction bt : ledger) {
            if (bt.getBloodType().equals(bloodType)) lastOne = bt;
        }
        return lastOne;
    }
}
