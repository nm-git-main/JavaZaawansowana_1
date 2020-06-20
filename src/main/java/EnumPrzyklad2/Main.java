package EnumPrzyklad2;

public class Main {
    public static void main(String[] args) {
        Role role=Role.ADMIN;
        System.out.println(role.isSalesManager());
        System.out.println(role.getLeveOfImportance());
    }
}
