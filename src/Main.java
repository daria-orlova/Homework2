// Тема: Переменные
public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("ЗАДАЧА #1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("значение dog = " + dog);
        System.out.println("значение cat = " + cat);
        System.out.println("значение paper = " + paper);

        // Задача 2
        System.out.println("ЗАДАЧА #2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("значение dog = " + dog);
        System.out.println("значение cat = " + cat);
        System.out.println("значение paper = " + paper);

        // Задача 3
        System.out.println("ЗАДАЧА #3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("значение dog = " + dog);
        System.out.println("значение cat = " + cat);
        System.out.println("значение paper = " + paper);

        // Задача 4
        System.out.println("ЗАДАЧА #4");
        var friend = 19;
        System.out.println("значение friend = " + friend);
        friend = friend + 2;
        System.out.println("значение friend = " + friend);
        friend = friend / 7;
        System.out.println("значение friend = " + friend);

        // Задача 5
        System.out.println("ЗАДАЧА #5");
        var frog = 3.5;
        System.out.println("значение frog = " + frog);
        frog = frog * 10;
        System.out.println("значение frog = " + frog);
        frog = frog / 3.5;
        System.out.println("значение frog = " + frog);
        frog = frog + 4;
        System.out.println("значение frog = " + frog);

        // Задача 6
        System.out.println("ЗАДАЧА #6");
        var weight1 = 78.2;
        var weight2 = 82.7;
        var totalWeight = weight1 + weight2;
        System.out.println("общая масса бойцов " + totalWeight + " кг");
        var weightDifference = weight2 - weight1;
        System.out.println("разница в массе бойцов " + weightDifference + " кг");

        // Задача 7
        System.out.println("ЗАДАЧА #7");
        weightDifference = weight2 - weight1;
        System.out.println("разница масс путем вычитания равна " + weightDifference + " кг");
        weightDifference = weight2 % weight1;
        System.out.println("разница масс путем остатка от деления равна " + weightDifference + " кг");

        // Задача 8
        System.out.println("ЗАДАЧА #8");
        var totalTime = 640;
        var employeeTime = 8;
        var employees = totalTime / employeeTime;
        System.out.println("всего сотрудников в компании - " + employees + " человек");
        employees = employees + 94;
        totalTime = employees * 8;
        System.out.println("если в компании работает " + employees + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");
    }
}

