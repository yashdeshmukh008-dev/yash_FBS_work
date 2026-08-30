class LibraryUser {
  
    static double finePerDay = 5.0;

   
    String userName;
    int daysLate;

    LibraryUser(String userName, int daysLate) {
        this.userName = userName;
        this.daysLate = daysLate;
    }

    
    double calculateTotalFine() {
        return daysLate * finePerDay;
    }

    public static void main(String[] args) {
        LibraryUser user1 =
                new LibraryUser("Priya", 7);

        System.out.println("User: " + user1.userName);
        System.out.println("Days Late: " + user1.daysLate);
        System.out.println("Total Fine: Rs. " +
                user1.calculateTotalFine());
    }
}
