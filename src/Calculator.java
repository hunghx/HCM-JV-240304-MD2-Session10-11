public class Calculator <T> {
    private T obj;

    public Calculator(T obj) {
        this.obj = obj;
    }

    public Integer pow2(){
        if (obj instanceof Integer){
            return (Integer) obj * (Integer) obj;
        }else {
            System.err.println("ko phải sô nguyên"); // bất đồng bộ
            return null;
        }
    }

}
