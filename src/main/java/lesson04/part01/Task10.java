package lesson04.part01;

import java.util.Set;
import java.util.HashSet;

/**
 * 1. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
 * 2. В методе main удалите одного кота из Set cats.
 * 3. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
 * Каждый кот с новой строки.
 *
 * Требования:
 * 1.	Программа должна выводить текст на экран.
 * 2.	Внутри класса должен быть public static класс Cat с конструктором по умолчанию.
 * 3.	Метод createCats() должен возвращать множество (Set), содержащее 3 кота.
 * 4.	Метод printCats() должен вывести на экран всех котов из множества.
 * Каждый кот с новой строки.
 * 5.	Метод main() должен один раз вызывать метод createCats().
 * 6.	Метод main() должен вызывать метод printCats().
 * 7.	Метод main() должен удалять одного кота из множества котов.
 *
 */

public class Task10 {

  public static void main(String[] args) {
    Set<Cat> cats = createCats();

    for (Cat cat : cats) {
      cats.remove(cat);
      break;
    }

    printCats(cats);
  }

  public static Set<Cat> createCats() {
    Set<Cat> cats = new HashSet<>();
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();
    cats.add(cat1);
    cats.add(cat2);
    cats.add(cat3);
    return cats;
  }

  public static void printCats(Set<Cat> cats) {
    for (Cat x: cats ) {
      System.out.println(x);
    }
  }

  public static class Cat {
    public Cat() {

    }
  }
}
