public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int sales[]=new int[] {20, 60, 120, 30, 200};
        SalesManager salesManager = new SalesManager(sales);
        int max =  salesManager.max();
        int min = salesManager.min();
        int average =  salesManager.average();
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);

    }
}