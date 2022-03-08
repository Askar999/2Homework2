package com.company;

public class Main {

    public static void main(String[] args) {
	Printable printable[] = {createObject("1object") , createObject("2object"),
            createObject("3object") };
        for (Printable printable1: printable) {
            printable1.print();
        }
    }
    public static  Printable createObject(String className) {
        switch (className) {
            case "1object":
                Dog dog = new Dog(5 , "Rex" , 50);
                return  dog;

            case "2object":
                Cat cat = new Cat(3,"Mir", 20);
                return cat;

            case"3object":
                Fish fish = new Fish(3,"Bloob", 900);
                return fish;
        }
        return null;
    }
}
/*Дедлайн до следующего урока

e) В классе Main создать возвращаемый метод createObject(String className),
который умеет создавать объекты класса 2й, 3й и 4й и после создания и задания свойств объекту
метод возвращает ссылку на объект (пульт). Можно использовать switch для того чтоб определить
какого типа нужно создать экземпляр объекта. Например если в параметре передается “2й” метод должен
создать объект именно этого типа.
f) В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createOcject,
 и распечатать по ним информацию методом print();*/