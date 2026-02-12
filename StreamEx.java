import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


//Streams used for single use or access
//provides lot of methods like filter(),map(),reduce(),sorted() etc..
public class StreamEx {
    public static void main(String[] args) {
        List<Integer> ls=Arrays.asList(2,5,8,4);

        Stream<Integer> s1=ls.stream();
        Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s3=s2.map(n->n*2);
        int result=s3.reduce(0,(c,e)->c+e);
        int res=ls.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);
        System.out.println(result);

    }
}
