package Soal7;
public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Intel i7", "Dell", 16, 10);
        Desktop desktop = new Desktop("AMD Ryzen 5", "HP", 8, "Mid-Tower");
        PersonalKomputer pc = new PersonalKomputer("Intel i9", "Asus", 32, "NVIDIA RTX 3080");
        Server server = new Server("Xeon", "IBM", 64, 4);

        laptop.displaySpec();
        desktop.displaySpec();
        pc.displaySpec();
        server.displaySpec();
    }
}