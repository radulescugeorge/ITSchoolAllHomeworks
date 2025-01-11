package exercitii;

public class Customers {
    private String name;
    private String city;
    private int age;
    private int amount;
    private boolean isBusiness;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        if (age < 18){
            System.out.println("Customer must be above 18 to buy a car.");
            return  0;
        } else {
            return age;
        }
    }

    public int getAmount() {
        if(amount < 1){
            System.out.println("Customer must have money to buy car.");
            return 0;
        } else{
            return amount;
        }
    }

    public boolean isBusiness() {
        return isBusiness;
    }

    private Customers() {
    }

    public Customers(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setBusiness(boolean business) {
        isBusiness = business;
    }

    public Customers(String name, String city, int age, int amount, boolean isBusiness) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.amount = amount;
        this.isBusiness = isBusiness;
    }

    public void showCustomerDetails() {
        System.out.println("Custmer details : " + " " + name + " from " + city + " of age: " + age + " has money : " + amount + " is business ? " + isBusiness);
    }
}
