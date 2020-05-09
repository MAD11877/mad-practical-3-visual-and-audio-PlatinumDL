package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video1 = findViewById(R.id.rabbid);
        video1.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabbid));
        video1.start();

        MediaPlayer mediatest = MediaPlayer.create(this, R.raw.baby_laughing);
        mediatest.start();

    }
}
