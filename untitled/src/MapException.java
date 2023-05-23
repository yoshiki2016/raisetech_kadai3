import java.util.HashMap;
import java.util.Map;

public class MapException {
    public static void main(String[] args){
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "山田花子");
        studentMap.put(2, "田中太郎");
        studentMap.put(3, "山本一郎");

        int studentId = 4;
        try {
            if(studentMap.get(studentId)==null){
                throw new ArrayIndexOutOfBoundsException();
            } else {
                System.out.println(studentMap.get(studentId));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("存在しない出席番号です。");
        }
    }
}
