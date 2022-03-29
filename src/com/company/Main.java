package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        Integer xx = 999;

        integerList.add(1);
        integerList.add(100);
        integerList.add(40);
        integerList.add(xx);

        System.out.println(integerList);
        System.out.println("MAX:" + Collections.max(integerList));

        for(Integer x : integerList) {
            System.out.print(x + " ");
        }

        integerList.remove(1);
        System.out.println(integerList);

        integerList.remove(xx);
        System.out.println(integerList);

        System.out.println();
        List<Integer> secondList = new ArrayList<>();
        secondList.add(1);
        secondList.add(2);
        System.out.println(secondList);
        secondList.remove(Integer.valueOf(2));
        System.out.println(secondList);

        // listy niegeneryczne - nie wymagaja aby elementy w niej przechowywane byly tego samego typu
        // jest to zla praktyka, lepiej nie korzystac
        List niegenerycznaLista = new ArrayList();
        niegenerycznaLista.add(1);
        niegenerycznaLista.add("dupa");
        System.out.println(niegenerycznaLista);

        /*
        ArrayList
        1) Przechowuje elementy w dynaminczej tablicy - nie podajemy jej rozmiary
        2) Dane są zapisywane w pamieci "obok siebie" -> na stercie (ang heap)
        3) Operacja wyjecia jest szybsza niz na LinkedList, ale usuniecie jest wolniejsze
         */

        List<String> imiona = new ArrayList<>();
        imiona.add("Tomek");
        imiona.add("Jan");
        System.out.println(imiona);

        imiona.addAll(Arrays.asList("Jan2", "Tomek2"));
        System.out.println(imiona);
        imiona.addAll(List.of("Jan3", "Tomek3"));
        System.out.println(imiona);

        System.out.println(imiona.size());
        System.out.println(imiona.get(2));

        for(int i = 0; i < imiona.size(); ++i) {
            System.out.print(imiona.get(i) + " ");
        }

        Iterator<String> iterator = imiona.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Czy Tomek jest w kolekcji? " + imiona.contains("Tomek"));
        imiona.remove(0);
        System.out.println(imiona);
        imiona.removeAll(Arrays.asList("Jan", "Jan2"));
        System.out.println(imiona);

        System.out.println("Czy kolekcja jest pusta? " + imiona.isEmpty());
        System.out.println("Indeks Tomek2 " + imiona.indexOf("Tomek2"));
        imiona.add("Tomek2");
        System.out.println(imiona);

        System.out.println("Indeks ostatniego wystapienia Tomek2: " + imiona.lastIndexOf("Tomek2"));
        imiona.set(3, "Tomek22");
        System.out.println(imiona);

        String kolekcja = imiona.toString();
        System.out.println(kolekcja.charAt(0));

        System.out.println(imiona.getClass());
        System.out.println(imiona.getClass().getSimpleName());

        System.out.println(imiona);
        System.out.println(imiona.subList(0, 2));
        System.out.println(imiona);

        Object[] objects = imiona.toArray();
        for(Object o : objects) {
            System.out.print(o + " ");
        }

        //imiona.clear();
        //System.out.println(imiona);

        System.out.println(imiona.equals(imiona));

        /*
        LinkedList
        1) Przechwouje wenetrznie elemnty opakowane w obiekty ktore wskazuja na element poprzedni i nastepny
        2) Dane w pamieci sa zapisywane w sposob rozproszony
        3) patrz punkt 3 przy arraylist
         */

        List<String> nazwiska = new LinkedList<>();
        nazwiska.addAll(List.of("Kowalski ", "Nowak"));

        List<String> nazwiska2 = new LinkedList<>();
        nazwiska2.addAll(List.of("Kowalski", "Nowak"));

        System.out.println(nazwiska.equals(nazwiska2));


        Set<Integer> zbior = new HashSet<>();
        zbior.addAll(Arrays.asList(1, 2, 3, 1, 11, 5));
        System.out.println(zbior);

        Map<Integer, String> testMap = new HashMap<>();
        testMap.put(1, "test1");
        testMap.put(100, "test2");
        testMap.put(3, "test3");
        testMap.put(5, "test2");
        testMap.put(3, "test13");
        System.out.println(testMap);
    }
    // podmiana dwoch elementow
}
