public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel Core i9", 32)
                .storage(2000)
                .gpu("NVIDIA RTX 4090")
                .wifiEnabled(true)
                .bluetoothEnabled(true)
                .build();

        System.out.println(gamingPC);

        Computer officePC = new Computer.Builder("Intel Core i5", 16)
                .storage(512)
                .gpu("Integrated")
                .wifiEnabled(true)
                .bluetoothEnabled(false)
                .build();

        System.out.println(officePC);

        Computer godzillaPc = new Computer.Builder("Ryzen 7 9800X3D", 32)
                .storage(2000)
                .gpu("GeForce RTX 5090")
                .wifiEnabled(true)
                .bluetoothEnabled(true)
                .build();
        System.out.println(godzillaPc);
    }
}