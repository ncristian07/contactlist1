package contactList;

public enum PhoneNumber {
    NUMBER("Number"),
    OPERATOR("Operator"),
    TYPEMOBILE("Mobile"),
    TYPEHOME("Home"),
    CONTRYCODETYPE("04");


    private String phoneNumber;

    PhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

