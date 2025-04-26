/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.BloodTypes;

import Business.BloodTypes.PersonBloodTypes.BloodType;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author siddh
 */
public class BloodTransaction {

    // Enum representing transaction type (e.g., adding or removing blood units)
    public enum TransactionType {
        In("Increase inventory"),
        Out("Decrease inventory");

        private String value;

        private TransactionType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private final BloodType bloodType; // Type of blood involved in the transaction
    private final int units; // Number of units involved in the transaction
    private final TransactionType inOut; // Type of transaction (In/Out)
    private final Object reference; // Reference for the transaction (e.g., order or donation)
    private final Date timestamp; // Time of transaction creation

    public BloodTransaction(BloodType bloodType, int units, TransactionType inOut, Object reference) {
        this.bloodType = bloodType;
        this.units = units;
        this.inOut = inOut;
        this.reference = reference;
        this.timestamp = new Date(); // Captures the transaction time
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public int getUnits() {
        return units;
    }

    public TransactionType getInOut() {
        return inOut;
    }

    public Object getReference() {
        return reference;
    }

    public String getTimestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(timestamp);
    }
}
