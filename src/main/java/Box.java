import java.util.ArrayList;
import java.util.List;


//3. Большая задача:
public class Box<T extends Fruit> {

//    c. Для хранения фруктов внутри коробки можете использовать ArrayList;
    private List<T> storage = new ArrayList<>();

//    g. Не забываем про метод добавления фрукта в коробку.
    public void addFruit(T fruit) {
        this.storage.add(fruit);
    }

    public List<T> getFuits() {
        return storage;
    }

//    Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного
//    фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
    public float getWeight() {
        int fruitsInBox = storage.size();
        return fruitsInBox == 0 ? 0 : fruitsInBox * storage.get(0).getWeight();
    }

    public void printContent() {
        storage.stream().forEach(System.out::println);
    }


//    f. Написать метод, который позволяет пересыпать фрукты
//    из текущей коробки в другую коробку(помним про сортировку фруктов,
//    нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей
//    коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;

    public void pourToOtherBox(Box<T> otherBox) {
        storage.stream().forEach(f -> otherBox.addFruit(f));
        storage = new ArrayList<>();
    }




    //  Внутри класса коробка сделать метод compare, который позволяет
    //  сравнить текущую коробку с той, которую подадут в compare в качестве параметра,
    //  true - если их веса равны, false в противном случае(коробки с яблоками мы можем
    //  сравнивать с коробками с апельсинами);
    public boolean compareTo(T o) {
        return getWeight() == o.getWeight();
    }

    public static void main(String[] args) {

        System.out.println(new ArrayList<>().size());
    }
}
