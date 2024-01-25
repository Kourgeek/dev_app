public class MedicineFactory {
    public Medicine createMedicine(MedicineType mtype){
        Medicine medicine = null;

        switch (mtype) {
            case TABLETKI:
                medicine =  new Tabletki();
                break;
            case NASTOYKI:
                medicine = new Nastoyki();
                break;
            case TRAVKI:
                medicine =  new Travki();
                break;
        }

        return medicine;
    }
}
