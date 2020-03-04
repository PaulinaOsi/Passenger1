package ie.gmit;
public class Passenger {

    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;


    public Passenger() {
        this.title = "";
        this.name = "";
        this.id = "";
        this.phone = "";
        this.age = 0;
    }

    public Passenger(String title, String name, String id, String phone, int age) {
        this.title = title;
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.equalsIgnoreCase("Mr")||title.equalsIgnoreCase("Mrs")||title.equalsIgnoreCase("Ms")){
            this.title = title;
        }
        else{
            System.out.println("title must be Mr, Mrs, or Ms");
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<3){
            System.out.println("name too short");
            throw new IllegalArgumentException();
        }else{
            this.name = name;
        }

    }

    public String getId() {
        return id;

    }

    public void setId(String id) {
        if(id.length()<10){
            System.out.println("id too short");
            throw new IllegalArgumentException();
        }else{
            this.id = id;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone.length()<10){
            System.out.println("phone too short");
            throw new IllegalArgumentException();
        }
        else{
            this.phone = phone;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<16){
            System.out.println("age too short");
            throw new IllegalArgumentException();
        }else{
            this.age = age;
        }
        this.age = age;

    }
}
