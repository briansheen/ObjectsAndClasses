import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by bsheen on 3/28/17.
 */
public class Member {
    private String name;
    private Address address[];
    private LocalDate dob;

    public Member(String name, Address[] address, String dob) {
        this.name = name;
        this.address = address;
        this.dob = LocalDate.parse(dob);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address[] getAddress() {
        return address;
    }

    public void setAddress(Address[] address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address=" + Arrays.toString(address) +
                ", dob=" + dob +
                '}';
    }
}

