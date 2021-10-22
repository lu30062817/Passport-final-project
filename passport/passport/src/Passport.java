public class Passport {
    private String passportNo;
    private String passportName;
    private String linkedIDCardNumber;

    public Passport(String passportNo, String passportName, String linkedIDCardNumber) {
        this.passportNo = passportNo;
        this.passportName = passportName;
        this.linkedIDCardNumber = linkedIDCardNumber;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getPassportName() {
        return passportName;
    }

    public void setPassportName(String passportName) {
        this.passportName = passportName;
    }

    public String getLinkedIDCardNumber() {
        return linkedIDCardNumber;
    }

    public void setLinkedIDCardNumber(String linkedIDCardNumber) {
        this.linkedIDCardNumber = linkedIDCardNumber;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNo='" + passportNo + '\'' +
                ", passportName='" + passportName + '\'' +
                ", linkedIDCardNumber='" + linkedIDCardNumber + '\'' +
                '}';
    }
}
