public class Main {
    public static void main(String[] args) {
        System.out.println("i did it!!! i guess...");

        System.out.println("HomeWork-26 №1 *age* :");

        int age = 25; {System.out.println("age: "+ age);}
        if (age < 0) {
            System.out.println("wrong age");
        }
        else if (age < 18)
        {
            System.out.println("juvenile");
        }
        else {
            System.out.println("adult");
        }

        { System.out.println("HomeWork-26 №2 *salary* :");}

        int experience = 4;
        int salary = 3000;
        double summa;
        {
            System.out.println("years at the company: "+ experience);
            System.out.println("salary: "+ salary+" tygrukiv");
        }

        if (experience < 3)
            summa = (salary * 1.1);
        else summa = (salary * 1.2);
        if (summa < 4000) {
            System.out.println("may hope on - " + summa + " tygrukiv");
            System.out.println("bonus + 1000 tygrukiv");
        }
        else {
            System.out.println("may hope on - " + summa + " tygrukiv");
            System.out.println("bonus + 500 tygrukiv");
        }

        { System.out.println("HomeWork-26 №3 *summa 1-50* :");
            int start = 1;
            int finish = 50;
            int summa_num = (1+finish)*finish/2;
            {
                System.out.println("summa 1-"+finish+" = "+ summa_num);    }
        }
    }
}