package com.dateyoureve.ashish.helloworld.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import com.dateyoureve.ashish.helloworld.materialcamera.internal.BaseCaptureActivity;
import com.dateyoureve.ashish.helloworld.materialcamera.internal.CameraFragment;

public class CaptureActivity extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return CameraFragment.newInstance();
  }
}
