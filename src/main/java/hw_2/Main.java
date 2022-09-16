package hw_2;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new SimpleArrayList<>(0);

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(11);

        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(arrayList.get(2));

        System.out.println(arrayList.contains(8));

        arrayList.remove(8);

        System.out.println(arrayList.contains(8));

        System.out.println(arrayList);

        arrayList.set(0, 1000000);

        System.out.println(arrayList);

        arrayList.clear();

        System.out.println(arrayList);
    }
}
