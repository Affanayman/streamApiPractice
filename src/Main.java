import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//     List<String> str=new ArrayList<>();
//     str.add("jfbwob");
//     str.add("ibifw");
//     str.stream().map(x->x.startsWith("j")).forEach(System.out::println);


        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);


        List<String> names = Arrays.asList("JOhn", "Jane", "mark", "Alice");
//       String finalName= names.stream().map(x->x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()).collect(Collectors.joining(" "));
//        System.out.println(finalName);


        Map<Integer, List<String>> stringListMap = names.stream().collect(Collectors.groupingBy(x->x.length()));
        for (Map.Entry<Integer, List<String>> entry : stringListMap.entrySet()) {
            System.out.println("Length " + entry.getKey() + ": " + entry.getValue());

        }
    }
}