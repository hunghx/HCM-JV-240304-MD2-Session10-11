import java.util.*;

public class MyCollection {
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

    }
}
