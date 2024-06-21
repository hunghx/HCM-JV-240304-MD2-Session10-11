import java.util.*;

public class MyCollection {
    private  static  int a = 10;
    public static void main(String[] args) {
        // Collection Interface : khởi tạo dối tượng thông qua các lớp triển khai  ()
        Collection<Integer> arrInt = new ArrayList<>();
        // thêm mới
        arrInt.add(1);
        arrInt.add(3);
        arrInt.add(2);
        Collection<Integer> arrIntFake = new ArrayList<>();
        // thêm mới
        arrIntFake.add(7);
        arrIntFake.add(8);
        arrIntFake.add(9);

        // hiển thị
        System.out.println(arrInt);
        // thêm nhiều
        arrInt.addAll(arrIntFake);
        System.out.println(arrInt);
        // xóa phần tử
        arrInt.remove(3);
        System.out.println(arrInt);
        // kiểm tra tồn tại

        boolean isExist = arrInt.contains(2);
        System.out.println(isExist);

        // kích thước danh sách
        System.out.println(arrInt.size());
        // kiểm tra rỗng
        System.out.println(arrInt.isEmpty());
        // duyệt colection
        for (Integer element : arrInt){
            System.out.println(element);
        }
        // duyệt theo iterator
        Iterator<Integer> iterator = arrInt.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // List kế thừa interface Collection : ArrayList và LinkedList
        // cung cấp các thao tác làm việc với index
        List<String> list = new ArrayList<>();
//        List<String> linked = new LinkedList<>(list);
        // thêm mới
        list.add(0,"Khánh");
        list.add(1,"Hùng");
        list.add(0,"Hùng");
        list.add(0,"Sơn");
        list.add(2,"Đức");
        System.out.println(list); // Sơn,Khanh,Đưc,Hung
        // xóa
//        list.remove();
        System.out.println(list);
        // lấy ra
        System.out.println(list.get(2));

        // lấy vị trí
        System.out.println(list.lastIndexOf("Hùng"));
        // thay đổi giá trị
        list.set(1,"Nam");
        System.out.println(list);


        // Set : giống List nhưng không trùng lặp phần tu

//        Set<String> setString = new HashSet<>(); // sự dụng để quản li dữ liệu đơn giản, thứ tự lưu trữ ko có qui tắc
        // Set<String> setString = new LinkedHashSet<>(); // sử dụng cấu trúc liên kết, thứ tự lưu trữ theo thứ tự thêm vào
        Set<String> setString = new TreeSet<>(); // sử dụng cấu trúc cây, thứ tự lưu trữ theo qui tắc comparable hoặc comparator, hỗ trợ bai toán tìm kiếm
        setString.add("hung");
        setString.add("sơn");
        setString.add("nam");
        setString.add("hung"); // ko đc thêm vào
        System.out.println(setString);

        TreeSet<Person> personTreeSet = new TreeSet<>(new PersonComparator());
        personTreeSet.add(new Person(1,"Nam"));
        Person p2 = new Person(2, "Anh");
        personTreeSet.add(p2);
        personTreeSet.add(new Person(3,"Khánh"));
        System.out.println(personTreeSet);
        // tim đối tượng gần nhất với p2 nhưng nhỏ hơn p2
        System.out.println(personTreeSet.higher(p2));


        //  queue : hàng đợi : fisrt in fisrt out : FIFO

        // thêm mới phần tử

        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new LinkedList<>();
        Queue<String> queue3 = new PriorityQueue<>();


        queue1.offer("My");
        queue1.add("Tính");
        queue1.add("Sang");
        queue1.add("Hùng");
        queue1.add("Trân");

//        // lây ra
//        System.out.println(queue1.peek()); // lấy nhưng ko xóa
//        // xóa
//        queue1.remove();
//        System.out.println(queue1.peek()); // lấy nhưng ko xóa
//        // xóa
//        queue1.remove();
//        System.out.println(queue1.peek()); // lấy nhưng ko xóa
//        // xóa
//        queue1.remove();
//        System.out.println(queue1.peek()); // lấy nhưng ko xóa
//        // xóa
//        queue1.remove();
//        System.out.println(queue1.peek()); // lấy nhưng ko xóa
//        // xóa
//        queue1.remove();
//
        // duyệt queue
        while (!queue1.isEmpty()){
            // lấy và xóa
            String element = queue1.poll();
            System.out.println(element);
        }
//        queue1.remove(); // ném ngoại lệ
//        queue1.element(); // ném ngoại lệ

        // Stack : Ngăn xếp : LIFO , ba chất giống ArrayList nhưng hỗ trợ đa luồng

        // các phương thức
        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(3);
        stack.add(4);
        stack.add(2);
        stack.add(0);
        System.out.println(stack);
        // lấy ra
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        stack.push(10);
        stack.push(11);
        stack.peek(); // 10 ko xóa
        int index = stack.search(5);
        System.out.println(index);
    }
}
