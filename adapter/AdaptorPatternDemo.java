/**
 * Type: Structural
 * MediaPlayer
 *      AudioPlayer
 *      MediaAdaptor
 *
 * AdvancedMediaPlayer
 *      VlcPlayer
 *      Mp4Player
 */
public class AdaptorPatternDemo {
    public static void main(String[] args){

        AudioPlayer ap = new AudioPlayer();
        ap.play("mp3", "beyond the game.mp4");
        ap.play("mp4", "alone.mp4");
        ap.play("vlc", "far.mp4");
        ap.play("avi", "mine.mp4");

    }
}
