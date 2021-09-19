package pojo;

import utils.AccountOwnership;
import utils.AccountType;

public class NewCheckingDataContainer {

    private AccountType accountType;
    private AccountOwnership accountOwnership;
    private String accountName;
    private String initialDeposit;
    private  String errorMsg;

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountOwnership getAccountOwnership() {
        return accountOwnership;
    }

    public void setAccountOwnership(AccountOwnership accountOwnership) {
        this.accountOwnership = accountOwnership;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(String initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    @Override
    public String toString() {
        return "NewCheckingDataContainer{" +
                "accountType='" + accountType + '\'' +
                ", accountOwnership='" + accountOwnership + '\'' +
                ", accountName='" + accountName + '\'' +
                ", initialDeposit=" + initialDeposit +
                '}';
    }
}