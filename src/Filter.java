public interface Filter<T,R> {

    R apply(T value);
}
