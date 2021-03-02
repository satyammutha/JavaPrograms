class Account {
    // private data members
    private long ac_no;
    private String name, email;
    private float amount;

    // private getter & setter methods
    public long getAccno() {
        return ac_no;
    }

    public void setAccno(long ac_no) {
        this.ac_no = ac_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

}