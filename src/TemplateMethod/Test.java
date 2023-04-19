package TemplateMethod;

public class Test {
    public static void main(String[] args) {
        Tea tea = new Tea();
        System.out.println("Making tea...\n");
        tea.prepare();
    }
}
