package C_Builder_Design_pattern;

public class Player {

    private String name;
    private String team;
    private double height;
    private int salary;
    private String phone;
    private String twitterAccount;

    // INNER BUILDER
    public static class Builder {

        private final String name;
        private final String team;
        private double height = 0;
        private int salary = 0;
        private String phone = "";
        private String twitterAccount = "";

        public Builder(String name, String team) {
            this.name = name;
            this.team = team;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }

        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder twitterAccount(String twitterAccount) {
            this.twitterAccount = twitterAccount;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }

    // SIMPLE CONSTRUCTOR
    public Player(Builder builder) {
        name = builder.name;
        team = builder.team;
        height = builder.height;
        salary = builder.salary;;
        phone = builder.phone;;
        twitterAccount = builder.twitterAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTwitterAccount() {
        return twitterAccount;
    }

    public void setTwitterAccount(String twitterAccount) {
        this.twitterAccount = twitterAccount;
    }
    
    

}
