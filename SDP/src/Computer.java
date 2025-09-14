public class Computer {
    private final String cpu;         // Required
    private final int ram;            // GB
    private final int storage;        // GB
    private final String gpu;         // Optional
    private final boolean wifiEnabled;
    private final boolean bluetoothEnabled;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.wifiEnabled = builder.wifiEnabled;
        this.bluetoothEnabled = builder.bluetoothEnabled;
    }

    public static class Builder {
        private final String cpu;
        private final int ram;
        private int storage = 256;
        private String gpu = "Integrated";
        private boolean wifiEnabled = true;
        private boolean bluetoothEnabled = true;

        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder wifiEnabled(boolean wifiEnabled) {
            this.wifiEnabled = wifiEnabled;
            return this;
        }

        public Builder bluetoothEnabled(boolean bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Computer [CPU=%s, RAM=%dGB, Storage=%dGB, GPU=%s, WiFi=%s, Bluetooth=%s]",
                cpu, ram, storage, gpu, wifiEnabled, bluetoothEnabled
        );
    }
}