public class CopenhagenMarathon {
    public static void main(String[] args) {
        confirm("peter Adams", 1556, 'D');
        confirm("Omar Farooq", 1699, 'D');
        confirm("Lotte Nybo", 843, 'B');


    }
// static void confirm er vores nye metode
    static void confirm(String name, int number, char group){
        System.out.println(" Dear " +name+ "! ");
        System.out.println(" We are happy to receive your registration. ");
        System.out.println(" Your start number is: " +number);
        System.out.println(" You start in start group: " +group);
        System.out.println(" Please check in 10 minutes before start. ");

        System.out.println();

    }
}
