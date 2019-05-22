package demo;

public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("特长生招募");
        Student student = new Student() {
            @Override
            public void javaStudy() {
                System.out.println("我是一名Java大神");
            }
        };
        student.javaStudy();
        Student student1 = new Student() {
            @Override
            public void playBssketball() {
                System.out.println("我篮球打得好");
            }

            @Override
            public void playFootball() {
                System.out.println("我足球也踢得好");

            }
        };
        student1.playBssketball();
        student1.playFootball();

    }
}
