import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long portfolioId;

    private Long clientId;
    private Long financialAdvisorId;

    public Portfolio() {
    }

    public Portfolio(Long clientId, Long financialAdvisorId) {
        this.clientId = clientId;
        this.financialAdvisorId = financialAdvisorId;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getFinancialAdvisorId() {
        return financialAdvisorId;
    }

    public void setFinancialAdvisorId(Long financialAdvisorId) {
        this.financialAdvisorId = financialAdvisorId;
    }
}
