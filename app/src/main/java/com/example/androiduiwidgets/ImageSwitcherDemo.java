package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class ImageSwitcherDemo extends AppCompatActivity {
    ImageSwitcher image_switcher;
    int[] image = {R.drawable.four, R.drawable.three, R.drawable.six, R.drawable.five};
    int leng;
    int img_index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher);

        image_switcher = (ImageSwitcher) findViewById(R.id.image_switcher);

        //leng = image.length;  // no use of this

        image_switcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                return imageView;
            }
        });
        image_switcher.setImageResource(image[0]);

    }
    public void nextImageSwitcher(View view) {
        img_index = img_index + 1;
        if (img_index == image.length) {
            img_index = 0;
        }
        image_switcher.setImageResource(image[img_index]);
    }

    public void previousImageSwitcher(View view) {
        img_index = img_index - 1;
        if (img_index < 0) {
            img_index = image.length - 1;
        }
        image_switcher.setImageResource(image[img_index]);
    }


}