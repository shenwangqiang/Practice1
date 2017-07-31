package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(2);
        canvas.drawLine(100,20,100,420,mPaint);

        canvas.drawLine(100,420,700,420,mPaint);

        mPaint.setTextSize(20);
        canvas.drawText("Froyo",130,440,mPaint);
        canvas.drawText("GB",210,440,mPaint);
        canvas.drawText("ICS",290,440,mPaint);
        canvas.drawText("JB",370,440,mPaint);
        canvas.drawText("KitKat",450,440,mPaint);
        canvas.drawText("L",540,440,mPaint);
        canvas.drawText("M",620,440,mPaint);

        mPaint.setTextSize(30);
        canvas.drawText("直方图",300,500,mPaint);

        mPaint.setColor(Color.GREEN);
        canvas.drawRect(110,400,180,420,mPaint);
        canvas.drawRect(190,300,260,420,mPaint);
        canvas.drawRect(270,200,340,420,mPaint);
        canvas.drawRect(350,100,420,420,mPaint);
        canvas.drawRect(430,150,500,420,mPaint);
        canvas.drawRect(510,230,580,420,mPaint);
        canvas.drawRect(590,330,660,420,mPaint);
    }
}
