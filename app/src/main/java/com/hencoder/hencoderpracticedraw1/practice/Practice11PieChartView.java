package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        mPaint.setColor(Color.RED);
        canvas.drawArc(180,30,580,430,180,120,true,mPaint);

        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(200,50,600,450,300,58,true,mPaint);

        mPaint.setColor(Color.CYAN);
        canvas.drawArc(200,50,600,450,0,8,true,mPaint);

        mPaint.setColor(Color.GRAY);
        canvas.drawArc(200,50,600,450,10,18,true,mPaint);

        mPaint.setColor(Color.GREEN);
        canvas.drawArc(200,50,600,450,30,18,true,mPaint);

        mPaint.setColor(Color.BLUE);
        canvas.drawArc(200,50,600,450,50,28,true,mPaint);

        mPaint.setColor(Color.WHITE);
        canvas.drawArc(200,50,600,450,80,98,true,mPaint);
    }
}
