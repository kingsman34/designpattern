package AdapterPattern;

public class AudioPlayer implements Mediaplayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3"))
            System.out.println("Playing mp3 file "+filename);
        else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,filename);
        }
        else
            System.out.println("Invalid format");
    }
}
