import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        System.out.println("这是一个测试类");
        List list  = new ArrayList<String>();
        list.add("11");
        list.add("22");
        list.add("223");
        list.add("12131");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
                

        

    }
}
