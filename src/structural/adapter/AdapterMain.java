package structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "aaa.mp3");
        audioPlayer.play("mp4", "bbb.mp4");
        audioPlayer.play("vlc", "ccc.vlc");
        audioPlayer.play("avi", "ddd.vi");

    }
}
