public class Main {
    public static void main(String[] args) {
        MedicineFactory medicineFactory = new MedicineFactory();
        Medicine medicine1 = medicineFactory.createMedicine(MedicineType.TABLETKI);
        Medicine medicine2 = medicineFactory.createMedicine(MedicineType.TRAVKI);
        Medicine medicine3 = medicineFactory.createMedicine(MedicineType.NASTOYKI);

        medicine1.printMedInfo();
        medicine2.printMedInfo();
        medicine3.printMedInfo();

        medicine1.set_amount(1);
        System.out.println(medicine1.get_amount());
        medicine2.set_amount(2);
        System.out.println(medicine2.get_amount());
        medicine3.set_amount(3);
        System.out.println(medicine3.get_amount());

        medicine1.changeAmount(5);

        Observer Sub = new Subscriber();

        medicine1.addObserver(Sub);

        medicine1.changeAmount(5);
        medicine1.changeAmount(0);

        medicine1.removeObserver(Sub);
        System.out.println("Удалили наблюдателя");
        medicine1.changeAmount(100);

        System.out.println("Это сообщение свидетельствует о том, что на складе изменилось количество товара, а вы об этом не знаете, товара " + medicine1.get_amount() + " штук ");


    }
}
