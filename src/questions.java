public class questions {
    public static void main(String[] args) {
        System.out.println("Вопрос 1"); // String
        String name = "Maria";
        String surname = "Zhidkova";
        String full = name + " " + surname;
        System.out.println(full);

        System.out.println("Вопрос 2"); // == or equals
        int a= 4;
        int b = 2;
        boolean c = a == b;
        System.out.println(c);
        System.out.println(name.equals(surname));


        System.out.println("Вопрос 3"); // return
        int x = sum(1, 2, 3);
        System.out.println(x);
        time(26);
        time(10);

    }
    static int sum(int z, int i, int v){
        return z+i+v;
    }
    static void time(int hour) {
        if (hour >  24 || hour < 0)
            return;
        if (hour <=12)
            System.out.println("Day");
        else System.out.println("Night");
    }



}