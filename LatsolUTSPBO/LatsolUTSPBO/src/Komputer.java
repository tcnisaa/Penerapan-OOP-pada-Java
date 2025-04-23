abstract class Komputer {
    String processor;
    String merk;
    int memory;

    // Constructor
    public Komputer(String processor, String merk, int memory) {
        this.processor = processor;
        this.merk = merk;
        this.memory = memory;
    }

    // Method abstract untuk diimplementasikan oleh kelas turunan
    abstract void displaySpec();
}

class Laptop extends Komputer {
    int batteryLife;

    // Constructor
    public Laptop(String processor, String merk, int memory, int batteryLife) {
        super(processor, merk, memory);
        this.batteryLife = batteryLife;
    }

    @Override
    void displaySpec() {
        System.out.println("Laptop -> Processor: " + processor + ", Merk: " + merk + ", Memory: " + memory + "GB, Battery Life: " + batteryLife + " hours");
    }
}

class Desktop extends Komputer {
    String formFactor;

    public Desktop(String processor, String merk, int memory, String formFactor) {
        super(processor, merk, memory);
        this.formFactor = formFactor;
    }

    @Override
    void displaySpec() {
        System.out.println("Desktop -> Processor: " + processor + ", Merk: " + merk + ", Memory: " + memory + "GB, Form Factor: " + formFactor);
    }
}

class PersonalKomputer extends Komputer {
    String GPU;

    public PersonalKomputer(String processor, String merk, int memory, String GPU) {
        super(processor, merk, memory);
        this.GPU = GPU;
    }

    @Override
    void displaySpec() {
        System.out.println("Personal Komputer -> Processor: " + processor + ", Merk: " + merk + ", Memory: " + memory + "GB, GPU: " + GPU);
    }
}

class Server extends Komputer {
    int storageCapacity;

    public Server(String processor, String merk, int memory, int storageCapacity) {
        super(processor, merk, memory);
        this.storageCapacity = storageCapacity;
    }

    @Override
    void displaySpec() {
        System.out.println("Server -> Processor: " + processor + ", Merk: " + merk + ", Memory: " + memory + "GB, Storage: " + storageCapacity + "TB");
    }
}