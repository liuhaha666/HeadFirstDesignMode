package ss.pt;

public class Customer {
    //id 属性
    private Long id;
    //name 属性
    private String name;
    //age 属性
    private int age;

    public Customer() {}

    public Customer(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }

}