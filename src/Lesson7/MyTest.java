package Lesson7;

public class MyTest {
    @Anno(description = "Запускаем тест 1")
    public static void test1() {
        System.out.println("test1");
    }

    @Anno
    public static void test2() {
        System.out.println("test2");
    }

    @Anno(description = "Запускаем тест 3")
    public static void test3() {
        System.out.println("test3");
    }
}
