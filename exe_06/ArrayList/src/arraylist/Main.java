/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author nplatis
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Δημιουργία ArrayList<> με στοιχεία String.
        // Ο τύπος των στοιχείων μπορεί να παραληφθεί στη κλήση της new.
        // Όμως πρέπει να υπάρχουν τα <>.
        //ArrayList<String> arr = new ArrayList<String>();
        ArrayList<String> arr = new ArrayList<>();
        
        // Προσθήκη στοιχείων στο τέλος του ArrayList (add).
        arr.add("abc");
        arr.add("def");
        arr.add("ghi");
        
        // Μπορώ να εκτυπώσω ολόκληρω το ArrayList δίνοντάς το σε εντολές
        // print / println.
        System.out.println(arr);
        
        // Προσθήκη στοιχείου στο μέσο του ArrayList (add).
        arr.add(1, "xyz");
        System.out.println(arr);
        
        // Όχι όμως πέρα από το τέλος του
        //arr.add(5, "890");
        //System.out.println(arr);

        // Αλλαγή στοιχείου του ArrayList που βρίσκεται σε συγκεκριμένη θέση (set).
        // (Οι δείκτες ξεκινούν από το 0, όπως και στους απλούς πίνακες.)
        arr.set(3, "345");
        System.out.println(arr);
        
        // Πρόσβαση στα στοιχεία του ArrayList μέσω των δεικτών τους (get).
        // Πλήθος στοιχείων του ArrayList (size).
        // Διαδρομή του ArrayList με συνήθη εντολή for.
        for (int i = 0; i < arr.size(); i++)  {
            System.out.println(arr.get(i));
        }
        
        // Διαδρομή του ArrayList με την νέα for ("for each").
        for (String item : arr) {
            System.out.println(item);
        }
        
        // Έλεγχος αν το ArrayList περιέχει κάποιο στοιχείο (contains).
        // Επιστρέφει true ή false.
        System.out.println(arr.contains("abc"));
        
        // Εύρεση της πρώτης θέσης στοιχείου στο ArrayList - σειριακή αναζήτηση (indexOf).
        // Επιστρέφει στον σχετικό δείκτη ή -1 αν δεν υπάρχει το στοιχείο.
        System.out.println(arr.indexOf("cde"));
        
        arr.add("abc");
        System.out.println(arr);
        System.out.println(arr.indexOf("abc"));
        
        // Εύρεση της τελευταίας θέσης στοιχείου στο ArrayList - σειριακή αναζήτηση από το τέλος (lastIndexOf).
        System.out.println(arr.lastIndexOf("abc"));
        
        // Αφαίρεση στοιχείου με συγκεκριμένο δείκτη. Το στοιχείο που αφαιρέθηκε επιστρέφεται (remove).
        String old = arr.remove(2);
        System.out.println(arr);
        
        // Αφαίρεση της πρώτης εμφάνισης συγκεκριμένου στοιχείου, μέσω σειριακής αναζήτησης (remove).
        // Επιστρέφει true αν το βρήκε και το αφαίρεσε, false διαφορετικά.
        System.out.println(arr.remove("cde"));
        System.out.println(arr);

        // Διαγραφή όλων των στοιχείων του ArrayList (όχι του ίδιου του ArrayList) (clear).
        arr.clear();
        System.out.println(arr.size());
    }
    
}
