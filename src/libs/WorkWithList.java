package libs;

import java.util.ArrayList;
import java.util.List;

public class WorkWithList extends WorkWithListAbstract {
    @Override
    public List <List <String>> addNewList(List <List <String>> ourList) {    //сигнатура метода, List деларативное заявление
        ourList.add(new ArrayList <>()); //ArrayList содержит методы по работе с List
        printListList(ourList);
        return ourList;
    }

    @Override
    public List <List <String>> addValueToListList(int numberOfList, String value, List <List <String>> ourList) {
        try {
            ourList.get(numberOfList).add(value);  //список дай мне какую-то строку и добавь в нее значение
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        printListList(ourList);
        return ourList;
    }

    @Override
    void printListList(List <List <String>> ourList) {
        System.out.println("----------------");
        for (List <String> listForPrint : ourList) { //возьми со списка ourList и записывай его в listForPrint и выполни блок цикла
            System.out.println(listForPrint);
        }
    }

}
