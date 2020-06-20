package EnumPrzyklad2;

public enum Role {
    ADMIN(10),
    SALES_MENAGER (8){
        public boolean isSalesManager(){return true;}
    },
    CLERK(5),
    CLIENT(1);

    //pole
    private int leveOfImportance;

    // konstruktor
    Role (int leveOfImportance){this.leveOfImportance=leveOfImportance;}

    public int getLeveOfImportance() {
        return leveOfImportance;
    }

    public boolean isSalesManager(){return false;}


}
