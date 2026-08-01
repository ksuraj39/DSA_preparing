package OOPS;

public class studentClient {
    public static void main(String[] args) {
        student s = new student();
        s.name = "Kaju";
        s.age = 20;
        s.Intro_yourSelf();
        student s1 = new student();
        s1.name = "raju";
        s1.age = 19;
        s1.Intro_yourSelf();
        s1.sayHey("kamlesh");
    }
}
