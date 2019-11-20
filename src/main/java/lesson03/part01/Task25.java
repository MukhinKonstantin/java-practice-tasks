package lesson03.part01;

/**
 * Расставьте минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась.
 *
 * Требования:
 * 1. Раскомментируй строки.
 * 2.	Реализацию и модификаторы доступа методов менять нельзя.
 * 3.	Добавь модификаторы static в нужные места.
 * 4.	В программе должно быть только 4 модификатора static.
 * 5.	Программа должна выводить текст на экран.
 */

public class Task25 {

  private static int step;

  public static void main(String[] args) {
    method1();
  }

  private static void method1() {
    method2();
  }

  private static void method2() {
    new Task25().method3();
  }

  private void method3() {
    method4();
  }

  private void method4() {
    step++;
    for (StackTraceElement element : Thread.currentThread().getStackTrace())
      System.out.println(element);
    if (step > 1)
      return;
    main(null);
  }
}