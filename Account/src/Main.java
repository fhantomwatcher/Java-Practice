public class Main {
    public static void main(String[] args) {
        Account ghost = new Account();

        ghost.setAccountHolderName("Ghost");
        ghost.setAccountNumber(325965592);
        ghost.setBalance(300000);

        ghost.showDetails();
    }
}
