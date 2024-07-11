
//    Практическое задание - Collection - фильтрация
//    Напишите метод filter, который принимает на вход массив любого типа,
//    вторым арументом метод должен принимать клас, реализующий интерфейс Filter,
//    в котором один метод - Object apply(Object o).
//    Метод должен быть реализован так чтобы возращать новый масив,
//    к каждому элементу которого была применена функция apply

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        FilterClass<Integer, Integer> filterClass = new FilterClass<>();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> incrementedNumbers = filterClass.filter(numbers, number -> number + 10);
        System.out.println(incrementedNumbers);
    }




}
