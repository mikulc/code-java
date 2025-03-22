package com.pudding.polymorphic.polyarr;

/**
 * 多态数组
 * 案例：创建一个Person对象，2个Student和Teacher对象，统一放在数组中，并调用每个对象的say方法
 *
 * @since 2025-03-22
 */
public class PolyArr {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jay", 18);
        persons[1] = new Student("smith", 18, 100);
        persons[2] = new Student("Jerry", 18, 99);
        persons[3] = new Teacher("king", 18, 20000);
        persons[4] = new Teacher("pudding", 36, 24000);

        // 循环遍历，调用say方法
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());  // 动态绑定机制，调用方法会根据 运行类型 来调用

            // 调用Student和Teacher特有的方法
            if (persons[i] instanceof Student) {  // 判断运行类型是否为Student
                Student student = (Student) persons[i];     // 如果是将其由Person强转为Student（向下转型）
                student.study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            } else if (persons[i] instanceof Person) {
            } else {
                System.out.println("你的类型有误");
            }
        }


    }
}
