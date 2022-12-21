package cn.mtwb.android;

import static android.content.Context.VIBRATOR_SERVICE;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.json.JSONException;
import org.json.JSONObject;

public class Tools {

    Context ctx;
    public Tools() {
//        Context _ctx, Object payload
//        ctx = _ctx;
    }

    public JSONObject sendSOS(@NonNull Context ctx) {
        return this.sendSOS(ctx,null);
    }
    public JSONObject sendSOS(@NonNull Context ctx, @Nullable Object payload) {

        ((Vibrator) ctx.getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(200,255));
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((Vibrator) ctx.getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(200,255));
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((Vibrator) ctx.getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(200,255));
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((Vibrator) ctx.getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(1000,255));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((Vibrator) ctx.getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(1000,255));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((Vibrator) ctx.getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(1000,255));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((Vibrator) ctx.getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(200,255));
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((Vibrator) ctx.getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(200,255));
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((Vibrator) ctx.getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(200,255));
        String str = "{success:true}";
        JSONObject obj = null;
        try {
            obj = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
