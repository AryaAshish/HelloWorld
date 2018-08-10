package com.dateyoureve.ashish.helloworld.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import com.dateyoureve.ashish.helloworld.materialcamera.internal.BaseCaptureActivity;
import com.dateyoureve.ashish.helloworld.materialcamera.internal.Camera2Fragment;


public class CaptureActivity2 extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return Camera2Fragment.newInstance();
  }
}
