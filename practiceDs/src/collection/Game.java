package collection;

import java.util.HashMap;
import java.util.Map;

public class Game {
    public static void main(String[]args){
        HashMap<String,String[]> hashMap= new HashMap<>();

        String[] top_row = {"ram","ayush","nrupul"};
        String[] bottom_row ={"floyd","leo"};
        String[] middle_row ={"sita","laxman","jaydev","surya"};

        hashMap.put("top_row",top_row );
        hashMap.put("bottom_row",bottom_row );
        hashMap.put("middle_row",middle_row );
        for(Map.Entry<String,String[]> map: hashMap.entrySet()){
            for(int i=0;i<map.getValue().length; i++){
                if (map.getKey().equals("top_row")&& map.getValue()[i].length()>4){
                    System.out.println(map.getValue()[i]);
                }
            }
        }
    }
}
