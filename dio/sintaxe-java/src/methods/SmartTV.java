package methods;

public class SmartTV {
    private boolean on = false;
    private int channel;
    private int volume;

    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void ligar() {
        this.on = true;
    }

    public void desligar() {
        this.on = false;
    }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    public void mudarCanal(int canal) {
        this.channel = canal;
    }

    public void mudarProximoCanal(){
        this.channel++;
    }

    public void mudarCanalAnterior() {
        this.channel--;
    }

    @Override
    public String toString() {
        return "SmartTV [on=" + on + ", channel=" + channel + ", volume=" + volume + "]";
    }
    
}
