public class Person{
//    @Override
//    public int compareTo(Person that) {
//        // sắp xếp theo id tăng dần
//        // nếu đối tượng này có id nh hơn đối tượng thì return về 1 só > 0
//        // nếu đối tượng này có id lớn hơn đối tượng thì return về 1 só < 0
//        // còn lại return về 0
//        return that.id - this.id;
//    }

    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
