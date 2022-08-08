package buoi4;

// Con tro this
// Nap chong phuong thuc
// Quan he HAS-A

public class Main {
    public static void main(String[] args) {
//        A b = new A();
//
//        System.out.println(b.sum(1,2));
//        System.out.println(b.sum(3.4, 5.6, 2.3));
//        System.out.println(b.sum(1, 2, 3));

//        Student s = new Student();
//        s.input();
//        s.output();

        Student []student = new Student[2];

        for(int i = 0; i < 2; i++){
            student[i] = new Student[];
            student[i].input();
        }

        for(int i = 0; i < 2; i++){
            student[i].output();
        }



    }
}
