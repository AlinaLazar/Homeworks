package Project1_SistemDeGestiuneInscrieri;

import java.util.Objects;

public class Guest {
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNo;
    public static int compareCase;

    public Guest (String lastName, String firstName, String email){
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    public Guest(String lastName, String firstName, String email, String phoneNo){
        this (lastName, firstName, email);
        this.phoneNo = phoneNo;
    }

    //pct.4 actualizare date
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Guest guest = (Guest) obj;


        if (compareCase == 1) {
            if ((Objects.equals(lastName, guest.lastName) && Objects.equals(firstName, guest.firstName))) {
                return true;
            } else {
                return false;
            }
        }

        if (compareCase == 2) {
            if (Objects.equals(email, guest.email)){
                return true;
            } else {
                return false;
            }
        }

        if (compareCase == 3){
            if (Objects.equals(phoneNo, guest.phoneNo)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return lastName + " " + firstName + " " + email + " " + phoneNo ;
    }

    public boolean searchString (String sir){
        return (this.lastName.toLowerCase().contains(sir.toLowerCase()) || this.firstName.toLowerCase().contains(sir.toLowerCase()) ||
                this.email.toLowerCase().contains(sir.toLowerCase()) || this.phoneNo.contains(sir.toLowerCase()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, email, phoneNo);
    }
}
