package AdapterPattern;
public class Client {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","horizon");
        audioPlayer.play("vlc","horizon");
        audioPlayer.play("mp4","horizon");
        audioPlayer.play("avi","horizon");
    }
}
