/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author siddh
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BloodCount {
    HashMap<String, Integer> bloodTypeComboCounts; // Stores combinations of blood types and their counts

    // Constructor to initialize the blood type combination counts
    public BloodCount() {
        bloodTypeComboCounts = new HashMap<>();
    }

    // Adds a count for a blood type combination
    public void bloodTypeComboCountAdd(PersonBloodTypes bloodType) {
        ArrayList<String> bloodTypeValues = bloodType.getBloodTypeValuesList();
        Collections.sort(bloodTypeValues);
        String bloodTypeCombo = String.join(", ", bloodTypeValues);
        bloodTypeComboCounts.putIfAbsent(bloodTypeCombo, 0);
        bloodTypeComboCounts.put(bloodTypeCombo, bloodTypeComboCounts.get(bloodTypeCombo) + 1);
    }

    // Adds a custom increment to the count for a blood type combination
    public void bloodTypeComboCountAdd(PersonBloodTypes bloodType, Integer i) {
        ArrayList<String> bloodTypeValues = bloodType.getBloodTypeValuesList();
        Collections.sort(bloodTypeValues);
        String bloodTypeCombo = String.join(", ", bloodTypeValues);
        bloodTypeComboCounts.putIfAbsent(bloodTypeCombo, 0);
        bloodTypeComboCounts.put(bloodTypeCombo, bloodTypeComboCounts.get(bloodTypeCombo) + i);
    }

    // Subtracts a count for a blood type combination
    public void bloodTypeComboCountSubtract(PersonBloodTypes bloodType) {
        ArrayList<String> bloodTypeValues = bloodType.getBloodTypeValuesList();
        Collections.sort(bloodTypeValues);
        String bloodTypeCombo = String.join(", ", bloodTypeValues);
        bloodTypeComboCounts.put(bloodTypeCombo, bloodTypeComboCounts.get(bloodTypeCombo) - 1);
    }

    // Returns the current counts of all blood type combinations
    public HashMap<String, Integer> getBloodTypeComboCounts() {
        return bloodTypeComboCounts;
    }
}
