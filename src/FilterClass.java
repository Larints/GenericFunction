import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterClass<T, R> {

    private List<T> list;

    public FilterClass() {
        list = new ArrayList<>();
    }

    public List<R> filter(List<T> list, Filter<T, R> filterFunction) {
        return list.stream()
                .map(filterFunction::apply)
                .collect(Collectors.toList());
    }
}
