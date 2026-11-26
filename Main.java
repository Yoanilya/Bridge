package Bridge;

public class Main {
    public static void main(String[] args) {
        // Combinación 1: Control básico con Radio
        System.out.println("=== Control Básico con Radio ===");
        ControlRemoto control1 = new ControlRemotoBasico(new Radio());
        probarControlRemoto(control1);

        // Combinación 2: Control avanzado con TV
        System.out.println("\n=== Control Avanzado con TV ===");
        ControlRemotoAvanzado control2 = new ControlRemotoAvanzado(new TV());
        probarControlRemoto(control2);
        control2.mute();
        control2.printDeviceStatus();

        // Combinación 3: Control básico con TV
        System.out.println("\n=== Control Básico con TV ===");
        ControlRemoto control3 = new ControlRemotoBasico(new TV());
        probarControlRemoto(control3);

        // Combinación 4: Control avanzado con Radio
        System.out.println("\n=== Control Avanzado con Radio ===");
        ControlRemotoAvanzado control4 = new ControlRemotoAvanzado(new Radio());
        probarControlRemoto(control4);
        control4.record();

        // Extensión 1: Nuevo dispositivo (Projector) con Control Avanzado
        System.out.println("\n=== Control Avanzado con Projector ===");
        ControlRemotoAvanzado control5 = new ControlRemotoAvanzado(new Projector());
        probarControlRemoto(control5);
        control5.mute();
        control5.printDeviceStatus();

        // Extensión 2: Nuevo control (ControlRemotoVoz) con Projector
        System.out.println("\n=== Control por Voz con Projector ===");
        ControlRemotoVoz controlVoz = new ControlRemotoVoz(new Projector());
        controlVoz.ejecutarComandoVoz("encender");
        controlVoz.ejecutarComandoVoz("subir volumen");
        controlVoz.ejecutarComandoVoz("siguiente canal");
        controlVoz.printDeviceStatus();
        controlVoz.ejecutarComandoVoz("apagar");
    }

    public static void probarControlRemoto(ControlRemoto control) {
        control.togglePower(); // Encender
        control.volumeUp();
        control.channelUp();
        control.volumeDown();
        control.printDeviceStatus();
        control.togglePower(); // Apagar
    }
}
