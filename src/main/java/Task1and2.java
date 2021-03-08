import java.util.ArrayList;
import java.util.List;

//файл для заданий номер 1 и 2
public class Task1and2<T extends Object> {


    //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public void swap(T[] input, int elem1Idx, int elem2Idx){
       T temp = input[elem1Idx];
       input[elem1Idx] = input[elem2Idx];
       input[elem2Idx] = temp;
    }



    //2. Написать метод, который преобразует массив в ArrayList;
    public static <T>  List<T> asList(T[] array) {

        List<T> list = new ArrayList<>(array.length);
        for (T element: array){
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
