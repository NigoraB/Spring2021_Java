package Class9.BankProject;

public class Customer {
    // field variable
    String name;
    String address;
    String phone;
    String ssn;

    /**
     * Method to return customer name
     */
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void getProfile() {
        System.out.println("Name : " + name +
                "\nAddress : " + address +
                "\nPhone : " + phone +
                "\nLast 4 digits-Ssn : " + ssn);
    }

    /**
     * Method to create customer profile
     */
    public void createCustomerProfile(String cName, String cAddr, String cPhone, String cSsn) {
        name = cName;
        address = cAddr;
        phone = cPhone;
        ssn = cSsn;
    }

    public void updateAddress(String newAddress) {
        address = newAddress;
    }






}
