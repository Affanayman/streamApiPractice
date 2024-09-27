import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingToObjs {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
        List<Integer> ages = Arrays.asList(25, 30, 35, 40);
        List<String> emails = Arrays.asList("alice@example.com", "bob@example.com", "charlie@example.com", "diana@example.com");

        List<Person> people = names.stream()
                .map(name -> new Person(name, ages.get(names.indexOf(name)), emails.get(names.indexOf(name)))) // Create Person objects
                .collect(Collectors.toList());
        System.out.println(people);


        List<List<String>> lists=Arrays.asList(Arrays.asList("1","2","3"),Arrays.asList("5","6","7"),Arrays.asList("7","8","9"));
       String listOfList=lists.stream().flatMap(x->x.stream()).collect(Collectors.joining(","));
        System.out.println(listOfList);

        List<Integer> integerList=Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<Boolean,List<Integer>> partitioned=integerList.stream().collect(Collectors.partitioningBy(x->x%2==0));
       List<Integer>even= partitioned.get(true);
        System.out.println(even);



    }
}
