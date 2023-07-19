import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clientId;

    private Long financialAdvisorId;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Client() {
    }

    public Client(Long financialAdvisorId, String name, String address, String phoneNumber, String email) {
        this.financialAdvisorId = financialAdvisorId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getClientId() {
        return clientId;
    }

    public Long getFinancialAdvisorId() {
        return financialAdvisorId;
    }

    public void setFinancialAdvisorId(Long financialAdvisorId) {
        this.financialAdvisorId = financialAdvisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
