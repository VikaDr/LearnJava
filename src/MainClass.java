import libs.ArrayTwoDim;
import libs.LibClass;
import libs.WorkWithArray;
//import libs.WorkWithList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static libs.LibClass.*;

public class MainClass {
    public static void main(String[] arg) { //arg - nazvanie peremennoi
        System.out.println("Hello !");
        sum(5, 10);
        sum(15, 20); //LibClass.sum(15,20) identichno
        sum("Test", "123");
        sum("777", 5);

        System.out.println(sum(5, "8a9"));

        LibClass libClass;
        libClass = new LibClass();
        libClass.multiplication(2, 3); // k nestaticheskim obrashchaemsja 4erez ob'ect

        multiplication2(25, 35);

        System.out.println(division(-40, 0));

        LibClass libClass1;
        libClass1 = new LibClass();
        libClass1.division(26, 4.25);

        division(2.129, 0);

        try {
            libClass.div((byte) 2, (byte) 0);
        } catch (ArithmeticException e) {
            System.out.println("Error in main");
        }
        System.out.println("test");

        int[] ourArray = {2, 4, 26, 7, 28, 10, 9, 20, 33};
        System.out.println(ourArray[5] + ourArray[6]);

        WorkWithArray workWithArray = new WorkWithArray();
        workWithArray.printArray(ourArray);

        int[] secondArray = {3,5};
        workWithArray.printArray(secondArray);

        int[] thirdArray= new int[10];
        thirdArray[0]=1;

        workWithArray.comparisonArrayWithValue(10, ourArray);



        List<String> ourList;
        ourList = new ArrayList();

        ourList.add("test");
        ourList.add("test1");
        System.out.println(ourList);
        System.out.println(ourList.get(1));

        for (int i = 0; i < ourList.size(); i++) {
            System.out.println(ourList.get(i));
        }

        for (String elementOfList:ourList
             ) {
            System.out.println(elementOfList);
        }

        List<List<String>> ourListList = new ArrayList<>();
        ourListList.add(ourList);
        System.out.println(ourListList);
        ourListList.add(ourList);
        System.out.println(ourListList);
        ourListList.get(1).add("test33");
        System.out.println(ourListList);

        List<String> ourList1 = new ArrayList<>();
        ourList1.add("test");
        ourList1.add("test1");
        ourList1.add("test33");
        System.out.println(ourList == ourList1);
        System.out.println(ourList.equals(ourList1));


        Map<String,String> ourMap = new HashMap<>();
        ourMap.put("login", "test1");
        ourMap.put("login", "test2");
        System.out.println(ourMap.get("login"));
        System.out.println("size = " + ourMap.size());
        ourMap.put("password","pass1");
        System.out.println(ourMap);
        ourMap.put("password2", "pass2");
        System.out.println(ourMap);

        List<Map<String,String>> ourListOfMaps = new ArrayList<>();
        ourListOfMaps.add(ourMap);
        System.out.println(ourListOfMaps);
        System.out.println(ourMap.get("login"));


        ArrayTwoDim.twoArray(2,2);//создаем два метода, в первом методе создаем матрицу, во втором подаем ее на вход
        ArrayTwoDim.arrayChange(1, ArrayTwoDim.twoArray(2,2));

//        WorkWithList workWithList = new WorkWithList();



    }
}

//1. метод который создает пустой список, 2. метод добавляет пустую строку, 3. метод который заполняет данными. Всюду стринг.
//