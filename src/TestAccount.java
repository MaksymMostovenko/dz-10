public enum TestAccount {
    ACCOUNT_ID_000("accountId000", 50, "USD"),
    ACCOUNT_ID_001("accountId001", 50, "EUR"),
    ACCOUNT_ID_002("accountId002", 50, "USD"),
    ACCOUNT_ID_003("accountId003", 250, "HRV"),
    ACCOUNT_ID_004("accountId004", 9999, "USD");

    private String id;
    private int amount;
    private String currency;

    private TestAccount(String id, int amount, String currency) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}
