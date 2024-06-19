import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Collection - bộ sưu tập, danh sách
        // Hạn chế của sử dụng mảng
        // Bản chất của Collection : tập các Class và Interface cung cấp các phương giúp thao tác , quản lí các phần tử dễ dàng hơn
        // Cấu trúc dữ liệu : mảng ,  liên kết , bản đồ

        // Generic : tham số cho kiểu dữ liệu , chỉ áp dunụng với kiểu dữ liệu references
//        T – Type
//• E – Element
//• K – Key
//• N – Number
//• V - Value

        printObj(2); // T là Integer
        printObj("hung"); // T là String

        // khởi tạo đô tượng tu lơp Generic
        Calculator<Integer> calculator1 = new Calculator<>(3);
        Calculator<String> calculator2 = new Calculator<>("3");
        System.out.println(calculator1.pow2()); // in ra 9
        System.out.println(calculator2.pow2()); // in ra null

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2024,6,18);

        System.out.println(compare(date1,date2));
        System.out.println(compare(9,10));

    }
    public static <T> void printObj(T obj){
        System.out.println(obj);
    }

    public static <T extends  Comparable<T>>  boolean compare(T a, T b){ // Comparator/ Comparable
        return a.compareTo(b) > 0;
    }
    public static Calculator<? extends Number> create(){ // ki tự wildcard
        return new Calculator<>(5);
    }
}