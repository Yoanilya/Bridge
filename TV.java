package Bridge;

public class TV implements Dispositivo {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("TV encendida");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("TV apagada");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent > 100) {
            volume = 100;
        } else if (percent < 0) {
            volume = 0;
        } else {
            volume = percent;
        }
        System.out.println("TV volumen: " + volume + "%");
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = Math.max(1, channel);
        System.out.println("TV canal: " + this.channel);
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| Dispositivo: TV");
        System.out.println("| Estado: " + (on ? "Encendida" : "Apagada"));
        System.out.println("| Volumen actual: " + volume + "%");
        System.out.println("| Canal actual: " + channel);
        System.out.println("------------------------------------");
    }
}
