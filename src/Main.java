public class Main {

    public static void main(String[] args) {

        Address[] addresses = new Address[2];
        Address address1 = new Address("3601 S Congress Ave, BLDG. C, Austin, TX, 78704");
        Address address2 = new Address("3601 S Congress Ave, BLDG. K, Austin, TX, 78704");
        addresses[0] = address1;
        addresses[1] = address2;

        Member member = new Member("Brian Sheen",addresses,"1984-11-25");
        System.out.println(member);



    }
}
