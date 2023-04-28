package collection;
import java.util.*;

public class ListPractice {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        System.out.println("名前を入力してください");

        while (true){
            var sc = new Scanner(System.in);
            var name = sc.nextLine();
            if (name.equals("exit")){
                break;
            }
            list.add(name);
        }
        System.out.println("最初に入力された人：" + list.get(0));
        System.out.println("最後に入力された人：" + list.get(list.size() - 1));

        System.out.println("名前で並び替えます");
        Collections.sort(list);
        for (var i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}
