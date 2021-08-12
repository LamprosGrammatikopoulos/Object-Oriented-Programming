/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclockapp;

/**
 *
 * @author nplatis
 */
public class Clock
{
    private int hours;
    private int minutes;

    // (1)
    public Clock()
    {    
    }
    public Clock(int h,int m)
    {
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
            this.hours = h;
            this.minutes = m;
        }
        else {
            IllegalArgumentException t = new  IllegalArgumentException();
            throw t;
        }
        
        
        
    }
    public int getHours()
    {
        return hours;
    }
    
    public int getMinutes()
    {
        return minutes;
    }
    

    /*
    // (2)
    public void setHours(int h)
    {
        hours = h;
    }
    
    public void setMinutes(int m)
    {
        minutes = m;
    }
    */
    
    // (3) Νέες εκδοχές των μεθόδων set...() με έλεγχο αποδεκτού εύρους τιμών.
    // Επιστρέφουν boolean για να σηματοδοτήσουν αν έγινε ή όχι σωστά η ανάθεση.
    public void setHours(int hours)
    {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        }
        else {
             IllegalArgumentException t = new  IllegalArgumentException();
             throw t;
        }
    }
    
    public void setMinutes(int minutes)
    {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        }
        else {
            IllegalArgumentException t = new  IllegalArgumentException();
            throw t;
        }
    }

    // Η μέθοδος print() τυπώνει την ώρα σε συνήθη μορφή.
    // Παρέχεται μόνο ενδεικτικά.
    public void print()
    {
        // Πρέπει να προσέξουμε να τυπώσουμε σωστά τα λεπτά, με δύο ψηφία πάντα
        
        /* Πρώτη παραλλαγή
        if (minutes < 10) {
            System.out.print(hours + ":0" + minutes);
        }
        else {
            System.out.print(hours + ":" + minutes);
        }
        */
        
        /* Δεύτερη παραλλαγή
        System.out.print(hours + (minutes < 10 ? ":0" : ":") + minutes);
        */
        
        System.out.printf("%d:%02d", hours, minutes);
    }
    
    // (4)
    @Override
    public String toString()
    {
        /* Πρώτη παραλλαγή
        if (minutes < 10) {
            return (hours + ":0" + minutes);
        }
        else {
            return (hours + ":" + minutes);
        }
        */
        
        /* Δεύτερη παραλλαγή
        return (hours + (minutes < 10 ? ":0": ":") + minutes);
        */
        
        // Η μέθοδος String.format() δημιουργεί ένα String
        // με τη λειτουργικότητα της printf()
        return String.format("%d:%02d", hours, minutes);
    }

    // (5)
    public void tick()
    {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hours++;
            if (hours == 24) {
                hours = 0;
            }
        }
    }
    
    // (6)
    public void setTime(int hours, int minutes)
    {
        if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
            this.hours = hours;
            this.minutes = minutes;
        }
        else {
            IllegalArgumentException t = new  IllegalArgumentException();
            throw t;
        }
        
        // Εναλλακτική υλοποίηση, καλώντας τις προηγούμενες μεθόδους.
        //return setHours(hours) && setMinutes(minutes);
    }
    
    // (7)
    public void setTime(String timeString)
    {
        // Αφαιρούμε τυχόν κενά που υπάρχουν στην αρχή και στο τέλος
        timeString = timeString.trim();
        
        // Εντοπίζουμε τη θέση των «:»
        int delimPos = timeString.indexOf(":");
        if (delimPos == -1) 
        {
            IllegalArgumentException t = new  IllegalArgumentException();
            throw t;
        }
        
        // Ξεχωρίζουμε τα κομμάτια πριν και μετά τις «:»
        String hs = timeString.substring(0, delimPos);
        String ms = timeString.substring(delimPos+1);
        
        // Τα μετατρέπουμε σε ακεραίους
        int h = Integer.parseInt(hs);
        int m = Integer.parseInt(ms);
        
        // Καλούμε την προηγούμενη setTime() για να κάνει τη δουλειά
        //return setTime(h, m);
    }
}
