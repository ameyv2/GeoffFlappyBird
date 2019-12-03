package com.example.geoffflappybird;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;

public class GeoffFlappyView extends View {
    private Bitmap geoff;
    private Bitmap background;
    private Paint score = new Paint();
    public GeoffFlappyView(Context context) {
        super(context);
        geoff = BitmapFactory.decodeResource(getResources(), R.drawable.geoff);
        background = BitmapFactory.decodeResource(getResources(), R.drawable.siebel);
        score.setColor(Color.WHITE);
        score.setTextSize(70);
        score.setTypeface(Typeface.DEFAULT_BOLD);
        score.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(background, 0, 0, null);
        canvas.drawBitmap(geoff, 0, 0, null);
        canvas.drawText("Score: ", 20, 60, score);
    }
}
